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
public class PickUp extends JFrame implements ActionListener{
    JTable table;
    JButton back,submit;
    Choice typeofcar;
    JCheckBox available;
    PickUp(){
        
        getContentPane().setBackground(Color.WHITE);
         setLayout(null);
         
       /*ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/10th.jpg"));
        Image i2 = i1.getImage().getScaledInstance(400, 600, Image.SCALE_DEFAULT);
     ImageIcon i3 = new ImageIcon(i2);
     JLabel image = new JLabel(i3);
     image.setBounds(590,0,400,550);
     add(image);*/
     
    JLabel text = new JLabel("Pickup service");
    text.setFont(new Font("Tahoma",Font.PLAIN,30));
    text.setBounds(400,20,400,30);
    text.setForeground(Color.red);
    add(text);
    
        
        JLabel lblbed = new JLabel(" Type Of Car ");
        lblbed.setBounds(10,100,130,20);
        lblbed.setFont(new Font("Tahoma",Font.BOLD,18));
         add(lblbed);
         
         typeofcar = new Choice();
         typeofcar.setBounds(150,100,200,25);
         add(typeofcar);
         try{
          conn c = new conn();
          ResultSet rs = c.s.executeQuery("select * from driver");
          while (rs.next())
          {
              typeofcar.add(rs.getString("brand"));
          }
         } catch(Exception e){
             e.printStackTrace();
         }
         
         
         
         
          JLabel l1 = new JLabel("Name");
        l1.setBounds(20,170,70,20);
        l1.setFont(new Font("Tahoma",Font.BOLD,17));
        l1.setForeground(Color.BLUE);
        add(l1);
         
       JLabel l2 = new JLabel("Age");
        l2.setBounds(200,170,70,20);
        l2.setFont(new Font("Tahoma",Font.BOLD,17));
        l2.setForeground(Color.BLUE);
        add(l2);
        
        JLabel l3 = new JLabel("Gender");
        l3.setBounds(320,170,70,20);
        l3.setFont(new Font("Tahoma",Font.BOLD,17));
        l3.setForeground(Color.BLUE);
        add(l3);
        
        JLabel l4 = new JLabel("Company");
        l4.setBounds(460,170,100,20);
        l4.setFont(new Font("Tahoma",Font.BOLD,17));
        l4.setForeground(Color.BLUE);
        add(l4);
        
        JLabel l5 = new JLabel("Brand");
        l5.setBounds(620,170,70,20);
        l5.setFont(new Font("Tahoma",Font.BOLD,17));
        l5.setForeground(Color.BLUE);
        add(l5);
        
       JLabel l6 = new JLabel("Availability");
        l6.setBounds(750,170,100,20);
        l6.setFont(new Font("Tahoma",Font.BOLD,17));
        l6.setForeground(Color.BLUE);
        add(l6);
        
        JLabel l7 = new JLabel("Locations");
        l7.setBounds(870,170,100,20);
        l7.setFont(new Font("Tahoma",Font.BOLD,17));
        l7.setForeground(Color.BLUE);
        add(l7);
        
        
     
     
     table = new JTable();
     table.setBounds(0,200,1000,200);
     add(table);
     
     try {
        conn c = new conn();
      ResultSet rs = c.s.executeQuery("select * from driver");
      table.setModel(DbUtils.resultSetToTableModel(rs));
     }catch (Exception e){
        e.printStackTrace();
    }
      back = new JButton("Back");
      back.setBackground(Color.BLACK);
     back.setForeground(Color.WHITE);
      back.addActionListener(this);  
      back.setFont(new Font("Tahoma",Font.BOLD,15));
      back.setBounds(350,450,130,30);
      add(back);
      
      submit = new JButton("Submit ");
      submit.setBackground(Color.BLACK);
     submit.setForeground(Color.WHITE);
      submit.addActionListener(this);  
      submit.setFont(new Font("Tahoma",Font.BOLD,15));
      submit.setBounds(150,450,130,30);
      add(submit );
      
      
        
        setBounds(200,140,1000,525);
      setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == submit)
        {
           try{
               String query = "select * from driver where brand = '"+typeofcar.getSelectedItem()+"'";
               
          conn conn = new conn();
          ResultSet rs;
              rs = conn.s.executeQuery(query);
            table.setModel(DbUtils.resultSetToTableModel(rs));
           } catch (Exception e){
               e.printStackTrace();
           }
        }else {
            setVisible(false);
        new Reception();
        }
        
    }

public static void main(String[] args)
{
  new PickUp();
}

    
}
    

