package methods;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Example {

    public static String encrypt(String plaintext) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(plaintext.getBytes());
            BigInteger no = new BigInteger(1, messageDigest);
            String hashText = no.toString(16);
            // Eksik sıfırları ekle
            while (hashText.length() < 32) {
                hashText = "0" + hashText;
            }

            return hashText;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static boolean controlPassword(String userInput, String storedPassword) {
        String userInputHash = encrypt(userInput);
        return userInputHash.equals(storedPassword);
    }

    public static void main(String[] args) {
        String plaintext = "frog";

        // Şifreleme
        String encryptedText = encrypt(plaintext);

        boolean f = controlPassword(plaintext, encryptedText);

        System.out.println("ŞİFRE DOĞRU MU ? :::" + f);
    }
}
