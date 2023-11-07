/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class database {

    String tarih, aciklama;
    int miktar, bakiye;

    public database(String tarih, String aciklama, int miktar, int bakiye) {
        this.tarih = tarih;
        this.aciklama = aciklama;
        this.miktar = miktar;
        this.bakiye = bakiye;

    }

    // BU SINIF HESAP EKRANINDA VE DİĞER EKRANLARDA BAKİYE BİLGİSİNİ VERİTABANINDAN ALMAK İÇİN OLUŞTURULMUŞTUR
    public static int getBakiyeFromDatabase(int hesapId) {
        int bakiye = 0;
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        String url = "jdbc:postgresql://localhost:5432/dburun";

        try {
            try {
                // Veritabanı bağlantısı kurma
                Class.forName("org.postgresql.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
            }
            connection = DriverManager.getConnection(url, "postgres", "123456");

            // SQL sorgusu hazırlama
            String sql = "SELECT bakiye FROM hesap WHERE kullanici_id = ?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1, hesapId);

            // Sorguyu çalıştırma ve sonuç kümesini alın
            resultSet = statement.executeQuery();

            // Sonuç kümesinden integer değeri çekme
            if (resultSet.next()) {
                bakiye = resultSet.getInt("bakiye");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Kapatma işlemleri
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return bakiye;
    }

    public static int[] getFaturaFromDatabase(int hesapId) {

        int fatura[] = new int[4];

        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        String url = "jdbc:postgresql://localhost:5432/dburun";
        int elektrik_fat = 0;
        int su_fat = 0;
        int dogalgaz_fat = 0;
        int int_fat = 0;
        try {
            try {
                // Veritabanı bağlantısı kurma
                Class.forName("org.postgresql.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
            }
            connection = DriverManager.getConnection(url, "postgres", "123456");

            // SQL sorgusu hazırlama
            String sql = "SELECT * FROM faturalar WHERE kullanici_id = ?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1, hesapId);

            // Sorguyu çalıştırma ve sonuç kümesini alın
            resultSet = statement.executeQuery();

            // Sonuç kümesinden integer değeri çekme
            if (resultSet.next()) {
                elektrik_fat = resultSet.getInt("elektrik_fat");
                su_fat = resultSet.getInt("su_fat");
                dogalgaz_fat = resultSet.getInt("dogalgaz_fat");
                int_fat = resultSet.getInt("int_fat");

                fatura[0] = elektrik_fat;
                fatura[1] = su_fat;
                fatura[2] = dogalgaz_fat;
                fatura[3] = int_fat;

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Kapatma işlemleri
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return fatura;

    }

    public static String getNameFromDatabase(int hesapId) {
        String name = "";

        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        String url = "jdbc:postgresql://localhost:5432/dburun";

        try {
            try {
                // Veritabanı bağlantısı kurma
                Class.forName("org.postgresql.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
            }
            connection = DriverManager.getConnection(url, "postgres", "123456");

            // SQL sorgusu hazırlama
            String sql = "SELECT ad_soyad FROM kullanicilar WHERE kullanici_id = ?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1, hesapId);

            // Sorguyu çalıştırma ve sonuç kümesini alın
            resultSet = statement.executeQuery();

            // Sonuç kümesinden integer değeri çekme
            if (resultSet.next()) {
                name = resultSet.getString("ad_soyad");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Kapatma işlemleri
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return name;
    }

    public static void closeAllFramesExceptOne(JFrame frameToKeepOpen) {

        ArrayList<JFrame> openFrames = new ArrayList<>();

        for (JFrame frame : openFrames) {
            if (frame != frameToKeepOpen) {
                frame.dispose();
            }
        }
        openFrames.clear();
        openFrames.add(frameToKeepOpen);
    }

    public static void main(String[] args) {

    }

}
