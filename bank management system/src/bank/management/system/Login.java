
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {
    
    JButton login,signup,clear;
    JTextField t1;
    JPasswordField t2;
    
    
    Login() {
        setTitle("AUTOMATED TELLER MACHINE");
        setLayout(null);
        
         setLayout(null);
        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("icons/Blue.jpg"));
        Image im = i.getImage().getScaledInstance(900, 850, Image.SCALE_DEFAULT);
        ImageIcon ima = new ImageIcon(im);
        JLabel image = new JLabel(ima);
        image.setBounds(0,0,900,900);
        add(image);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
         ImageIcon i3 = new ImageIcon(i2);
         JLabel label = new JLabel(i3);
         label.setBounds(70,10,100,100);
         image.add(label);
        
        JLabel text = new JLabel("WELCOME TO ATM");
        text.setFont(new Font("Osward",Font.BOLD,38));
        text.setBounds(200,40,400,40);
         image.add(text);
        
        JLabel cardno = new JLabel("Card No:");
        cardno.setFont(new Font("Raleway",Font.BOLD,28));
        cardno.setBounds(120,150,150,30);
         image.add(cardno);
        
        t1 = new JTextField();
        t1.setFont(new Font("Arial",Font.BOLD,14));
        t1.setBounds(300,150,230,30);
         image.add(t1);
        
        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Raleway",Font.BOLD,28));
        pin.setBounds(120,220,250,30);
         image.add(pin);
        
        t2 = new JPasswordField();
        t2.setFont(new Font("Arial",Font.BOLD,14));
        t2.setBounds(300,220,230,30);
         image.add(t2);
        
        login = new JButton("SIGN IN");
        login.setBounds(300,300,100,30);
        login.setBackground(Color.white);
        login.setForeground(Color.black);
        login.addActionListener(this);
         image.add(login);
        
        clear = new JButton("CLEAR");
        clear.setBounds(430,300,100,30);
        clear.setBackground(Color.white);
        clear.setForeground(Color.black);
        clear.addActionListener(this);
         image.add(clear);
        
        signup = new JButton("SIGN UP");
        signup.setBounds(300,350,230,30);
        signup.setBackground(Color.white);
        signup.setForeground(Color.black);
        signup.addActionListener(this);
         image.add(signup);
       getContentPane().setBackground(Color.WHITE);
        
        setSize(800,480);
        setVisible(true);
        setLocation(350,200);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== clear){
            t1.setText("");
            t2.setText("");
        } else if(ae.getSource()== login){
            Conn con = new Conn();
            String cardnumber = t1.getText();
            String pinnumber = t2.getText();
            String query = "Select * from login where cardnumber = '"+cardnumber+"'  and pinnumber = '"+pinnumber+"'" ;
            try {
                ResultSet rs= con.s.executeQuery(query);
                if (rs.next()){
                    setVisible(false);
                    new Transaction(pinnumber).setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or pin");
                
                }
                    
                
                
                
            }catch(Exception e){
                System.out.println(e);
            }
            
        } else if(ae.getSource()== signup){
            setVisible(false);
            new SignupOne().setVisible(true);
        }
    
    }
    
    
    
    
    public static void main(String[] args){
        new Login();
    
    
    }
    
}
