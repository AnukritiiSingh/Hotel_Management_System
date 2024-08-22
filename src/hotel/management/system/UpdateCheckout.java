/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hotel.management.system;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
//import java.awt.event.ActionEvent;
import java.sql.*;
//import java.util.jar.Attributes.Name;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author anukriti singh
 */
public class UpdateCheckout extends JFrame implements ActionListener{
  
    Choice customer;
    JTextField tfroom,tfname,tfcheckin,tfpaid,tfpending;
    JButton check,update,back;
    UpdateCheckout(){
        
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel text = new JLabel("Update Status");
        text.setFont(new Font("Tahoma",Font.PLAIN,30));
         text.setForeground(new Color(25, 25, 112));
        text.setBounds(120,20,200,30);
       // text.setBackground(Color.BLUE);
        add(text);
    
        JLabel lblid = new JLabel("Customer Id");
        lblid.setFont(new Font("Tahoma",Font.PLAIN,18));
        lblid.setBounds(40,100,150,30);
        lblid.setBackground(Color.BLUE);
        add(lblid);
        
        customer = new Choice();
        customer.setBounds(300,100,150,35);
        add(customer);
        
        try{
           conn c =new conn();
           ResultSet rs = c.s.executeQuery("select * from customer");
           while(rs.next()){
            customer.add(rs.getString("number"));
               
        }
           
        }catch(Exception e){
            e.printStackTrace();
        }
        
        JLabel lblroom = new JLabel("Room No");
        lblroom.setFont(new Font("Tahoma",Font.PLAIN,20));
        lblroom.setBounds(40,150,150,30);
        lblroom.setBackground(Color.BLUE);
        add(lblroom);
        
        tfroom = new JTextField();
        tfroom.setBounds(300,150,150,25);
        add(tfroom);
        
         JLabel lblname = new JLabel("Name");
        lblname.setFont(new Font("Tahoma",Font.PLAIN,20));
        lblname.setBounds(40,200,150,30);
        lblname.setBackground(Color.BLUE);
        add(lblname);
        
        tfname = new JTextField();
        tfname.setBounds(300,200,150,25);
        add(tfname);
        
         JLabel lblcheckin = new JLabel("Checkin Time");
        lblcheckin.setFont(new Font("Tahoma",Font.PLAIN,20));
        lblcheckin.setBounds(40,250,150,30);
        lblcheckin.setBackground(Color.BLUE);
        add(lblcheckin);
        
        tfcheckin = new JTextField();
        tfcheckin.setBounds(300,250,150,25);
        add(tfcheckin);
        
         JLabel lblpaid = new JLabel("Amount Paid");
        lblpaid.setFont(new Font("Tahoma",Font.PLAIN,20));
        lblpaid.setBounds(40,300,150,30);
        lblpaid.setBackground(Color.BLUE);
        add(lblpaid);
        
        tfpaid = new JTextField();
        tfpaid.setBounds(300,300,150,25);
        add(tfpaid);
        
         JLabel lblpending = new JLabel("Pending Amount");
        lblpending.setFont(new Font("Tahoma",Font.PLAIN,20));
        lblpending.setBounds(40,350,150,30);
        lblpending.setBackground(Color.BLUE);
        add(lblpending);
        tfpending = new JTextField();
        tfpending.setBounds(300,350,150,25);
        add(tfpending);
        
        check = new JButton("Check");
        check.setBackground(Color.BLACK);
        check.setForeground(Color.WHITE);
        check.setBounds(70,410,100,30);
        check.addActionListener(this);
        add(check);
        
        update = new JButton("Update");
        update.setBackground(Color.BLACK);
        update.setForeground(Color.WHITE);
        update.setBounds(200,410,100,30);
        update.addActionListener(this);
        add(update);
        
        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(340,410,100,30);
        back.addActionListener(this);
        add(back);
        
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/11th.png"));
         Image i2 = i1.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT);
         ImageIcon i3 = new ImageIcon(i2);
         JLabel image = new JLabel(i3);
         image.setBounds(480,20,400,500);
         add(image);
        
        
        
    setBounds(200,150,900,500);
    setVisible(true);
    }

    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource() == check){
    String id = customer.getSelectedItem();
      String query = "select * from customer where number = '"+id+"'";
      try{
          conn c = new conn();
          ResultSet rs= c.s.executeQuery(query);
          while(rs.next()){
              tfroom.setText(rs.getString("room"));
              tfname.setText(rs.getString("name"));
              tfcheckin.setText(rs.getString("checkintime"));
              tfpaid.setText(rs.getString("amountpaid"));
          }
          ResultSet rs2 = c.s.executeQuery("select * from room where room_number ='"+tfroom.getText()+"'");
    while(rs2.next()){
        String price = rs2.getString("price");
        int amountPaid = Integer.parseInt(price)- Integer.parseInt(tfpaid.getText());
        tfpending.setText("" + amountPaid);
    }
      
      }catch(Exception e){
         e.printStackTrace();
      }
            }else if(ae.getSource()== update){
                String number = customer.getSelectedItem();
                String room = tfroom.getText();
                String name = tfname.getText();
                String checkin = tfcheckin.getText();
                 String deposit = tfpaid.getText();
                
                 
                    try {
                         conn c = new conn();
                        c.s.executeUpdate("update customer set room ='"+room+"',name='"+name+"',checkintime='"+checkin+"',deposit='"+deposit+"'");
                   JOptionPane.showMessageDialog(null, "Data Updated Sucessfully");
                 // setVisible(false);
                 //  new Reception();
                    
                    } catch (Exception e) {
                  //  e.printStackTrace();
                    }
            
                 
            }else {
               new Reception().setVisible(true);
             this.setVisible(false);
            }
    }
public static void main(String[] args){
new UpdateCheckout().setVisible(true);
       }      
}

