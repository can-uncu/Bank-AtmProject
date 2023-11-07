package gui;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.sql.Statement;



import java.util.logging.Level;
import java.util.logging.Logger;








public class DbConnection {

    static String url = "jdbc:postgresql://localhost:5432/dburun";
    static Connection baglanti = null;
    static ResultSet resultSet = null;
                       
    

      //   ArrayList<String[]> veriler = new ArrayList<>();
     
       //static    ArrayList<Object[]> data = new ArrayList<>();
        
        
     /*   public static void getHesapHareketleri() {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Veritabanı bağlantısını oluştur
            connection = DriverManager.getConnection(url, "postgres", "123456");

            // SQL sorgusunu oluştur
            String sql = "SELECT * FROM hesap_hareketleri where kullanici_id = ? ";
            
              PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, GirisEkrani.kullanici_id); // kullaniciId değişkenini kullanıcıya göre ayarlayın
        
        resultSet = preparedStatement.executeQuery();
        
            resultSet = statement.executeQuery(sql);
    
            // Verileri işle
            while (resultSet.next()) {
                
             
                    
                
                 tarih = resultSet.getString("hareket_date");
                 
                 aciklama = resultSet.getString("aciklama");
                 
                 miktar = resultSet.getInt("miktar");
                 bakiye  = resultSet.getInt("bakiye");

             data.add(new Object[]{tarih,aciklama,miktar,bakiye});

                 
                
           
       //    database a =new database(tarih, aciklama, miktar, bakiye);
           
     //      stringList.add(a);
           
                 
                 

            
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Bağlantıyı ve diğer kaynakları kapat
            try {
                if (resultSet != null)
                    resultSet.close();
                if (statement != null)
                    statement.close();
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    */
                    
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
    
    
    
    
    




    static void baglan() {

        try {
            baglanti = DriverManager.getConnection(url, "postgres", "123456");
            System.out.println("BAĞLANTI GERÇEKLEŞTİİİ");
            Statement state = baglanti.createStatement();
            // state.executeUpdate(s); // veri tabanına kayıt eklemek içinnn */

        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(" BAĞLANTI BAŞARISIZZZ");

        }

    }

    static void baglann(String s) {

        try {
            baglanti = DriverManager.getConnection(url, "postgres", "123456");

            try {
                Class.forName("org.postgresql.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
            }

            System.out.println("BAĞLANTI GERÇEKLEŞTİİİ");
            Statement state = baglanti.createStatement();
            state.executeUpdate(s); // veri tabanına kayıt eklemek içinnn */

        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(" BAĞLANTI BAŞARISIZZZ");

        }

    }

    public static void paraGonder(String gonderenKisi, String aliciKisi, int miktar) {
        try {

            baglanti = DriverManager.getConnection(url, "postgres", "123456");
            Class.forName("org.postgresql.Driver");

            String gonderenSql = "UPDATE hesap SET bakiye = bakiye - ? WHERE kullanici_id = ?";
            PreparedStatement gonderenStatement = baglanti.prepareStatement(gonderenSql);
            gonderenStatement.setInt(1, miktar);
            gonderenStatement.setString(2, gonderenKisi);
            int gonderenEtkilenenSatir = gonderenStatement.executeUpdate();

            if (gonderenEtkilenenSatir > 0) {
                String aliciSql = "UPDATE hesaplar SET bakiye = bakiye + ? WHERE kullanici_id = ?";
                PreparedStatement aliciStatement = baglanti.prepareStatement(aliciSql);
                aliciStatement.setInt(1, miktar);
                aliciStatement.setString(2, aliciKisi);
                int aliciEtkilenenSatir = aliciStatement.executeUpdate();

                if (aliciEtkilenenSatir > 0) {
                    System.out.println("Para gönderme işlemi başarılı.");
                } else {
                    System.out.println("Para alma işlemi başarısız.");
                }
            } else {
                System.out.println("Para gönderme işlemi başarısız.");
            }

            gonderenStatement.close();
            baglanti.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void main(String[] args) {
        
    }
    
    
    
    
    

}
