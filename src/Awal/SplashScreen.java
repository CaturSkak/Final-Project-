
package Awal;
import Login.Login;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import javax.swing.Timer;
import javax.swing.border.LineBorder;
/**
 *
 * @author Ahmad Catur Yulianto
 */

public class SplashScreen extends JWindow {
    private Dimension dimensi=Toolkit.getDefaultToolkit().getScreenSize();
    private JLabel lblLogo=new JLabel (new ImageIcon ("C:\\Users\\ASPIRE E14\\Documents\\NetBeansProjects\\Final Project\\Logo Atika2.png"));
    private JProgressBar barisProgres = new JProgressBar();
    private int time = 0;
    private Timer timer;
    //Deklarasi konstruktor
public SplashScreen () {
    //Menyiapkan variabel warna
    Color Warna = Color.black;
    //Mengatur baris program
    barisProgres.setValue(0);
    barisProgres.setPreferredSize(new Dimension (500,20));
    barisProgres.setBackground(Color.BLACK);
    barisProgres.setForeground(Color.RED);
    barisProgres.setStringPainted(true);
    
    //Mengatur warna garis pinggir 
    barisProgres.setBorder(new LineBorder (Warna,1));
    lblLogo.setBorder (new LineBorder (Warna,1));
    
    //Meletakan objek ke kontainer
    getContentPane().add(lblLogo,BorderLayout.NORTH);
    getContentPane().add(barisProgres,BorderLayout.CENTER);
    
    //Mengatur lawa window logo tampil pada layar monitor
    timer = new Timer (50,new ActionListener(){
        public void actionPerformed (ActionEvent evt){
            time++;
            barisProgres.setValue (time);
            if(barisProgres.getPercentComplete()==1.0){
                timer.stop();
                setVisible(false);
                new Login().setVisible(true);
                //menjalankan menu utama
                //new Menu_Utama
            }
        }
        
    });
    timer.start();
    //Menempatkan objek ke memori sebelum ditampilkan
    pack();
    //Mengatur lokasi window tepat di tengah layar monitor
    setLocation(dimensi.width/2-getWidth()/2,dimensi.height/2-getHeight()/2);
    //Menempatkan window ke layar monitor
    show ();
}
 //deklarasi metode utama
public static void main(String [] args){
    new SplashScreen();
}

}


