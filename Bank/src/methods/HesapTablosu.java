/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

 public class HesapTablosu {
     
     
     
       static String url = "jdbc:postgresql://localhost:5432/dburun";
    static Connection baglanti = null;
    static ResultSet resultSet = null;


 static   ArrayList<HesapTablosu> hareketler = new ArrayList<>();


     
     String tarih ;
               String aciklama;
                  int miktar;
                    int bakiye;

    public HesapTablosu() {
    }
    

    public HesapTablosu(String tarih, String aciklama, int miktar, int bakiye) {
        this.tarih = tarih;
        this.aciklama = aciklama;
        this.miktar = miktar;
        this.bakiye = bakiye;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    public String getTarih() {
        return tarih;
    }

    public String getAciklama() {
        return aciklama;
    }

    public int getMiktar() {
        return miktar;
    }

    public int getBakiye() {
        return bakiye;
    }
    
    
    
    
    public static ArrayList<HesapTablosu> getHesapHareketleri(int kullanici_id) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            // Veritabanı bağlantısını oluştur
            connection = DriverManager.getConnection(url, "postgres", "123456");

            // SQL sorgusunu oluştur
            String sql = "SELECT * FROM hesap_hareketleri WHERE kullanici_id = ?";

            // SQL sorgusunu çalıştır
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, kullanici_id);
            resultSet = preparedStatement.executeQuery();

            // Verileri işle
            while (resultSet.next()) {
                String tarih = resultSet.getString("hareket_date");
                String aciklama = resultSet.getString("aciklama");
                int miktar = resultSet.getInt("miktar");
                int bakiye = resultSet.getInt("bakiye");

                HesapTablosu hareket = new HesapTablosu(tarih, aciklama, miktar, bakiye);
                hareketler.add(hareket);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Bağlantıyı ve diğer kaynakları kapat
            try {
                if (resultSet != null)
                    resultSet.close();
                if (preparedStatement != null)
                    preparedStatement.close();
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return hareketler;
    }
    
    
    
     public static void ekleHesapHareketi(int kullanici_id,String hareket_date,String aciklama,int miktar,int bakiye) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            // Veritabanı bağlantısını oluştur
            connection = DriverManager.getConnection(url, "postgres", "123456");
            // SQL sorgusunu oluştur
            String sql = "INSERT INTO hesap_hareketleri (kullanici_id,hareket_date,aciklama,miktar,bakiye) VALUES (?, ?, ?,?,?)";
            // PreparedStatement oluştur
            preparedStatement = connection.prepareStatement(sql);
            // Değerleri ata
            preparedStatement.setInt(1, kullanici_id);
            preparedStatement.setString(2, hareket_date);
            preparedStatement.setString(3, aciklama);
  preparedStatement.setInt(4, miktar);
    preparedStatement.setInt(5, bakiye);
       
    // SQL sorgusunu çalıştır
            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Hesap hareketi başarıyla eklendi.");
            } else {
                System.out.println("Hesap hareketi eklenirken bir hata oluştu.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Bağlantıyı ve diğer kaynakları kapat
            try {
                if (preparedStatement != null)
                    preparedStatement.close();
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
                   
                   
                   
}
