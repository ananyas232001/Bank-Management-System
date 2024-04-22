
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener {
    
    long random;
    JTextField pan,aadhar;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
    JComboBox religion,category,eduqu,income,occupation;
    String formno;
    
    SignupTwo(String formno){
        this.formno = formno;
       setLayout(null);
       
       setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
       
       ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("icons/Blue.jpg"));
        Image im = i.getImage().getScaledInstance(900, 850, Image.SCALE_DEFAULT);
        ImageIcon ima = new ImageIcon(im);
        JLabel image = new JLabel(ima);
        image.setBounds(0,0,900,900);
        add(image);
        
      
       JLabel addDetails = new JLabel("Page 2: Additional Details");
       addDetails.setFont(new Font("Ralewat",Font.BOLD,22));
       addDetails.setBounds(290, 40, 400, 30);
       image.add(addDetails);
       
       JLabel name = new JLabel("Religion: ");
       name.setFont(new Font("Ralewat",Font.BOLD,22));
       name.setBounds(100, 100, 100, 30);
       image.add(name);
       
       String val[] = {"Hindu","Muslim","Sikh","Christian","other"};
       religion = new JComboBox(val);
       religion.setBounds(300, 100, 400, 30);
       religion.setBackground(Color.white);
       image.add(religion);
       
      
       JLabel fname = new JLabel("Category: ");
       fname.setFont(new Font("Ralewat",Font.BOLD,22));
       fname.setBounds(100, 150, 200, 30);
       image.add(fname);
       
       String valc[] = {"General","OBC","SC","ST","other"};
       category = new JComboBox(valc);
       category.setBounds(300, 150, 400, 30);
       category.setBackground(Color.white);
       image.add(category);
      
       
       JLabel dob = new JLabel("Income: ");
       dob.setFont(new Font("Ralewat",Font.BOLD,22));
       dob.setBounds(100, 200, 200, 30);
       image.add(dob);
       
       String vali[] = {"Null","< 1,50,0000","< 2,50,0000","< 5,00,0000","Upto 10,00,000"};
       income = new JComboBox(vali);
       income.setBounds(300,200,400,30);
       income.setBackground(Color.white);
       image.add(income);
       
       JLabel gender = new JLabel("Educationl ");
       gender.setFont(new Font("Ralewat",Font.BOLD,22));
       gender.setBounds(100, 250, 200, 30);
       image.add(gender);
        
       JLabel email = new JLabel("Qualification: ");
       email.setFont(new Font("Ralewat",Font.BOLD,22));
       email.setBounds(100, 275, 200, 30);
       image.add(email);
       
       String valq[] = {"Non-Graduate","Graduate","Post-Graduate","Doctarate","other"};
       eduqu = new JComboBox(valq);
       eduqu.setBounds(300,265,400,30);
       eduqu.setBackground(Color.white);
       image.add(eduqu);
       
       JLabel marital = new JLabel("Occupation: ");
       marital.setFont(new Font("Ralewat",Font.BOLD,22));
       marital.setBounds(100, 320, 200, 30);
       image.add(marital);
       
       String valo[] = {"Salaried","Buisness","Self-Employed","Student","other"};
       occupation = new JComboBox(valo);
       occupation.setBounds(300,320,400,30);
       occupation.setBackground(Color.white);
       image.add(occupation);
       
       
       JLabel address = new JLabel("PAN Number: ");
       address.setFont(new Font("Ralewat",Font.BOLD,22));
       address.setBounds(100, 370, 200, 30);
       image.add(address);
       
       pan = new  JTextField ();
       pan.setFont(new Font("Ralewat",Font.BOLD,14));
       pan.setBounds(300, 370, 400, 30);
       image.add(pan);
       
       JLabel city = new JLabel("Aadhar Number: ");
       city.setFont(new Font("Ralewat",Font.BOLD,22));
       city.setBounds(100, 420, 200, 30);
       image.add(city);
       
       aadhar = new  JTextField ();
       aadhar.setFont(new Font("Ralewat",Font.BOLD,14));
       aadhar.setBounds(300, 420, 400, 30);
       image.add(aadhar);
       
        JLabel state = new JLabel("Senior Citizen: ");
       state.setFont(new Font("Ralewat",Font.BOLD,22));
       state.setBounds(100, 470, 200, 30);
       image.add(state);
       
       syes = new JRadioButton("Yes");
       syes.setBounds(300,470,100,30);
       syes.setBackground(Color.WHITE);
       image.add(syes);
       
        sno = new JRadioButton("No");
        sno.setBounds(450,470,100,30);
        sno.setBackground(Color.WHITE);
        image.add(sno);
        
       ButtonGroup mgroup = new ButtonGroup();
       mgroup.add(syes);
       mgroup.add(sno);
       
       JLabel pincode = new JLabel("Existing Account: ");
       pincode.setFont(new Font("Ralewat",Font.BOLD,22));
       pincode.setBounds(100, 520, 200, 30);
       image.add(pincode);
       
       eyes = new JRadioButton("Yes");
       eyes.setBounds(300,520,100,30);
       eyes.setBackground(Color.WHITE);
       image.add(eyes);
       
        eno = new JRadioButton("No");
        eno.setBounds(450,520,100,30);
        eno.setBackground(Color.WHITE);
        image.add(eno);
        
       ButtonGroup emgroup = new ButtonGroup();
      emgroup.add(eyes);
      emgroup.add(eno);
       
       next = new JButton("Next");
       next.setFont(new Font("Ralewat",Font.BOLD,14));
       next.setBackground(Color.black);
       next.setForeground(Color.WHITE);
       next.setBounds(620,600,80,30);
       next.addActionListener(this);
       image.add(next);
       
       
       
        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setVisible(true);
        setLocation(350,10);
    
    
    }
    
    public void actionPerformed(ActionEvent ae){
        String formno = "" + random;
        String sreligion = (String)religion.getSelectedItem();
        String scategory = (String)category.getSelectedItem();
        String sincome = (String)income.getSelectedItem();
        String seducation = (String)eduqu.getSelectedItem();;
        String soccupation = (String)occupation.getSelectedItem();;
        String seniorcitizen = null;
        if(syes.isSelected()){
            seniorcitizen = "Yes";
        }
        else if (sno.isSelected()){
            seniorcitizen = "No";
        }
        
         String excistingaccount = null;
         if(eyes.isSelected()){
            excistingaccount = "Yes";
        }
        else if (eno.isSelected()){
            excistingaccount = "No";
        }
       
        String span = pan.getText();
        String saadhar = aadhar.getText();
       


        try 
        {
            Conn c = new Conn();
            String query = "insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+seniorcitizen+"','"+excistingaccount+"','"+span+"','"+saadhar+"')";        
            c.s.executeUpdate(query);   
            
            setVisible(false);
            new SignupThree(formno).setVisible(true);
         
          } catch (Exception e){
              System.out.println(e);   
                     }
    }
    
    
    public static void main(String[] args)
    {
        new SignupTwo("");
    
    
    }
    
}
