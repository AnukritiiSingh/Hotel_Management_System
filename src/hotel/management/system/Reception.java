
/**
 *
 * @author anukriti singh 
 */
package hotel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Reception extends JFrame implements ActionListener{
    
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14;
    
    Reception(){
         
        b13 = new JButton("DASHBOARD");
     //   b1.setBackground(Color.[11,200,250]);
        b13.setBackground(new Color(250, 25, 12));
        b13.setForeground(Color.white);
        b13.setBounds(15,0,250,23);
        b13.addActionListener(this);
        add(b13);
        b14 = new JButton("R E C E P T I O N");
     //   b1.setBackground(Color.[11,200,250]);
        b14.setBackground(new Color(25, 25, 112));
        b14.setForeground(Color.white);
        b14.setBounds(300 ,0,600,40);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
        b14.setFont(new Font("Tahoma",Font.BOLD,40));
        b14.addActionListener(this);
        add(b14);
        
        b1 = new JButton("NEW CUSTOMER FORM");
     //   b1.setBackground(Color.[11,200,250]);
        b1.setBackground(new Color(25, 25, 112));
        b1.setForeground(Color.white);
                
        b1.setBounds(15,30,250,30);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("DEPARTMENT");
        //b2.setBackground(Color.BLACK);
        b2.setBackground(new Color(25, 25, 112));
        b2.setForeground(Color.white);
        b2.setBounds(15,70,250,30);
        b2.addActionListener(this);
        add(b2);
        
        b3 = new JButton("ALL EMPLOYEE INFO");
       // b3.setBackground(Color.BLACK);
        b3.setBackground(new Color(25, 25, 112));
        b3.setForeground(Color.white);
        b3.setBounds(15,110,250,30);
        b3.addActionListener(this);
        add(b3);
        
        b4 = new JButton("ALL CUSTOMER INFO");
        //b4.setBackground(Color.BLACK);
        b4.setBackground(new Color(25, 25, 112));
        b4.setForeground(Color.white);
        b4.setBounds(15,150,250,30);
        add(b4);
        
        b5 = new JButton("MANAGER INFO");
      //  b5.setBackground(Color.BLACK);
        b5.setBackground(new Color(25, 25, 112));
        b5.setForeground(Color.white);
        b5.setBounds(15,190,250,30);
        b5.addActionListener(this);
        add(b5);
        
        b6 = new JButton("ROOM");
      //  b6.setBackground(Color.BLACK);
        b6.setBackground(new Color(25, 25, 112));
        b6.setForeground(Color.white);
        b6.setBounds(15,230,250,30);
        b6.addActionListener(this);
        add(b6);
        
        b7 = new JButton("UPDATE CHECK STATUS");
      //  b7.setBackground(Color.BLACK);
        b7.setBackground(new Color(25, 25, 112));
        b7.setForeground(Color.white);
        b7.setBounds(15,270,250,30);
        add(b7);
        
        b8 = new JButton("UPDATE ROOM STATUS");
       // b8.setBackground(Color.BLACK);
        b8.setBackground(new Color(25, 25, 112));
        b8.setForeground(Color.white);
        b8.setBounds(15,310,250,30);
        b8.addActionListener(this);
        add(b8);
        
        b9 = new JButton("PICKUP SERVICE");
       // b9.setBackground(Color.BLACK);
        b9.setBackground(new Color(25, 25, 112));
        b9.setForeground(Color.white);
        b9.setBounds(15,350,250,30);
        b9.addActionListener(this);
        add(b9);
        
        b10 = new JButton("SEARCH ROOM");
       // b10.setBackground(Color.BLACK);
        b10.setBackground(new Color(25, 25, 112));
        b10.setForeground(Color.white);
        b10.setBounds(15,390,250,30);
        b10.addActionListener(this);
        add(b10);
        
        b11 = new JButton("CHECKOUT");
      //  b11.setBackground(Color.BLACK);
        b11.setBackground(new Color(25, 25, 112));
        b11.setForeground(Color.white);
        b11.setBounds(15,430,250,30);
        b11.addActionListener(this);
        add(b11);
        
        b12 = new JButton("LOGOUT");
        //b12.setBackground(Color.BLACK);
        b12.setBackground(new Color(25, 25, 112));
        b12.setForeground(Color.white);
        b12.setBounds(15,470,250,30);
        b12.addActionListener(this);
        add(b12);
      /*  b13 = new JButton("DASHBOARD");
     //   b1.setBackground(Color.[11,200,250]);
        b13.setBackground(new Color(25, 25, 112));
        b13.setForeground(Color.white);
        b13.setBounds(15,30,250,30);
        b13.addActionListener(this);
        add(b13);*/
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/seven3.jpg"));
       JLabel l1 = new JLabel(i1);
      //  i1= i1.getImage().getScaledInstance(500, 400,Image.SCALE_DEFAULT);
       l1.setBounds(300,40,600,450);
       add(l1);
       
    //   ImageIcon i2 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/seven4.jpg"));
     //   JLabel l2 = new JLabel(i2);
     //   l2.setBounds(400,0,250,25);
     //  add(l2);
       
        getContentPane().setBackground(Color.WHITE);
        
        setLayout(null);
        setBounds(190,135,950,545);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
           // new AddCustomer().setVisible(true);
           // this.setVisible(false);
            setVisible(false);
            new AddCustomer();
        }else if(ae.getSource() == b2){
            new Department().setVisible(true);
           this.setVisible(false);
        }else if(ae.getSource() == b3){
            new EmployeeInfo().setVisible(true);
           this.setVisible(false);
        }else if(ae.getSource() == b4){
           new CustomerInfo().setVisible(true);
           this.setVisible(false);
         //  setVisible(false);
        }else if(ae.getSource() == b5){
            new ManagerInfo().setVisible(true);
           this.setVisible(false);
        }else if(ae.getSource() == b6){
           new AllRooms().setVisible(true);
           this.setVisible(false);
        }else if(ae.getSource() == b7){
            new UpdateCheckout().setVisible(true);
           this.setVisible(false);
            //setVisible(false);
           //  new UpdateCheckout();
           //this.setVisible(false);
        }else if(ae.getSource() == b8){
            
        }else if(ae.getSource() == b9){
            setVisible(false);
            new PickUp();
        }else if(ae.getSource() == b10){
            new SearchRoom().setVisible(true);
           this.setVisible(false);
        }else if(ae.getSource() == b11){
            
        }else if(ae.getSource() == b12){
          setVisible(false);
        }
    }
    public static void main(String[] args){
        new Reception().setVisible(true);
    }
}


