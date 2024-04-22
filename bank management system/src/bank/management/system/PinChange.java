
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PinChange extends JFrame  implements ActionListener {
    
     JPasswordField pin ,repin;
      JButton change,back;
      String pinnumber;

     
         PinChange(String pinnumber){
             this.pinnumber =pinnumber;
         
        setLayout(null);    
        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("icons/image atm.jpg"));
        Image im = i.getImage().getScaledInstance(900, 850, Image.SCALE_DEFAULT);
        ImageIcon ima = new ImageIcon(im);
        JLabel image = new JLabel(ima);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text = new JLabel("Change your PIN");
        text.setBounds(390,230,600,35);
        text.setForeground(Color.DARK_GRAY);
        text.setFont(new Font("System", Font.BOLD,16));
        image.add(text);
        
        JLabel pintext = new JLabel("New PIN");
        pintext.setBounds(190,320,180,25);
        pintext.setForeground(Color.white);
        pintext.setFont(new Font("System", Font.BOLD,16));
        image.add(pintext);
        
       pin = new  JPasswordField ();
       pin.setFont(new Font("Ralewat",Font.BOLD,25));
       pin.setBounds(350, 320, 180, 25);
       image.add(pin);
        
        JLabel repintext = new JLabel("Re-Enter new PIN");
        repintext.setBounds(170,360,180,25);
        repintext.setForeground(Color.white);
        repintext.setFont(new Font("System", Font.BOLD,16));
        image.add(repintext);
        
       repin = new  JPasswordField ();
       repin.setFont(new Font("Ralewat",Font.BOLD,25));
       repin.setBounds(350, 360, 180, 25);
       image.add(repin);
       
        change  = new JButton("Change");
        change.setBounds(590,485,150,30);
        change.addActionListener(this);
        image.add(change);
        
        back  = new JButton("Back");
        back.setBounds(590,520,150,30);
        back.addActionListener(this);
        image.add(back);
        
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);

        }
          
         public void actionPerformed(ActionEvent ae){
             if(ae.getSource() == change){
                try{
                    String npin = pin.getText();
                    String rpin = repin.getText();

                     if(!npin.equals(rpin)){
                        JOptionPane.showMessageDialog(null,"Entered PIN does not match");
                        return;
                    }
                     
                     if(npin.equals("")){
                        JOptionPane.showMessageDialog(null,"Please enter PIN");
                        return;
                    }
                     
                      if(rpin.equals("")){
                        JOptionPane.showMessageDialog(null,"Please re-enter new PIN");
                        return;
                    }
                      Conn conn = new Conn();
                       
                      String q1 = "update bank set pin = '"+rpin+"' where pin ='"+pinnumber+"'";
                      String q2 = "update login set pinnumber = '"+rpin+"' where pinnumber ='"+pinnumber+"'";
                      String q3 = "update signupthree set pinnumber = '"+rpin+"' where pinnumber ='"+pinnumber+"'";
                
                conn.s.executeUpdate(q1);
                conn.s.executeUpdate(q2);
                conn.s.executeUpdate(q3);
                
                JOptionPane.showMessageDialog(null,"PIN changed successfully");
                setVisible(false);
                new Transaction(rpin).setVisible(true);

                   }catch(Exception e){
                System.out.println(e);
                }
         } else{
             setVisible(false);
             new Transaction(pinnumber).setVisible(true);
             } 
         }
         public static void main(String[] args){
              new PinChange("").setVisible(true);
    
    
    }


}