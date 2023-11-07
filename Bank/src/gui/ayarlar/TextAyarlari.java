package gui.ayarlar;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class TextAyarlari {

    // TEXT ODAKLANMA  AYARLARI
    private static String originalText;
    private static Color originalFgColor;

    public static void degistirTextFocusGained(JTextField textField, String org) {
        originalText = org;
        if (textField.getText().trim().equals(org)) {
            originalFgColor = textField.getForeground();
            textField.setText("");
        }
        textField.setForeground(Color.BLUE);
    }

    public static void degistirTextFocusLost(JTextField textField) {
        if (textField.getText().trim().equals("")) {
            textField.setText(originalText);
            textField.setForeground(originalFgColor);
        } else {
            textField.setForeground(Color.BLACK);
        }
    }

    // KEY  AYARLARI (tc için  texttinde sadece sayıları yazan)
    public static void ayarlasadecesayi(JTextField textField) {
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume();
                }
          }

        });
    }
    public static void ayarlasadeceAlfabe(JTextField textField) {
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isAlphabetic(c) && c != ' ') {
                    e.consume();
                }
            }
        });
    }
    // TEXTDEKİ YAZILACAK KARAKTERLERİN LİMİTİNİ BELİRLEME
    // TC İÇİN 11 KARAKTER YETERLİDİR
    private static int limit;
    public static void ayarlaMaxLimit(JTextField textField, int lim) {
        limit = lim;
        textField.setDocument(new PlainDocument() {
            @Override
            public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
                if (str == null) {
                    return;
                }
                if ((getLength() + str.length()) <= limit) {
                    super.insertString(offs, str, a); //To change body of generated methods, choose Tools | Templates.
                }
            }
        }
        );
    }
    public static int checkTheTextKeyReleased(JTextField textField, int money) {
        String text = textField.getText();
        if (!text.equals("")) {//text doluysa
            int miktar = Integer.valueOf(text);
            if (miktar > 100000) {
                miktar = money;
                textField.setText(String.valueOf(miktar));
            }
            return miktar;
        }
        return 0;
    }

    public static int checkTheTextKeyReleasedd(JTextField textField, int money) {
        String text = textField.getText();
        if (!text.equals("")) {//text doluysa
            int miktar = Integer.valueOf(text);
            if (miktar > 5000) {
                miktar = money;
                textField.setText(String.valueOf(miktar));
            }
            return miktar;
        }
        return 0;
    }
}
