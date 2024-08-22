/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.management.system;

/**
 *
 * @author anukriti singh
 */
import javax.swing.*;
import java.awt.*;
import java.sql.*;
public class Checkout extends JFrame{
   
    
    
   Choice customer;
    Checkout() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
       
        JLabel text = new JLabel("Checkout");
        text.setBounds(150,10,100,20);
         text.setFont(new Font("Tahoma",Font.BOLD,20));
         text.setForeground(Color.BLUE);
        add(text);
      
        JLabel lblid = new JLabel("Customer Id");
        lblid.setBounds(50,50,100,30);
        lblid.setFont(new Font("Tahoma",Font.BOLD,16));
        add(lblid);
         customer = new Choice();
         customer.setBounds(165,55,200,25);
         add(customer);
         try{
          conn c = new conn();
          ResultSet rs = c.s.executeQuery("select * from customer");
          while (rs.next())
          {
              customer.add(rs.getString("number"));
          }
         } catch(Exception e){
             e.printStackTrace();
         }
        
        
 ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/11th.png"));
      Image i2= i1.getImage().getScaledInstance(500, 400,Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel tick = new JLabel(i3);
     tick.setBounds(300,55,150,25);
       add(tick);
       
       JLabel lblroom = new JLabel("Room Number");
        lblroom.setBounds(50,150,130,30);
        lblroom.setFont(new Font("Tahoma",Font.BOLD,16));
        add(lblroom);
        
        JLabel lblcheckin = new JLabel("Checkin Time");
        lblcheckin.setBounds(50,50,100,30);
        lblcheckin.setFont(new Font("Tahoma",Font.BOLD,16));
        add(lblcheckin);
 
 setBounds(250,140,935,515);
        setVisible(true);
    }
        
    public static void main(String[] args)
    {
       new Checkout() ;
    }
}
