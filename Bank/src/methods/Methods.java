package methods;

import gui.DbConnection;
import gui.GirisEkrani;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static methods.HesapTablosu.hareketler;

public class Methods {

    public static void TabloyaSatirYaz(JTable tablo) {
        HesapTablosu.getHesapHareketleri(GirisEkrani.kullanici_id);

        DefaultTableModel model = (DefaultTableModel) tablo.getModel();
// ilk 5 hareketi tabloya yazıyor 
        int satirSayisi = Math.min(hareketler.size(), 5);
        for (int i = 0; i < satirSayisi; i++) {
            HesapTablosu hareket = hareketler.get(i);
            Object[] row = {hareket.getTarih(), hareket.getAciklama(), hareket.getMiktar(), hareket.getBakiye()};
            model.addRow(row);
        }

    }

    public static void ALLTabloyaYaz(JTable tablo) {

        HesapTablosu.getHesapHareketleri(GirisEkrani.kullanici_id);

        DefaultTableModel model = (DefaultTableModel) tablo.getModel();

        for (HesapTablosu hareket : HesapTablosu.hareketler) {

            Object[] row = {hareket.getTarih(), hareket.getAciklama(), hareket.getMiktar(), hareket.getBakiye()};

            model.addRow(row);

        }
        hareketler.clear();

    }

    private static void updateBakiye(Connection conn, int kullaniciID, int yeniBakiye) throws SQLException {
        // Sorguyu hazırlama
        String query = "UPDATE hesap SET bakiye = ? WHERE kullanici_id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, yeniBakiye);
            stmt.setInt(2, kullaniciID);

            // Sorguyu çalıştırma
            stmt.executeUpdate();
        }
    }

    private static int getMevcutBakiye(Connection conn, int kullaniciID) throws SQLException {
        int mevcutBakiye = 0;

        // Sorguyu hazırlama
        String query = "SELECT bakiye FROM hesap WHERE kullanici_id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, kullaniciID);

            // Sorguyu çalıştırma ve sonuç kümesini alınması
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    mevcutBakiye = rs.getInt("bakiye");
                }
            }
        }

        return mevcutBakiye;
    }

    public static void ode(int kullaniciID, int faturaTutari) {
        // Veritabanı bağlantısı kurma
        try (Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/dburun", "postgres", "123456")) {
            // Kullanıcının mevcut bakiyesini al
            int mevcutBakiye = getMevcutBakiye(conn, kullaniciID);

            // Fatura tutarını kontrol et
            if (faturaTutari > mevcutBakiye) {
                JOptionPane.showMessageDialog(null, "Yetersiz bakiye. Fatura ödemesi yapılamadı.");
                return;
            }

            // Yeni bakiye hesaplama
            int yeniBakiye = mevcutBakiye - faturaTutari;

            // Bakiyeyi güncelleme
            updateBakiye(conn, kullaniciID, yeniBakiye);

            JOptionPane.showMessageDialog(null, "Fatura ödemesi başarıyla tamamlandı. Yeni bakiye: " + yeniBakiye);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void elektrikFaturaGuncelle(int faturaID, int yeniTutar) {
        try {
            // Veritabanı bağlantısı kurma
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/dburun", "postgres", "123456");

            // Güncelleme sorgusunu hazırlama
            String query = "UPDATE faturalar SET elektrik_fat = ? WHERE kullanici_id = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setDouble(1, yeniTutar);
            stmt.setInt(2, faturaID);

            // Sorguyu çalıştırma
            int rowsAffected = stmt.executeUpdate();

            // Güncelleme başarılıysa mesajı gösterme
            if (rowsAffected > 0) {
                System.out.println("Elektrik fatura güncelleme işlemi başarıyla tamamlandı.");
            } else {
                System.out.println("Belirtilen fatura bulunamadı.");
            }

            // Kaynakları serbest bırakma
            stmt.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void suFaturaGuncelle(int faturaID, int yeniTutar) {
        try {
            // Veritabanı bağlantısı kurma
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/dburun", "postgres", "123456");

            // Güncelleme sorgusunu hazırlama
            String query = "UPDATE faturalar SET su_fat = ? WHERE kullanici_id = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setDouble(1, yeniTutar);
            stmt.setInt(2, faturaID);

            // Sorguyu çalıştırma
            int rowsAffected = stmt.executeUpdate();

            // Güncelleme başarılıysa mesajı gösterme
            if (rowsAffected > 0) {
                System.out.println("su fatura güncelleme işlemi başarıyla tamamlandı.");
            } else {
                System.out.println("Belirtilen fatura bulunamadı.");
            }

            // Kaynakları serbest bırakma
            stmt.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void dogalgazFaturaGuncelle(int faturaID, int yeniTutar) {
        try {
            // Veritabanı bağlantısı kurma
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/dburun", "postgres", "123456");

            // Güncelleme sorgusunu hazırlama
            String query = "UPDATE faturalar SET dogalgaz_fat = ? WHERE kullanici_id = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setDouble(1, yeniTutar);
            stmt.setInt(2, faturaID);

            // Sorguyu çalıştırma
            int rowsAffected = stmt.executeUpdate();

            // Güncelleme başarılıysa mesajı gösterme
            if (rowsAffected > 0) {
                System.out.println("dogalgaz fatura güncelleme işlemi başarıyla tamamlandı.");
            } else {
                System.out.println("Belirtilen fatura bulunamadı.");
            }

            // Kaynakları serbest bırakma
            stmt.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void internetFaturaGuncelle(int faturaID, int yeniTutar) {
        try {
            // Veritabanı bağlantısı kurma
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/dburun", "postgres", "123456");

            // Güncelleme sorgusunu hazırlama
            String query = "UPDATE faturalar SET int_fat = ? WHERE kullanici_id = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setDouble(1, yeniTutar);
            stmt.setInt(2, faturaID);

            // Sorguyu çalıştırma
            int rowsAffected = stmt.executeUpdate();

            // Güncelleme başarılıysa mesajı gösterme
            if (rowsAffected > 0) {
                System.out.println("internet fatura güncelleme işlemi başarıyla tamamlandı.");
            } else {
                System.out.println("Belirtilen fatura bulunamadı.");
            }

            // Kaynakları serbest bırakma
            stmt.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void bakiyeGuncelle(int kullaniciTC, int yeniBakiye) {
        try {
            Connection baglanti = DriverManager.getConnection("jdbc:postgresql://localhost:5432/dburun", "postgres", "123456");
            String sql = "UPDATE hesap SET bakiye = ? WHERE kullanici_id = ?";
            PreparedStatement preparedStatement = baglanti.prepareStatement(sql);
            preparedStatement.setInt(1, yeniBakiye);
            preparedStatement.setInt(2, kullaniciTC);
            int etkilenenSatir = preparedStatement.executeUpdate();
            if (etkilenenSatir > 0) {
                System.out.println("Bakiye güncelleme işlemi başarılı.");
            } else {
                System.out.println("Bakiye güncelleme işlemi başarısız.");
            }
            preparedStatement.close();
            baglanti.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static int getKullaniciID(String kullaniciTC) {
        int kullaniciID = -1;

        try {
            Connection baglanti = DriverManager.getConnection("jdbc:postgresql://localhost:5432/dburun", "postgres", "123456");

            String sql = "SELECT kullanici_id FROM kullanicilar WHERE tc_no = ?";
            PreparedStatement preparedStatement = baglanti.prepareStatement(sql);
            preparedStatement.setString(1, kullaniciTC);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                kullaniciID = resultSet.getInt("kullanici_id");
            }

            resultSet.close();
            preparedStatement.close();
            baglanti.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (kullaniciID != -1) {
            System.out.println("Kullanıcı ID'si: " + kullaniciID);
        } else {
            System.out.println("Kullanıcı bulunamadı.");
        }

        return kullaniciID;
    }

    public static void main(String[] args) {

    }
}
