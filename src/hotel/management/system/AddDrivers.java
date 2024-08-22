
/**
 *
 * @author usha maurya and anukriti singh
 */
package hotel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.sql.*;
import java.util.*;

public class AddDrivers extends JFrame implements ActionListener{

    private JPanel contentPane;
    private JTextField t1,t2,t3,t4, t5;
    private JComboBox comboBox, comboBox_1;
    JButton b1,b2;
    Choice c1;

    public static void main(String[] args) {
        new AddDrivers().setVisible(true);
    }


        AddDrivers() {
        setBounds(200,140,940,520);
	contentPane = new JPanel();
	setContentPane(contentPane);
	contentPane.setLayout(null);
        
       ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/six.png"));
              Image i3 = i1.getImage().getScaledInstance(500, 400,Image.SCALE_DEFAULT);
              ImageIcon i2 = new ImageIcon(i3);
              JLabel image = new JLabel(i2);
               image.setBounds(422,30,500,400);
               add(image);
        
        JLabel title = new JLabel("Add Drivers");
        title.setFont(new Font("Tahoma", Font.BOLD, 30));
	title.setBounds(120,10,200,30);
	contentPane.add(title);
        
	
        
	JLabel name = new JLabel("Name");
	name.setForeground(new Color(25, 25, 112));
	name.setFont(new Font("Tahoma", Font.BOLD, 19));
	name.setBounds(60, 70, 102, 30);
	contentPane.add(name);
        
        
        t1 = new JTextField();
	t1.setBounds(250, 70, 156, 30);
	contentPane.add(t1);
        

	JLabel age = new JLabel("Age");
	age.setForeground(new Color(25, 25, 112));
	age.setFont(new Font("Tahoma", Font.BOLD, 19));
	age.setBounds(60, 120, 102, 30);
	contentPane.add(age);
        
        t2 = new JTextField();
	t2.setBounds(250, 120, 156, 30);
	contentPane.add(t2);


	JLabel gender = new JLabel("Gender");
	gender.setForeground(new Color(25, 25, 112));
        
	gender.setFont(new Font("Tahoma", Font.BOLD, 19));
	gender.setBounds(60, 170, 102, 30);
	contentPane.add(gender);
        
        comboBox = new JComboBox(new String[] { "Male", "Female" });
	comboBox.setBounds(250, 170, 154, 30);
        comboBox.setFont(new Font("Tahoma", Font.BOLD, 14));
        comboBox.setBackground(Color.WHITE);
	contentPane.add(comboBox);

	JLabel company = new JLabel("Car Company");
	company.setForeground(new Color(25, 25, 112));
	company.setFont(new Font("Tahoma", Font.BOLD, 19));
	company.setBounds(60,220, 130, 30);
	contentPane.add(company);
        
        t3 = new JTextField();
	t3.setBounds(250,220, 156, 30);
	contentPane.add(t3);

        JLabel cbrand = new JLabel("Car Brand");
	cbrand.setForeground(new Color(25, 25, 112));
	cbrand.setFont(new Font("Tahoma", Font.BOLD, 19));
	cbrand.setBounds(60, 270, 102, 30);
	contentPane.add(cbrand);


        t4 = new JTextField();
	t4.setBounds(250, 270, 156, 30);
	contentPane.add(t4);

	
        JLabel available = new JLabel("Available");
	available.setForeground(new Color(25, 25,112 ));
        
	available.setFont(new Font("Tahoma", Font.BOLD, 19));
	available.setBounds(60, 320, 102, 30);
	contentPane.add(available);


        comboBox_1 = new JComboBox(new String[] { "Yes", "No" });
	comboBox_1.setBounds(250,320, 154, 30);
        comboBox.setFont(new Font("Tahoma", Font.BOLD, 14));
        comboBox_1.setBackground(Color.WHITE);
	contentPane.add(comboBox_1);

        
        JLabel location = new JLabel("Location");
	location.setForeground(new Color(25, 25, 112));
	location.setFont(new Font("Tahoma", Font.BOLD, 19));
	location.setBounds(60, 370, 102, 30);
	contentPane.add(location);


        t5 = new JTextField();
	t5.setBounds(250, 370, 156, 30);
	contentPane.add(t5);
        
	

	b1 = new JButton("Add");
	b1.addActionListener(this);
	b1.setBounds(60, 420, 111, 35);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
	contentPane.add(b1);

	b2 = new JButton("Back");
	b2.addActionListener(this);
	b2.setBounds(200,420, 111, 35);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
	contentPane.add(b2);

	
        contentPane.setBackground(Color.WHITE);
    
    }
    
    public void actionPerformed(ActionEvent ae){
        try{
            
            if(ae.getSource() == b1){
                try{
                conn c = new conn();
                String name = t1.getText();
                String age = t2.getText();
                String gender = (String)comboBox.getSelectedItem();
                String company  = t3.getText();
                String brand = t4.getText();
                String available = (String)comboBox_1.getSelectedItem();
                String location = t5.getText();
                String str = "INSERT INTO driver values( '"+name+"', '"+age+"', '"+gender+"','"+company+"', '"+brand+"', '"+available+"','"+location+"')";
              
                
		c.s.executeUpdate(str);
		JOptionPane.showMessageDialog(null, "Driver Successfully Added");
                this.setVisible(false);
               
                }catch(Exception ee){
                    System.out.println(ee);
                }
            }
            else if(ae.getSource() == b2){
                this.setVisible(false);
            }
        }catch(Exception e){
            
        }
    }
}
       