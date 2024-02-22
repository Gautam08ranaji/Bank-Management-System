
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Login extends JFrame implements ActionListener{
    
    JButton loginbutton, signupbutton ,clearbutton;
    JTextField cardTextFields;
    JPasswordField pinTextFields;
    
    Login(){
        
        setTitle("AUTOMATED TELLER MACHINE");
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(110, 20, 100,100);
        add(label);
        
        JLabel text = new JLabel("WELCOME TO ATM");
        add(text);
        text.setFont(new Font("Osward",Font.BOLD,38));
        text.setBounds(240, 50, 400, 40);
        
        JLabel cardno = new JLabel("Card No:");
        add(cardno);
        cardno.setFont(new Font("Arial",Font.BOLD,20));
        cardno.setBounds(175, 155, 200, 40);
        cardTextFields = new JTextField();
        cardTextFields.setBounds(300,160,250,30);
        add(cardTextFields);
        
        JLabel pin = new JLabel("Pin:");
        add(pin);
        pin.setFont(new Font("Arial",Font.BOLD,20));
        pin.setBounds(175, 215, 150, 40);
        pinTextFields = new JPasswordField();
        pinTextFields.setBounds(300,220,250,30);
        add(pinTextFields);
        
        loginbutton = new JButton("LOG IN");
        loginbutton.setFont(new Font("Raleway",Font.BOLD,13));
        loginbutton.setBackground(Color.BLACK);
        loginbutton.setForeground(Color.WHITE);
        loginbutton.setBounds(300, 270, 100, 30);
        loginbutton.addActionListener(this);
        add(loginbutton);
        
        
        clearbutton = new JButton("CLEAR");

        clearbutton.setFont(new Font("Raleway",Font.BOLD,13));
        clearbutton.setBackground(Color.BLACK);
        clearbutton.setForeground(Color.WHITE);
        clearbutton.setBounds(450, 270, 100, 30);
        clearbutton.addActionListener(this);
        add(clearbutton);
        
        signupbutton = new JButton("SIGN UP");
        signupbutton.setFont(new Font("Raleway",Font.BOLD,13));
        signupbutton.setBackground(Color.BLACK);
        signupbutton.setForeground(Color.WHITE);
        signupbutton.setBounds(300, 320, 250, 30);
        signupbutton.addActionListener(this);
        add(signupbutton);
        
        
        getContentPane().setBackground(Color.WHITE);
        
        
        setSize(800,480);
        setVisible(true);
        setLocation(220,150);
    }
    
      @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource()== loginbutton){
            System.out.println("login button pressed");
        }
        else if(ae.getSource()== clearbutton){
            cardTextFields.setText("");
            pinTextFields.setText("");
                  
        }
        else if(ae.getSource()== signupbutton){
            System.out.println("signup button pressed");
        }
       
    }
    
    public static void main(String [] args){
        Login login = new Login();
    }

}
