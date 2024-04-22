
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SignupThree extends JFrame implements ActionListener{
    
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit, cancel;
    String formno;
   
    
    SignupThree(String formno){
        
        this.formno = formno;
        setLayout(null);
        
        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("icons/Blue.jpg"));
        Image im = i.getImage().getScaledInstance(900, 850, Image.SCALE_DEFAULT);
        ImageIcon ima = new ImageIcon(im);
        JLabel image = new JLabel(ima);
        image.setBounds(0,0,900,900);
        add(image);
        
         JLabel l = new JLabel("Page 3:Account Details ");
         l.setFont(new Font("Ralewat",Font.BOLD,22));
         l.setBounds(280, 40, 400, 40);
         image.add(l);
         
         JLabel type = new JLabel("Account Type: ");
         type.setFont(new Font("Ralewat",Font.BOLD,22));
         type.setBounds(100, 100, 420, 30);
         image.add(type);
         
        r1 = new JRadioButton("Savings");
        r1.setBounds(100,150,150,20);
        r1.setBackground(Color.WHITE);
        r1.setFont(new Font("Ralewat",Font.BOLD,16));
        image.add(r1);
        
        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setBounds(350,150,250,20);
        r2.setBackground(Color.WHITE);
        r2.setFont(new Font("Ralewat",Font.BOLD,16));
        image.add(r2);
        
        r3= new JRadioButton("Current Account");
        r3.setBounds(100,200,250,20);
        r3.setBackground(Color.WHITE);
        r3.setFont(new Font("Ralewat",Font.BOLD,16));
        image.add(r3);
        
        r4 = new JRadioButton("Reccuring Deposit Account");
        r4.setBounds(350,200,250,20);
        r4.setBackground(Color.WHITE);
        r4.setFont(new Font("Ralewat",Font.BOLD,16));
        image.add(r4);
        
        ButtonGroup group = new ButtonGroup();
        group.add(r1);
        group.add(r2);
        group.add(r3);
        group.add(r4);
        
        JLabel card = new JLabel("Card Number: ");
         card.setFont(new Font("Ralewat",Font.BOLD,22));
         card.setBounds(100, 250, 420, 30);
         image.add(card);
         
         JLabel number = new JLabel("XXXX-XXXX-XXXX-4184");
         number.setFont(new Font("Ralewat",Font.BOLD,22));
         number.setBounds(330, 250, 300, 30);
         image.add(number);
         
          JLabel carddetails = new JLabel("Your 16 digit Card Number");
         carddetails.setFont(new Font("Ralewat",Font.BOLD,12));
         carddetails.setBounds(100, 280, 300, 30);
         image.add(carddetails);
         
          JLabel pin = new JLabel("PIN: ");
         pin.setFont(new Font("Ralewat",Font.BOLD,22));
         pin.setBounds(100, 320, 420, 30);
         image.add(pin);
         
         JLabel pnumber = new JLabel("XXXX");
         pnumber.setFont(new Font("Ralewat",Font.BOLD,22));
         pnumber.setBounds(330, 320, 300, 30);
         image.add(pnumber);
         
         JLabel pindetails = new JLabel("Your 4 digit password");
         pindetails.setFont(new Font("Ralewat",Font.BOLD,12));
         pindetails.setBounds(100, 340, 300, 30);
         image.add(pindetails);
         
         JLabel services = new JLabel("Services Required: ");
         services.setFont(new Font("Ralewat",Font.BOLD,22));
         services.setBounds(100, 390, 400, 30);
         image.add(services);
         
         c1 = new JCheckBox("ATM Card");
         c1.setFont(new Font("Ralewat",Font.BOLD,16));
         c1.setBounds(100, 430, 200, 30);
         c1.setBackground(Color.white);
         image.add(c1);
         
         c2 = new JCheckBox("Internet Banking");
         c2.setFont(new Font("Ralewat",Font.BOLD,16));
         c2.setBounds(350, 430, 200, 30);
         c2.setBackground(Color.white);
         image.add(c2);
         
         c3 = new JCheckBox("Mobile Banking");
         c3.setFont(new Font("Ralewat",Font.BOLD,16));
         c3.setBounds(100, 480, 200, 30);
         c3.setBackground(Color.white);
         image.add(c3);
         
         c4 = new JCheckBox("Email and SMS Alerts");
         c4.setFont(new Font("Ralewat",Font.BOLD,16));
         c4.setBounds(350, 480, 200, 30);
         c4.setBackground(Color.white);
         image.add(c4);
         
         c5 = new JCheckBox("Cheque Book");
         c5.setFont(new Font("Ralewat",Font.BOLD,16));
         c5.setBounds(100, 530, 200, 30);
         c5.setBackground(Color.white);
         image.add(c5);
         
         c6 = new JCheckBox("E Statement");
         c6.setFont(new Font("Ralewat",Font.BOLD,16));
         c6.setBounds(350, 530, 200, 30);
         c6.setBackground(Color.white);
         image.add(c6);
         
          c7 = new JCheckBox("I heraby declares that the above entered details are correct to the best of my knowledge");
         c7.setFont(new Font("Ralewat",Font.BOLD,12));
         c7.setBounds(100, 600, 550, 30);
         c7.setBackground(Color.white);
         image.add(c7);
        
        submit = new JButton("Submit");
        submit.setFont(new Font("Ralewat",Font.BOLD,12));
        submit.setBounds(270,650 , 100, 30);
        submit.setBackground(Color.black);
        submit.setForeground(Color.white);
        submit.addActionListener(this);
        image.add(submit);
        
        cancel = new JButton("Cancel");
        cancel.setFont(new Font("Ralewat",Font.BOLD,12));
        cancel.setBounds(420,650 , 100, 30);
        cancel.setBackground(Color.black);
        cancel.setForeground(Color.white);
        cancel.addActionListener(this);
        image.add(cancel);
        
         setSize(820,850);
         setLocation(350,0);
         setVisible(true);
    
    
    }
    
     public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== submit){
           String accountType = null;
           
         if(r1.isSelected()){
            accountType = "Savings Account";
        }
        
         else if (r2.isSelected()){
            accountType = "Fixed Deposit Account";
        }
        else if (r3.isSelected()){
            accountType = "Current Account";
        }
         else if (r4.isSelected()){
            accountType = "Recurring Deposit Account";
        }
        Random random = new Random();
        String cardnumber = "" + Math.abs((random.nextLong() % 90000000L) +5040936000000000L);
        String pinnumber = "" + Math.abs((random.nextLong() % 9000L) +1000L);
        String facility = "";
        if(c1.isSelected()){ 
            facility = facility + " ATM Card";
        }
        if(c2.isSelected()){ 
            facility = facility + " Internet Banking";
        }
        if(c3.isSelected()){ 
            facility = facility + " Mobile Banking";
        }
        if(c4.isSelected()){ 
            facility = facility + " EMAIL & SMS Alerts";
        }
        if(c5.isSelected()){ 
            facility = facility + " Cheque Book";
        }
        if(c6.isSelected()){ 
            facility = facility + " E-Statement";
        }
        
                try {
                
                if(accountType.equals("")){
                    JOptionPane.showMessageDialog(null, "Account type  required");
                }else{
                    Conn conn = new Conn();
                    String q1 = "insert into signupThree values('"+formno+"','"+accountType+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
                    String q2 = "insert into login values('"+formno+"','"+accountType+"','"+cardnumber+"','"+pinnumber+"')";
                    conn.s.executeUpdate(q1);
                    conn.s.executeUpdate(q2);
                     
                    JOptionPane.showMessageDialog(null, "Card number:" + cardnumber + "\n Pin: " + pinnumber);
                    
                    setVisible(false);
                    
                    
                    new Deposit(pinnumber).setVisible(false);
                }
                }catch(Exception e){
                     System.out.println(e);
                  }
        

        
        } else if(ae.getSource()== cancel){
            setVisible(false);
            new Login().setVisible(true);
            
        }}
     public static void main(String[] args)
    {
        new SignupThree("");
    
    
    }
    
}
