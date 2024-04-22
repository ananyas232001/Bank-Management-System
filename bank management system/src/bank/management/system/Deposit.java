
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.util.*;



public class Deposit extends JFrame implements ActionListener{
    
    JTextField amount;
    JButton deposit,back;
    String pinnumber;
    
   Deposit(String pinnumber){
       
       this.pinnumber = pinnumber;
       
       
       setLayout(null);
        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource(""));
        Image im = i.getImage().getScaledInstance(900, 850, Image.SCALE_DEFAULT);
        ImageIcon ima = new ImageIcon(im);
        JLabel image = new JLabel(ima);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text = new JLabel("Enter the amount you want to deposit");
        text.setBounds(310,300,600,35);
        text.setForeground(Color.black);
        text.setFont(new Font("System", Font.BOLD,16));
        image.add(text);
        
       amount = new  JTextField ();
       amount.setFont(new Font("Ralewat",Font.BOLD,22));
       amount.setBounds(310, 350, 320, 25);
       image.add(amount);
        
        deposit = new JButton("Deposit");
        deposit.setBounds(355,485,150,30);
        deposit.addActionListener(this);
        deposit.setBackground(Color.cyan);
        image.add(deposit);
        
       back = new JButton("Back");
        back.setBounds(355,520,150,30);
         back.addActionListener(this);
        back.setBackground(Color.cyan);
        image.add(back);
        
        setSize(900,900);
        setLocation(300,0);
        
        setVisible(true);
   
   
   
   }
   
   public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == deposit) {
            String number = amount.getText();
            Date date = new Date();
            if(number.equals("")){
                JOptionPane.showMessageDialog(null, "Please Enter the amount you want to deposit");
            }else {
                try {
                    Conn con = new Conn();
                    String query = "insert into bank values('"+pinnumber+"','"+date+"','Deposit','"+number+"')";
                    con.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Rs" +number+ "Deposited Successfully");
                    setVisible(false);
                    new Transaction(pinnumber).setVisible(true);
                } catch (Exception ex) {
                   System.out.println(ex);
                }
            }
        
        }else if (ae.getSource() == back) {
            setVisible(false);
            new Transaction(pinnumber).setVisible(true);
        
        }
    
   }
     public static void main(String[] args){
        new Deposit("");
    
    
    }
    
}
