/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author anukriti singh
 */
package hotel.management.system;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.Date;
import java.awt.event.*;
public class AddCustomer extends JFrame  implements ActionListener{
   
    JComboBox comboid;
    JTextField tfnumber,tfname,tfcountry,tfdeposit;
    JRadioButton rmale,rfemale;
    Choice croom;
    JLabel checkintime;
    JButton add , back;
    
    AddCustomer(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        JLabel text = new JLabel("New Customer Form");
        text.setBounds(100,20,300,30);
        text.setFont(new Font("Raleway",Font.PLAIN, 25));
        text.setForeground(Color.blue);
        add(text);
        
        JLabel lblid = new JLabel("Customer ID");
        lblid.setBounds(40,80,300,20);
        lblid.setFont(new Font("Raleway",Font.PLAIN, 18));
        add(lblid);
        
        JLabel lblnumber = new JLabel("Number");
        lblnumber.setBounds(40,117,450,30);
        lblnumber.setFont(new Font("Raleway",Font.PLAIN, 18));
        add(lblnumber);
        
        tfnumber = new JTextField();
        tfnumber.setBounds(220,120,150,27);
        add(tfnumber);
        
        
        
        String options[] ={"Aadhar Card", "Passport","Driving License", "Voter-id Card","Ration Card"};
        comboid = new JComboBox(options);
        comboid.setBounds(220,80,150,25);
        comboid.setBackground(Color.WHITE);
        add(comboid);
        
        
        
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(40,157,450,30);
        lblname.setFont(new Font("Raleway",Font.PLAIN, 18));
        add(lblname);
       
        
        tfname = new JTextField();
        tfname.setBounds(220,160,150,27);
        add(tfname);
        
        JLabel lblgender = new JLabel("Gender");
        lblgender.setBounds(40,195,100,30);
        lblgender.setFont(new Font("Raleway",Font.PLAIN, 19));
        add(lblgender);
        
        rmale =new JRadioButton("Male");
        rmale.setBackground(Color.WHITE);
        rmale.setBounds(220,200,70,20);
         rmale.setFont(new Font("Raleway",Font.PLAIN, 19));
        add(rmale);
        
        rfemale = new JRadioButton("Female");
        rfemale.setBackground(Color.WHITE);
        rfemale.setBounds(290,200,100,20);
        rfemale.setFont(new Font("Raleway",Font.PLAIN, 19));
        add(rfemale);
        
        JLabel lblcountry = new JLabel("Country");
        lblcountry.setBounds(40,237,450,30);
        lblcountry.setFont(new Font("Raleway",Font.PLAIN, 19));
        add(lblcountry);
        
       tfcountry = new JTextField();
      tfcountry.setBounds(220,240,150,27);
      add(tfcountry);
      
      JLabel lblroom = new JLabel("Allocated Room No");
        lblroom.setBounds(40,277,170,30);
        lblroom.setFont(new Font("Raleway",Font.PLAIN, 19));
        add(lblroom);
        
        croom = new Choice();
        try{
          conn conn = new conn();
          String query = "select * from room";
          ResultSet rs =conn.s.executeQuery(query);
          while(rs.next()){
              croom.add(rs.getString("room_number"));
          }
        }catch(Exception e){
            e.printStackTrace();
        }
        croom.setBounds(220,282,150,25);
        add(croom);
        
        JLabel lbltime = new JLabel("Checkin Time");
        lbltime.setBounds(40,317,170,30);
        lbltime.setFont(new Font("Raleway",Font.PLAIN, 19));
        add(lbltime);
        
        Date date = new Date();
        checkintime = new JLabel("" + date);
        checkintime.setBounds(220,320,250,25);
        checkintime.setFont(new Font("Raleway",Font.PLAIN, 18));
        add(checkintime);
      
      JLabel lbldeposit = new JLabel("Deposit");
        lbldeposit.setBounds(40,366,450,30);
        lbldeposit.setFont(new Font("Raleway",Font.PLAIN, 19));
        add(lbldeposit);
        
        tfdeposit = new JTextField();
        tfdeposit.setBounds(220,370,150,27);
        add(tfdeposit);
        
        add = new JButton("Add");
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.setBounds(50,450,120,30);
        add.addActionListener(this);
        add(add);
        
        back = new JButton("BACK");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        back.setBounds(200,450,120,30);
        add(back);
        
        
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/eight.png"));
         Image i2 = i1.getImage().getScaledInstance(450, 600, Image.SCALE_DEFAULT);
         ImageIcon i3 = new ImageIcon(i2);
         JLabel image = new JLabel(i3);
         image.setBounds(500,50,350,400);
         add(image);
         
 
        
        
        
      
        
       
      setBounds(200,140,900,550);
        setVisible(true);
      
    }
   
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == add)
        {
            String id = (String) comboid.getSelectedItem();
            String number = tfnumber.getText();
            String name = tfname.getText();
            String gender = null;
            
            if (rmale.isSelected())
            {
                gender = "Male";
            }
            else{
                gender = "Female";
            }
            String country = tfcountry.getText();
            String room = croom.getSelectedItem();
            String time = checkintime.getText();
            String deposit = tfdeposit.getText();
            
            try{
                String query ="insert into customer values('"+id+"','"+number+"','"+name+"','"+gender+"','"+country+"','"+room+"','"+checkintime+"','"+deposit+"')";
          String query2 = "update room set available ='Occupied' where room_number ='"+room+"'";
         
          conn conn =new conn();
          conn.s.executeUpdate(query);
          conn.s.executeUpdate(query2);
          
          
          JOptionPane.showMessageDialog(null,"New customer Added Sucessfully");
          
          setVisible(false);
         new Reception();
            }catch(Exception e){
                e.printStackTrace();
            }
        }else if (ae.getSource() == back){
            setVisible(false);
          new Reception();
        }
    }
    public static void main(String[] args)
    {
        new AddCustomer();
    }
}
