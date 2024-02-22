
package bank.management.system;

import java.awt.*;
import java.util.Random;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;


public class SignUpOne extends JFrame implements ActionListener {
    
    JTextField nameTextField, fnameTextField ,stateTextField,pincodeTextField,addressTextField,emailTextField,cityTextField;
    JButton next;
    Random ran;
    JRadioButton male,female,other,oth,married,unmarried;
    JLabel formno,name,fname,pageno,email,address,state,pincode,city,gender,dob,marital;
    JDateChooser dateChooser;
    ButtonGroup genderGroup , marriedGroup;
    SignUpOne(){
        
        
        
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,1000);
        setLocation(250,10);
        setVisible(true);
        setLayout(null);
        
        
        
         ran = new Random();
        int ran_num = ran.nextInt(10000);
        
        
         formno = new JLabel("APPLICATION FORM NO. "+ ran_num);
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(140,30, 600, 30);
        add(formno);
        
         pageno = new JLabel("Page 1: Personal Details");
        pageno.setFont(new Font("Raleway",Font.BOLD,22));
        pageno.setBounds(290,80, 300, 30);
        add(pageno);
        
        
         name = new JLabel("Name: ");
        name.setFont(new Font("Raleway",Font.BOLD,22));
        name.setBounds(120,160,100, 30);
        add(name);
        
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway",Font.BOLD,12));
        nameTextField.setBounds(350, 160, 300, 30);
        add(nameTextField);
        
        
         fname = new JLabel("Father's Name: ");
        fname.setFont(new Font("Raleway",Font.BOLD,22));
        fname.setBounds(120,210,200, 30);
        add(fname);
        
        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway",Font.BOLD,12));
        fnameTextField.setBounds(350, 210, 300, 30);
        add(fnameTextField);
        
         dob = new JLabel("Date Of Birth: ");
        dob.setFont(new Font("Raleway",Font.BOLD,22));
        dob.setBounds(120,260,200, 30);
        add(dob);
        
       
        
         dateChooser = new JDateChooser();
        dateChooser.setBounds(350, 260, 300, 30);
        add(dateChooser);
        
        
        
        
         gender = new JLabel("Gender: ");
        gender.setFont(new Font("Raleway",Font.BOLD,22));
        gender.setBounds(120,310,200, 30);
        add(gender);
        
        male = new JRadioButton("male");
        male.setBackground(Color.WHITE);
        male.setBounds(350, 310, 90, 30);
        add(male);
        
         female = new JRadioButton("female");
         female.setBounds(450, 310, 90, 30);
         female.setBackground(Color.WHITE);
        add(female);
        
         oth = new JRadioButton("other");
         oth.setBounds(580, 310, 90, 30);
         oth.setBackground(Color.WHITE);
        add(oth);
        
        
         genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        
        
        
        
         email = new JLabel("Email Address: ");
        email.setFont(new Font("Raleway",Font.BOLD,22));
        email.setBounds(120,360,200, 30);
        add(email);
        
        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway",Font.BOLD,12));
        emailTextField.setBounds(350, 360, 300, 30);
        add(emailTextField);
        
        
         marital = new JLabel("Marital status: ");
        marital.setFont(new Font("Raleway",Font.BOLD,22));
        marital.setBounds(120,410,200, 30);
        add(marital);
        
        
         married = new JRadioButton("married");
        married.setBackground(Color.WHITE);
        married.setBounds(350, 410, 90, 30);
        add(married);
        
         unmarried = new JRadioButton("unmarried");
         unmarried.setBounds(450, 410, 90, 30);
         unmarried.setBackground(Color.WHITE);
        add(unmarried);
        
         other = new JRadioButton("other");
         other.setBounds(580, 410, 90, 30);
         other.setBackground(Color.WHITE);
        add(other);
        
         marriedGroup = new ButtonGroup();
        marriedGroup.add(married);
        marriedGroup.add(unmarried);
        marriedGroup.add(other);
        
         address = new JLabel("Address: ");
        address.setFont(new Font("Raleway",Font.BOLD,22));
        address.setBounds(120,460,100, 30);
        add(address);
        
       addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway",Font.BOLD,12));
        addressTextField.setBounds(350, 460, 300, 30);
        add(addressTextField);
        
        
         city = new JLabel("City: ");
        city.setFont(new Font("Raleway",Font.BOLD,22));
        city.setBounds(120,510,100, 30);
        add(city);
        
        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway",Font.BOLD,12));
        cityTextField.setBounds(350, 510, 300, 30);
        add(cityTextField);
        
        
         state = new JLabel("State: ");
        state.setFont(new Font("Raleway",Font.BOLD,22));
        state.setBounds(120,560,200, 30);
        add(state);
        
        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway",Font.BOLD,12));
        stateTextField.setBounds(350, 560, 300, 30);
        add(stateTextField);
        
        
         pincode = new JLabel("Pincode: ");
        pincode.setFont(new Font("Raleway",Font.BOLD,22));
        pincode.setBounds(120,610,200, 30);
        add(pincode);
        
        pincodeTextField = new JTextField();
        pincodeTextField.setFont(new Font("Raleway",Font.BOLD,12));
        pincodeTextField.setBounds(350, 610, 300, 30);
        add(pincodeTextField);
        
        next = new JButton("NEXT");
        next.setBounds(550, 700, 100, 30);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,22));
        add(next);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
    
        String formno = ""+ran;
        String name = ""+ran;
        String fname = ""+ran;
        String dob = ""+ran;
        String gender = null;
        
        if(male.isSelected()){
            
            gender = "male";
        }else if(female.isSelected()){
            gender = female
        }
        else if(female.isSelected()){
            gender = female
        }
        
        
    }
    public static void main(String[] args){
        SignUpOne signUpOne = new SignUpOne();
    }
    
}
