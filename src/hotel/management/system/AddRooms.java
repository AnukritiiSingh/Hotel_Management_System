/**
 *
 * @author anukriti singh and usha maurya
 */
package hotel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class AddRooms extends JFrame implements ActionListener{
    JTextField t1,t2;
    JComboBox c1,c2,c3;
    JButton b1,b2;
    
    AddRooms(){
        
        JLabel l1 = new JLabel("ADD ROOMS");
        l1.setBounds(160,10,200,29);
        l1.setForeground(Color.BLUE);
        l1.setFont(new Font("Tahoma",Font.BOLD,30));
        add(l1);
        
        JLabel room = new JLabel("ROOM NUMBER");
        room.setBounds(60,69,150,18);
        room.setFont(new Font("Tahoma",Font.BOLD,18));
        add(room);
        
        t1 = new JTextField();
        t1.setBounds(250,69,150,30);
        add(t1);
        
        JLabel available = new JLabel("AVAILABLE");
        available.setBounds(60,130,130,19);
       // available.setForeground(Color.BLUE);
        available.setFont(new Font("Tahoma",Font.BOLD,18));
        add(available);
        c1 = new JComboBox(new String[]{"Available","Occupied"});
        c1.setBounds(250,128,150,30);
        c1.setBackground(Color.WHITE);
        add(c1);
        
        JLabel status= new JLabel("CLEANING STATUS");
        status.setBounds(60,190,170,19);
     //   status.setForeground(Color.BLUE);
        status.setFont(new Font("Tahoma",Font.BOLD,18));
        add(status);
        c2 = new JComboBox(new String[]{"Cleaned","Dirty"});
        c2.setBounds(250,188,150,30);
        c2.setBackground(Color.WHITE);
        add(c2);
        
        
        JLabel price = new JLabel("PRICE");
        price.setBounds(60,255,120,19);
       // price.setForeground(Color.BLUE);
        price.setFont(new Font("Tahoma",Font.BOLD,18));
        add(price);
        t2 = new JTextField();
        t2.setBounds(250,253,150,30);
        add(t2);
        
        JLabel type = new JLabel("BED TYPE");
        type.setBounds(60,320,120,19);
       // type.setForeground(Color.BLUE);
        type.setFont(new Font("Tahoma",Font.BOLD,18));
        add(type);
        c3 = new JComboBox(new String[]{"Single Bed","Double Bed"});
        c3.setBounds(250,318,150,30);
        c3.setBackground(Color.WHITE);
        add(c3);
        b1 = new JButton("ADD ROOM");
        b1.setBounds(60,400,130,30);
        b1.addActionListener(this);
         b1.setForeground(Color.WHITE);
          b1.setBackground(Color.BLACK);
        add(b1);
        
        b2 = new JButton("Cancel");
        b2.setBounds(250,400,130,30);
        b2.addActionListener(this);
         b2.setForeground(Color.WHITE);
         
          b2.setBackground(Color.BLACK);
        add(b2);
        
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/fifth.jpg"));
        JLabel l4 = new JLabel(i1);
        l4.setBounds(380,10,400,300);
       add(l4);
       
       ImageIcon i2 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/fifth1.jpg"));
        JLabel l5 = new JLabel(i2);
        l5.setBounds(380,230,400,300);
       add(l5);
       
       ImageIcon i3 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/fifth2.jpg"));
        JLabel l6 = new JLabel(i3);
        l6.setBounds(630,10,400,300);
       add(l6);
       ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/fifth6.jpg"));
        JLabel l7 = new JLabel(i4);
        l7.setBounds(630,230,400,300);
       add(l7);
        
        getContentPane().setBackground(Color.WHITE);
        
        setBounds(200,140,980,535);
        setLayout(null);
        setVisible(true);
    }
public void actionPerformed(ActionEvent ae){
    if(ae.getSource() == b1){
        
            String room = t1.getText();
            String available = (String)c1.getSelectedItem();
            String status = (String)c1.getSelectedItem();
            String price = t2.getText();
            String type = (String)c3.getSelectedItem();
            
            conn c = new conn();
                    try{
                   String str = "insert into room values('"+room+"','"+available+"','"+status+"','"+price+"','"+type+"')";
                  c.s.executeUpdate(str);
                   
                  JOptionPane.showMessageDialog(null,"New Room Added");
                 this.setVisible(false);
                    }catch(Exception e){
                        
                    }
    }else if(ae.getSource() == b2){
        this.setVisible(false);
    }
}
public static void main(String[] args){
    new AddRooms().setVisible(true);
  
}
}


