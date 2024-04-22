
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Transaction extends JFrame implements ActionListener{
    
    JButton deposit,withdrawal,fastcash ,ministatement,pinchange,balanceenquiry,exit;
    String pinnumber;
    Transaction(String pinnumber){
        this.pinnumber = pinnumber;
        setLayout(null);
        
    
        setLayout(null);
        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("icons/image atm.jpg"));
        Image im = i.getImage().getScaledInstance(900, 850, Image.SCALE_DEFAULT);
        ImageIcon ima = new ImageIcon(im);
        JLabel image = new JLabel(ima);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text = new JLabel("Please select your Text");
        text.setBounds(380,300,600,35);
        text.setForeground(Color.white);
        text.setFont(new Font("System", Font.BOLD,16));
        image.add(text);
        
        deposit = new JButton("Deposit");
        deposit.setBounds(170,415,150,30);
         deposit.setForeground(Color.black);
          deposit.setBackground(Color.white);
        deposit.addActionListener(this);
        image.add(deposit);
        
        withdrawal  = new JButton("Cash withdrawal");
        withdrawal.setBounds(590,415,150,30);
         withdrawal.setForeground(Color.black);
          withdrawal.setBackground(Color.white);
        withdrawal.addActionListener(this);
        image.add(withdrawal);
        
        fastcash  = new JButton("Fast Cash");
        fastcash.setBounds(170,450,150,30);
        fastcash.setForeground(Color.black);
          fastcash.setBackground(Color.white);
        fastcash.addActionListener(this);
        image.add(fastcash);
        
        ministatement  = new JButton("Mini Statement");
        ministatement.setBounds(590,450,150,30);
        ministatement.setForeground(Color.black);
          ministatement.setBackground(Color.white);
        ministatement.addActionListener(this);
        image.add(ministatement);
        
         pinchange  = new JButton("Pin Change");
        pinchange.setBounds(170,485,150,30);
        pinchange.setForeground(Color.black);
          pinchange.setBackground(Color.white);
        pinchange.addActionListener(this);
        image.add(pinchange);
        
        balanceenquiry  = new JButton("Balance Enqiury");
        balanceenquiry.setBounds(590,485,150,30);
        balanceenquiry.addActionListener(this);
         balanceenquiry.setForeground(Color.black);
          balanceenquiry.setBackground(Color.white);

        image.add(balanceenquiry);
        
        exit  = new JButton("Exit");
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
            System.exit(0);
        
        }else if(ae.getSource() == deposit){
            setVisible(false);
            new Deposit(pinnumber).setVisible(true);
        
        } else if(ae.getSource() == withdrawal){
            setVisible(false);
            new Withdrawl(pinnumber).setVisible(true);
        
        } else if(ae.getSource() == fastcash){
            setVisible(false);
            new FastCash(pinnumber).setVisible(true);
        
        } else if(ae.getSource() == pinchange){
            setVisible(false);
            new PinChange(pinnumber).setVisible(true);
        
        } else if(ae.getSource() == balanceenquiry){
            setVisible(false);
            new BalanceEnqiry(pinnumber).setVisible(true);
        } else if(ae.getSource() == ministatement){
            new MiniStatement(pinnumber).setVisible(true);
        }
            
    
    }
       public static void main(String[] args){
        
        new Transaction("");
    }
    
}
