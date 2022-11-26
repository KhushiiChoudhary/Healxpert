package healxpert;
import java.awt.Color;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import javax.swing.*;

public class login extends JFrame implements ActionListener {
    JButton login;
   
    login(){
        
        ImageIcon i2 = new ImageIcon(ClassLoader.getSystemResource("Icons/img3.jpg"));
        JLabel image1 = new JLabel(i2);
        image1.setBounds(0,0,900,500);
        add(image1);
        
        setLayout(null);
        
        JLabel heading = new JLabel("HEALXPERT");
        heading.setBounds(300,20,400,40);
        heading.setForeground(Color.BLACK);
        heading.setFont(new Font("serif", Font.BOLD, 50));
        image1.add(heading);
        
        JLabel heading1 = new JLabel("CHEERS TO GOOD HEALTH");
        heading1.setBounds(240,70,500,25);
        heading1.setForeground(Color.YELLOW);
        heading1.setFont(new Font("serif", Font.BOLD, 30));
        image1.add(heading1);

        
        JLabel name = new JLabel("NAME:");
        name.setBounds(100,150,100,30);
        name.setFont(new Font("serif", Font.BOLD, 20));
        name.setForeground(Color.BLACK);
        image1.add(name);
        
        JTextField name1 = new JTextField();
        name1.setBounds(220,150,200,30);
        image1.add(name1); 
                    
        JLabel age = new JLabel("AGE:");
        age.setBounds(100,200,100,30);
        age.setFont(new Font("serif", Font.BOLD, 20));
        age.setForeground(Color.BLACK);image1.add(age);
        
        JTextField age1 = new JTextField();
        age1.setBounds(220,200,200,30);
        image1.add(age1);
        
        login = new JButton("Login");
        login.setBounds(220,300,120,40);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        image1.add(login);
         
        JLabel gender = new JLabel("GENDER:");
        gender.setBounds(100,250,100,30);
        gender.setFont(new Font("serif", Font.BOLD, 20));
        gender.setForeground(Color.BLACK);
        image1.add(gender);
        
        JRadioButton gender1 = new JRadioButton("Male");
        gender1.setBounds(220,250,100,30);
        JRadioButton gender2 = new JRadioButton("Female");
        gender2.setBounds(320,250,100,30);
        image1.add(gender1);
        image1.add(gender2);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/img1.jpg"));
        JLabel image = new JLabel(i1) ;
        image.setBounds(550,130,220,220);
        image1.add(image);
               
        setBounds(250,250,900,450);
        setVisible(true);
        
    
}
public void actionPerformed(ActionEvent ae){
    if(ae.getSource()== login){
        setVisible(false);
        new secondpage();
    }
}
public static void main(String[] args){
    new login();
}

    }


