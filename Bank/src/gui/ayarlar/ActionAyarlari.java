package gui.ayarlar;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class ActionAyarlari {

    public static void setVisible(JFrame oldFrame, JFrame newFrame) {
        oldFrame.setVisible(false);//kapatılacak olan sayfa 
        newFrame.setVisible(true);//açılacak olan sayfa 
    }
    public static void secondSetVisible(JFrame newFrame) {
        newFrame.setVisible(true);
    }
    public static void SETVİSİBLE(JFrame oldFrame) {
        oldFrame.setVisible(false);
    }

}
