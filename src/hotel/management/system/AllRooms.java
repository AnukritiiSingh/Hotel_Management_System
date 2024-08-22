


package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import net.proteanit.sql.*;
/**
 *
 * @author anukriti singh
 */
public class AllRooms extends JFrame implements ActionListener{
    JTable table;
    JButton back;
    AllRooms(){
        
        getContentPane().setBackground(Color.WHITE);
         setLayout(null);
         
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/10th.jpg"));
        Image i2 = i1.getImage().getScaledInstance(400, 600, Image.SCALE_DEFAULT);
     ImageIcon i3 = new ImageIcon(i2);
     JLabel image = new JLabel(i3);
     image.setBounds(590,0,400,550);
     add(image);
     
    
     JLabel l1 = new JLabel("Room No");
        l1.setBounds(10,20,70,20);
        l1.setFont(new Font("Tahoma",Font.BOLD,14));
        l1.setForeground(Color.BLUE);
        add(l1);
         
       JLabel l2 = new JLabel("Avalability");
        l2.setBounds(120,20,70,20);
        l2.setFont(new Font("Tahoma",Font.BOLD,14));
        l2.setForeground(Color.BLUE);
        add(l2);
        
        JLabel l3 = new JLabel("Status");
        l3.setBounds(250,20,70,20);
        l3.setFont(new Font("Tahoma",Font.BOLD,14));
        l3.setForeground(Color.BLUE);
        add(l3);
        
        JLabel l4 = new JLabel("Price");
        l4.setBounds(380,20,70,20);
        l4.setFont(new Font("Tahoma",Font.BOLD,16));
        l4.setForeground(Color.BLUE);
        add(l4);
        
        JLabel l5 = new JLabel("Bed Type");
        l5.setBounds(495,20,70,20);
        l5.setFont(new Font("Tahoma",Font.BOLD,14));
        l5.setForeground(Color.BLUE);
        add(l5);
        
        
     
     
     table = new JTable();
     table.setBounds(0,60,600,400);
     add(table);
     
     try {
        conn c = new conn();
      ResultSet rs = c.s.executeQuery("select * from room");
      table.setModel(DbUtils.resultSetToTableModel(rs));
     }catch (Exception e){
        e.printStackTrace();
    }
    back = new JButton("Back");
      back.setBackground(Color.BLACK);
     back.setForeground(Color.WHITE);
      back.addActionListener(this);  
      back.setFont(new Font("Tahoma",Font.BOLD,15));
      back.setBounds(225,475,130,30);
      add(back);
      
    /*  back = new JButton("Back");
      back.setBackground(Color.BLACK);
     back.setForeground(Color.WHITE);
      back.addActionListener(this);  
      back.setFont(new Font("Tahoma",Font.BOLD,15));
      back.setBounds(200,400,130,30);
      add(back);*/
     /* 
       back = new JButton("Back");
      back.setBackground(Color.BLACK);
     back.setForeground(Color.WHITE);
      back.addActionListener(this);  
      back.setFont(new Font("Tahoma",Font.BOLD,15));
      back.setBounds(300,440,150,30);
      add(back */
        
        setBounds(200,140,1000,560);
      setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Reception();
    }

public static void main(String[] args)
{
  new AllRooms();
}
