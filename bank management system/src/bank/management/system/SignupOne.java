
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;


public class SignupOne extends JFrame implements ActionListener {
    
    long random;
    JTextField nameTextField,fnameTextField, emailTextField,addressTextField,cityTextField,stateTextField,pinTextField;
    JButton next;
    JRadioButton male, female,married, unmarried, other;
    JDateChooser chooser;
    
    SignupOne(){
        
       setLayout(null);
       
       ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("icons/Blue.jpg"));
        Image im = i.getImage().getScaledInstance(900, 850, Image.SCALE_DEFAULT);
        ImageIcon ima = new ImageIcon(im);
        JLabel image = new JLabel(ima);
        image.setBounds(0,0,900,900);
        add(image);
       
       
       Random ran = new Random();
       random = Math.abs((ran.nextLong() % 9000L ) + 1000L);
        
       JLabel formno = new JLabel("APPLICATION FORM NO" + random);
       formno.setFont(new Font("Ralewat",Font.BOLD,38));
       formno.setBounds(140, 20, 600, 40);
       add(formno);
       
       JLabel personalDetails = new JLabel("Page 1: Personal Details");
       personalDetails.setFont(new Font("System",Font.BOLD,22));
       personalDetails.setForeground(Color.black);
       personalDetails.setBounds(290, 40, 400, 30);
       image.add(personalDetails);
       
       JLabel name = new JLabel("Name: ");
       name.setFont(new Font("Ralewat",Font.BOLD,22));
       name.setBounds(100, 110, 90, 30);
       image.add(name);
       
       
       nameTextField = new  JTextField ();
       nameTextField.setFont(new Font("Ralewat",Font.BOLD,14));
       nameTextField.setBounds(300, 110, 400, 30);
       image.add(nameTextField);
       
       JLabel fname = new JLabel("Father's Name: ");
       fname.setFont(new Font("Ralewat",Font.BOLD,22));
       fname.setBounds(100, 160, 200, 30);
       image.add(fname);
       
       fnameTextField = new  JTextField ();
       fnameTextField.setFont(new Font("Ralewat",Font.BOLD,14));
       fnameTextField.setBounds(300, 160, 400, 30);
       image.add(fnameTextField);
       
       JLabel dob = new JLabel("Date of Birth: ");
       dob.setFont(new Font("Ralewat",Font.BOLD,22));
       dob.setBounds(100, 210, 210, 30);
       image.add(dob);
       
       chooser = new JDateChooser ();
       chooser.setBounds(300,210,400,30);
       chooser.setForeground(Color.black);
       image.add(chooser);
       
        JLabel gender = new JLabel("Gender: ");
       gender.setFont(new Font("Ralewat",Font.BOLD,22));
       gender.setBounds(100, 260, 200, 30);
       image.add(gender);
       
       
       female = new JRadioButton("Female");
       female.setBounds(300,260,120,30);
       female.setBackground(Color.WHITE);
       image.add(female);
       
      
       
        male = new JRadioButton("Male");
        male.setBounds(450,260,60,30);
        male.setBackground(Color.WHITE);
        image.add(male);
        
       ButtonGroup group = new ButtonGroup();
       group.add(female);
       group.add(male);
        
        JLabel email = new JLabel("Email Address: ");
       email.setFont(new Font("Ralewat",Font.BOLD,22));
       email.setBounds(100, 310, 200, 30);
       image.add(email);
       
       emailTextField = new  JTextField ();
       emailTextField.setFont(new Font("Ralewat",Font.BOLD,14));
       emailTextField.setBounds(300, 310, 400, 30);
       image.add(emailTextField);
       
       JLabel marital = new JLabel("Marital Status: ");
       marital.setFont(new Font("Ralewat",Font.BOLD,22));
       marital.setBounds(100, 360, 200, 30);
       image.add(marital);
       
       married = new JRadioButton("Married");
       married.setBounds(300,360,100,30);
       married.setBackground(Color.WHITE);
       image.add(married);
       
        unmarried = new JRadioButton("UnMarried");
        unmarried.setBounds(450,360,100,30);
        unmarried.setBackground(Color.WHITE);
        image.add(unmarried);
        
        other = new JRadioButton("Other");
        other.setBounds(600,360,100,30);
        other.setBackground(Color.WHITE);
        image.add(other);
        
       ButtonGroup mgroup = new ButtonGroup();
       mgroup.add(married);
       mgroup.add(unmarried);
       mgroup.add(other);
       
       JLabel address = new JLabel("Address: ");
       address.setFont(new Font("Ralewat",Font.BOLD,22));
       address.setBounds(100, 410, 200, 30);
       image.add(address);
       
       addressTextField = new  JTextField ();
       addressTextField.setFont(new Font("Ralewat",Font.BOLD,14));
       addressTextField.setBounds(300, 410, 400, 30);
       image.add(addressTextField);
       
       JLabel city = new JLabel("City: ");
       city.setFont(new Font("Ralewat",Font.BOLD,22));
       city.setBounds(100, 460, 200, 30);
       image.add(city);
       
       cityTextField = new  JTextField ();
       cityTextField.setFont(new Font("Ralewat",Font.BOLD,14));
       cityTextField.setBounds(300, 460, 400, 30);
       image.add(cityTextField);
       
        JLabel state = new JLabel("State: ");
       state.setFont(new Font("Ralewat",Font.BOLD,22));
       state.setBounds(100, 510, 200, 30);
       image.add(state);
       
       stateTextField = new  JTextField ();
       stateTextField.setFont(new Font("Ralewat",Font.BOLD,14));
       stateTextField.setBounds(300, 510, 400, 30);
       image.add(stateTextField);
       
       JLabel pincode = new JLabel("Pin Code: ");
       pincode.setFont(new Font("Ralewat",Font.BOLD,22));
       pincode.setBounds(100, 560, 200, 30);
       image.add(pincode);
       
       pinTextField = new  JTextField ();
       pinTextField.setFont(new Font("Ralewat",Font.BOLD,14));
       pinTextField.setBounds(300, 560, 400, 30);
       image.add(pinTextField);
       
       next = new JButton("Next");
       next.setFont(new Font("Ralewat",Font.BOLD,14));
       next.setBackground(Color.black);
       next.setForeground(Color.WHITE);
       next.setBounds(620,620,80,30);
       next.addActionListener(this);
       image.add(next);
       
       
       
        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setVisible(true);
        setLocation(350,10);
    
    
    }
    
    public void actionPerformed(ActionEvent ae){
        String formno = "" + random;
        String name = nameTextField.getText();
        String fname = nameTextField.getText();
        String dob = ((JTextField)chooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(female.isSelected()){
            gender = "female";
        }
        else if (male.isSelected()){
            gender = "Male";
        }
         String email = emailTextField.getText();
         String marital = null;
         if(married.isSelected()){
            marital = "Married";
        }
        else if (unmarried.isSelected()){
            marital = "Single";
        }
        else if (other.isSelected()){
            marital = "Other";
        }
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pincode = pinTextField.getText();


        try 
        {
         if (name.equals("")) {
               JOptionPane.showMessageDialog(null,"Name is Required");
             }
         else 
         {
            Conn c = new Conn();
            String query = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";        
            c.s.executeUpdate(query);   
            
            setVisible(false);
            new SignupTwo(formno).setVisible(true);
         }
          } catch (Exception e){
              System.out.println(e);   
                     }
    }
    
    
    public static void main(String[] args)
    {
        new SignupOne();
    
    
    }
    
}
