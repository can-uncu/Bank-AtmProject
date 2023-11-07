package gui.ayarlar;

import java.awt.Color;
import javax.swing.JButton;

public class ButtonAyarlari {

    //ARKA PLAN VE YAZI RENGİ AYARLARI
    private static Color orijinalrenk, originalFgColor;
    public static void setBgFg(JButton button, Color bgColor, Color fgColor) {
        orijinalrenk = button.getBackground();
        originalFgColor = button.getForeground();
        button.setBackground(bgColor);
        button.setForeground(fgColor);
    }
    public static void setOrijinalBgFg(JButton button) {
        button.setBackground(orijinalrenk);
        button.setForeground(originalFgColor);
    }

}
