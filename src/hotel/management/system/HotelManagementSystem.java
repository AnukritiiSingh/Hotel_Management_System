w

package hotel.management.system;

/**
 *
 * @=+author anukriti singh 
 */
import java.awt.*;
import javax .swing.*;
import java.awt.event.*;
public class HotelManagementSystem extends JFrame implements ActionListener{
  HotelManagementSystem(){
    setSize(1300,680);
    setLocation(0,0);
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/first1.jpg"));
  JLabel l1 = new JLabel(i1);
 l1.setBounds(0,0,1300,600);
 add(l1);
 
 JLabel l2 = new JLabel("Hotel Management System..");
 l2.setBounds(100,230,1000,600);
 l2.setForeground(Color.white);
 l2.setFont(new Font("serif", Font.PLAIN, 80));
 l1.add(l2);
 JButton b1 = new JButton("Next");
 b1.setBackground(Color.red);
 b1.setForeground(Color.BLACK);
 b1.setBounds(1100,540,130,50);
 b1.setFont(new Font("serif", Font.PLAIN, 25));
 b1.addActionListener(this);
 l1.add(b1);
 
 setLayout(null);
setVisible(true);
 
 while(true){
     l2.setVisible(false);
     try{
     Thread.sleep(500);
     }catch(Exception e){
        
     }
     l2.setVisible(true);
     try{
     Thread.sleep(600);
     } catch(Exception e){}
        
    
 }
 
  }
    public void actionPerformed(ActionEvent ae){
    new Login().setVisible(true);
    this.setVisible(false);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        new HotelManagementSystem();
        
    }
    
}
