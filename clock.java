package mypackage;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class clock extends Thread implements KeyListener  
{JFrame jf;
    JLabel jl,jl1;
    JButton jb;
    Date d,d1;
    SimpleDateFormat format,format1;
    int bounds;
    String s,s1;
    clock(){
        jf=new JFrame("My Window");
        jf.setSize(500,500);
        jf.setVisible(true);
        jf.setLayout(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       jl=new JLabel();
       bounds=10;
        jl.setBounds(bounds, 100, 400, 30);
        jf.add(jl);
        jl.setFont( new Font("Arial",Font.BOLD,30));
       jl.addKeyListener(this);
}
//@Override
  public  void run(){
     while(true){
         d=new Date();
         format =new SimpleDateFormat("E,MM/dd/YYYY  hh:mm:ss");
     s=format.format(d);
     jl.setText(s);
     
     }
        
    }
    
    public static void main(String arg[]){
       clock t= new clock();
       t.start();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
    switch(e.getKeyCode()) {
        case KeyEvent.VK_LEFT:{
        bounds+=40;
        jl.setBounds(bounds, 100, 400, 30);
        break;}
    }  
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    
}
