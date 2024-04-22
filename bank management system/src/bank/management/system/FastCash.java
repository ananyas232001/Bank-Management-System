
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener{
    
    JButton deposit,withdrawal,fastcash ,ministatement,pincash,balanceenquiry,exit;
    String pinnumber;
    FastCash(String pinnumber){
        this.pinnumber = pinnumber;
        setLayout(null);
        
    
        setLayout(null);
        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("icons/image atm.jpg"));
        Image im = i.getImage().getScaledInstance(900, 850, Image.SCALE_DEFAULT);
        ImageIcon ima = new ImageIcon(im);
        JLabel image = new JLabel(ima);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text = new JLabel("Select withdrawl amount");
        text.setBounds(380,300,600,35);
        text.setForeground(Color.white);
        text.setFont(new Font("System", Font.BOLD,16));
        image.add(text);
        
        deposit = new JButton("Rs 100");
        deposit.setBounds(170,415,150,30);
         deposit.setForeground(Color.black);
          deposit.setBackground(Color.white);
        deposit.addActionListener(this);
        image.add(deposit);
        
        withdrawal  = new JButton("Rs 500");
        withdrawal.setBounds(590,415,150,30);
         withdrawal.setForeground(Color.black);
          withdrawal.setBackground(Color.white);
        withdrawal.addActionListener(this);
        image.add(withdrawal);
        
        fastcash  = new JButton("Rs 1000");
        fastcash.setBounds(170,450,150,30);
        fastcash.setForeground(Color.black);
          fastcash.setBackground(Color.white);
        fastcash.addActionListener(this);
        image.add(fastcash);
        
        ministatement  = new JButton("Rs 2000");
        ministatement.setBounds(590,450,150,30);
        ministatement.setForeground(Color.black);
          ministatement.setBackground(Color.white);
        ministatement.addActionListener(this);
        image.add(ministatement);
        
         pincash  = new JButton("Rs 5000");
        pincash.setBounds(170,485,150,30);
        pincash.setForeground(Color.black);
          pincash.setBackground(Color.white);
        pincash.addActionListener(this);
        image.add(pincash);
        
        balanceenquiry  = new JButton("Rs 10000");
        balanceenquiry.setBounds(590,485,150,30);
        balanceenquiry.addActionListener(this);
         balanceenquiry.setForeground(Color.black);
          balanceenquiry.setBackground(Color.white);

        image.add(balanceenquiry);
        
        exit  = new JButton("Back");
        exit.setBounds(590,540,150,30);
       exit.setForeground(Color.black);
          exit.setBackground(Color.white);
        exit.addActionListener(this);
        image.add(exit);
        
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == exit) {
            setVisible(false);
            new Transaction(pinnumber).setVisible(true);
        
        }else {
           String amount = ((JButton)ae.getSource()).getText().substring(3); // Rs 500
            Conn c = new Conn();
            try{
                ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pinnumber+"' ");
                int balance = 0;
                while(rs.next()){
                    if (rs.getString("type").equals("Deposit")){
                       balance += Integer.parseInt(rs.getString("amount")); 
                    } else {
                        balance -= Integer.parseInt(rs.getString("amount")); 
                          }
                }
                if (ae.getSource() != exit && balance < Integer.parseInt(amount)) {
                JOptionPane.showMessageDialog(null, "Insuffient Balance");
                return;
                }
                Date date = new Date();
                String query = ("insert into bank values('"+pinnumber+"', '"+date+"', 'Withdrawl', '"+amount+"')");
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Rs. "+amount+" Debited Successfully");
                
                setVisible(false);
                new Transaction(pinnumber).setVisible(true);

            
            }catch(Exception e)
            {
                System.out.println(e);
            }
        
        } 
    
    
    }
    public static void main(String[] args){
        
        new FastCash("");
    }
    
}