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
public class Department extends JFrame implements ActionListener{
    JTable table;
    JButton back;
    Department(){
        
        getContentPane().setBackground(Color.WHITE);
         setLayout(null);
         
      /* ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/10th.jpg"));
       */ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/seven2.jpg"));
         
         Image i2 = i1.getImage().getScaledInstance(400, 500, Image.SCALE_DEFAULT);
     ImageIcon i3 = new ImageIcon(i2);
     JLabel image = new JLabel(i3);
     image.setBounds(475,0,400,550);
     add(image);
     
    
     JLabel l1 = new JLabel("DEPARTMENT");
        l1.setBounds(50,20,200,20);
        l1.setFont(new Font("Tahoma",Font.BOLD,18));
        l1.setForeground(Color.BLUE);
        add(l1);
         
       JLabel l2 = new JLabel("BUDGET");
        l2.setBounds(300,20,100,20);
        l2.setFont(new Font("Tahoma",Font.BOLD,18));
        l2.setForeground(Color.BLUE);
        add(l2);
        
        
        
        
        
        
     
     
     table = new JTable();
     table.setBounds(0,70,470,400);
     add(table);
     
     try {
        conn c = new conn();
      ResultSet rs = c.s.executeQuery("select * from department");
      table.setModel(DbUtils.resultSetToTableModel(rs));
     }catch (Exception e){
        e.printStackTrace();
    }
      back = new JButton("Back");
      back.setBackground(Color.BLACK);
     back.setForeground(Color.WHITE);
      back.addActionListener(this);  
      back.setFont(new Font("Tahoma",Font.BOLD,15));
      back.setBounds(200,475,130,30);
      add(back);
      
      
        
        setBounds(200,120,900,550);
      setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Reception();
    }

public static void main(String[] args)
{
  new Department();
}
}
