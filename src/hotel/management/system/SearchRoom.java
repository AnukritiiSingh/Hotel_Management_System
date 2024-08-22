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
public class SearchRoom extends JFrame implements ActionListener{
    JTable table;
    JButton back,submit;
    JComboBox bedType;
    JCheckBox available;
    SearchRoom(){
        
        getContentPane().setBackground(Color.WHITE);
         setLayout(null);
         
       /*ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/10th.jpg"));
        Image i2 = i1.getImage().getScaledInstance(400, 600, Image.SCALE_DEFAULT);
     ImageIcon i3 = new ImageIcon(i2);
     JLabel image = new JLabel(i3);
     image.setBounds(590,0,400,550);
     add(image);*/
     
    JLabel text = new JLabel("Search For Room");
    text.setFont(new Font("Tahoma",Font.PLAIN,30));
    text.setBounds(400,20,400,30);
    text.setForeground(Color.red);
    add(text);
    
        
        JLabel lblbed = new JLabel("Bed Type");
        lblbed.setBounds(10,105,100,20);
        lblbed.setFont(new Font("Tahoma",Font.BOLD,18));
         add(lblbed);
         
         bedType = new JComboBox(new String[]{"Single Bed","Double Bed"});
         bedType.setBounds(110,100,200,30);
         bedType.setBackground(Color.WHITE);
         bedType.setFont(new Font("Tahoma",Font.BOLD,14));
         add(bedType);
         
         available = new JCheckBox("Only Display Available");
         available.setBounds(600,95,300,30);
         available.setBackground(Color.WHITE);
         available.setFont(new Font("Tahoma",Font.BOLD,20));
         add(available);
         
          JLabel l1 = new JLabel("Room No");
        l1.setBounds(5,170,70,20);
        l1.setFont(new Font("Tahoma",Font.BOLD,14));
        l1.setForeground(Color.BLUE);
        add(l1);
         
       JLabel l2 = new JLabel("Avalability");
        l2.setBounds(220,170,70,20);
        l2.setFont(new Font("Tahoma",Font.BOLD,14));
        l2.setForeground(Color.BLUE);
        add(l2);
        
        JLabel l3 = new JLabel("Status");
        l3.setBounds(450,170,70,20);
        l3.setFont(new Font("Tahoma",Font.BOLD,14));
        l3.setForeground(Color.BLUE);
        add(l3);
        
        JLabel l4 = new JLabel("Price");
        l4.setBounds(625,170,70,20);
        l4.setFont(new Font("Tahoma",Font.BOLD,16));
        l4.setForeground(Color.BLUE);
        add(l4);
        
        JLabel l5 = new JLabel("Bed Type");
        l5.setBounds(850,170,70,20);
        l5.setFont(new Font("Tahoma",Font.BOLD,14));
        l5.setForeground(Color.BLUE);
        add(l5);
        
        
     
     
     table = new JTable();
     table.setBounds(0,200,1000,200);
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
               String query1 = "select * from room where bed_type = '"+bedType.getSelectedItem()+"'";
               String query2 = "select * from room where available ='Available' AND bed_type = '"+bedType.getSelectedItem()+"'";
          conn conn = new conn();
          ResultSet rs;
          if(available.isSelected()){
              rs = conn.s.executeQuery(query2);
          }else {
              rs = conn.s.executeQuery(query1);
          }
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
  new SearchRoom();
}
}

