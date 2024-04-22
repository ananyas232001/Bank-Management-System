
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.util.*;



public class Withdrawl extends JFrame implements ActionListener{
    
    JTextField amount;
    JButton withdraw,back;
    String pinnumber;
    
   Withdrawl(String pinnumber){
       
       this.pinnumber = pinnumber;
       
       
       setLayout(null);
        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource(""));
        Image im = i.getImage().getScaledInstance(900, 850, Image.SCALE_DEFAULT);
        ImageIcon ima = new ImageIcon(im);
        JLabel image = new JLabel(ima);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text = new JLabel("Enter the amount you want to Withdrawl");
        text.setBounds(310,300,600,35);
        text.setForeground(Color.black);
        text.setFont(new Font("System", Font.BOLD,16));
        image.add(text);
        
       amount = new  JTextField ();
       amount.setFont(new Font("Ralewat",Font.BOLD,22));
       amount.setBounds(310, 350, 320, 25);
       image.add(amount);
        
        withdraw = new JButton("Withdraw");
        withdraw.setBounds(355,485,150,30);
        withdraw.addActionListener(this);
        withdraw.setBackground(Color.cyan);
        image.add(withdraw);
        
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
        if(ae.getSource() == withdraw) {
            String number = amount.getText();
            Date date = new Date();
            if(number.equals("")){
                JOptionPane.showMessageDialog(null, "Please Enter the amount you want to Withdrawl");
            }else {
                try {
                    Conn con = new Conn();
                    String query = "insert into bank values('"+pinnumber+"','"+date+"','Withdrawl','"+number+"')";
                    con.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Rs" +number+ "Withdraw Successfully");
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
        new Withdrawl("");
    
    
    }
    
}
