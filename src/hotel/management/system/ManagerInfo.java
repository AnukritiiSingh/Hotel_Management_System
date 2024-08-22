
/**
 *
 * @author anukriti singh
 */
package hotel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*; 
import net.proteanit.sql.*;
public class ManagerInfo extends JFrame implements ActionListener{
    
    JTable t1;
    JButton b1,b2;
    ManagerInfo(){
        t1 = new JTable();
        t1.setBounds(0,40,1200,469);
        add(t1);
        
       JLabel l1 = new JLabel("NAME");
       l1.setBounds(40,10,70,20);
        l1.setFont(new Font("Tahoma",Font.BOLD,14));
        l1.setForeground(Color.BLUE);
        add(l1);
        
        
        JLabel l2 = new JLabel("AGE");
        l2.setBounds(200,10,70,20);
         l2.setFont(new Font("Tahoma",Font.BOLD,14));
         l2.setForeground(Color.BLUE);
        add(l2);
        
       JLabel l3 = new JLabel("GENDER");
        l3.setBounds(340,10,70,20);
        l3.setFont(new Font("Tahoma",Font.BOLD,14));
          l3.setForeground(Color.BLUE);
        add(l3);
        
        JLabel l4 = new JLabel("JOB");
        l4.setBounds(500,10,70,20);
         l4.setFont(new Font("Tahoma",Font.BOLD,14));
          l4.setForeground(Color.BLUE);
        add(l4);
        
        JLabel l5 = new JLabel("SALARY");
        l5.setBounds(640,10,70,20);
        l5.setFont(new Font("Tahoma",Font.BOLD,14));
        l5.setForeground(Color.BLUE);
        add(l5);
        
        JLabel l6 = new JLabel("PHONE");
        l6.setBounds(805,10,70,20);
         l6.setFont(new Font("Tahoma",Font.BOLD,14));
         l6.setForeground(Color.BLUE);
        add(l6);
        
        JLabel l7 = new JLabel("AADHAR");
        l7.setBounds(930,10,70,20);
        l7.setFont(new Font("Tahoma",Font.BOLD,14));
        l7.setForeground(Color.BLUE);
        add(l7);
        
        JLabel l8 = new JLabel("EMAIL");
        l8.setBounds(1100,10,70,20);
        l8.setFont(new Font("Tahoma",Font.BOLD,14));
        l8.setForeground(Color.BLUE);
        add(l8);
        
        b1 = new JButton("LOAD DATA");
        b1.setBounds(400,515,120,30);
        b1.addActionListener(this);
        b1.setFont(new Font("Tahoma",Font.BOLD,14));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        add(b1);
        
        b2 = new JButton("BACK");
        b2.setBounds(600,515,120,30);
        b2.addActionListener(this);
        b2.setFont(new Font("Tahoma",Font.BOLD,15));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        add(b2);
        
        
        
        setLayout(null);
        setBounds(50,70,1200,590);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
         if(ae.getSource() == b1){
          try{
              conn c = new conn();
              String str = "select * from employee where job ='Manager'";
              ResultSet rs = c.s.executeQuery(str);
              t1.setModel(DbUtils.resultSetToTableModel(rs));
          }catch(Exception e){
              
          }
         }else if(ae.getSource() == b2){
             new Reception().setVisible(true);
             this.setVisible(false);
         }
    }
    public static void main(String[] args){
        new ManagerInfo().setVisible(true);
    }
}
