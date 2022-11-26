package healxpert;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;

class WeightGain extends JFrame implements ActionListener{
    JLabel a1, a2, a3, a4, a5,a6, a7, a8, e0, e1, e2 ,e3, e4, e5;
    JButton back;
    
    WeightGain(){
        ImageIcon i2 = new ImageIcon(ClassLoader.getSystemResource("Icons/img9.jpg"));
        JLabel image1 = new JLabel(i2);
        image1.setBounds(0,0,900,500);
        add(image1);
        setLayout(null);
        
        JLabel heading = new JLabel("TIPS FOR WEIGHT GAIN");
        heading.setBounds(130,40,900,40);
        heading.setForeground(Color.BLACK);
        heading.setFont(new Font("serif", Font.BOLD, 50));
        image1.add(heading);
        
        a1 = new JLabel("1.Increase your caloric intake.");
        a1.setBounds(100,130,900,20);
        a1.setForeground(Color.BLACK);
        a1.setFont(new Font("serif", Font.BOLD, 15));
        image1.add(a1);
                
        a2 = new JLabel("2. Increase your protein intake.");
        a2.setBounds(100,150,900,20);
        a2.setForeground(Color.BLACK);
        a2.setFont(new Font("serif", Font.BOLD, 15));
        image1.add(a2);
        
        a3 = new JLabel("3.Increase your intake of carbs and fat.");
        a3.setBounds(100,170,900,20);
        a3.setForeground(Color.BLACK);
        a3.setFont(new Font("serif", Font.BOLD, 15));
        image1.add(a3);
        
        a4 = new JLabel("4. Increase your intake of energy-dense foods.");
        a4.setBounds(100,190,900,20);
        a4.setForeground(Color.BLACK);
        a4.setFont(new Font("serif", Font.BOLD, 15));
        image1.add(a4);
        
        a5 = new JLabel("5. Avoid drinking water before meals. This can fill your stomach and make it harder to get in enough calories.");
        a5.setBounds(100,210,900,20);
        a5.setForeground(Color.BLACK);
        a5.setFont(new Font("serif", Font.BOLD, 15));
        image1.add(a5);
        
        a6 = new JLabel("6.Get quality sleep. Sleeping properly is very important for muscle growth.");
        a6.setBounds(100,230,900,20);
        a6.setForeground(Color.BLACK);
        a6.setFont(new Font("serif", Font.BOLD, 15));
        image1.add(a6);
        
        a7 = new JLabel("7. Avoid Smoking.");
        a7.setBounds(100,250,900,20);
        a7.setForeground(Color.BLACK);
        a7.setFont(new Font("serif", Font.BOLD, 15));
        image1.add(a7);
        
        a8 = new JLabel("8. Take creatine.");
        a8.setBounds(100,270,900,20);
        a8.setForeground(Color.BLACK);
        a8.setFont(new Font("serif", Font.BOLD, 15));
        image1.add(a8);
        
        e0 = new JLabel("FOLLOW THIS EXERCISES SCHEDULE:");
        e0.setBounds(100,310,900,20);
        e0.setForeground(Color.BLACK);
        e0.setFont(new Font("serif", Font.BOLD, 15));
        image1.add(e0);
        
        e1 = new JLabel("1. 50 Squats");
        e1.setBounds(100,330,900,20);
        e1.setForeground(Color.BLACK);
        e1.setFont(new Font("serif", Font.BOLD, 15));
        image1.add(e1);
                
        e2 = new JLabel("2. 50 Push Ups");
        e2.setBounds(100,350,900,20);
        image1.add(e2);
        e2.setForeground(Color.BLACK);
        e2.setFont(new Font("serif", Font.BOLD, 15));
        
        e3 = new JLabel("3. 50 Lunges");
        e3.setBounds(100,370,900,20);
        e3.setForeground(Color.BLACK);
        e3.setFont(new Font("serif", Font.BOLD, 15));
        image1.add(e3);
        
        e4 = new JLabel("4. 30 Bench Press");
        e4.setBounds(100,390,900,20);
        e4.setForeground(Color.BLACK);
        e4.setFont(new Font("serif", Font.BOLD, 15));
        image1.add(e4);
        
        e5 = new JLabel("5. 10 Pull ups");
        e5.setBounds(100,410,900,20);
        e5.setForeground(Color.BLACK);
        e5.setFont(new Font("serif", Font.BOLD, 15));
        image1.add(e5);
        
        back = new JButton("Back");
        back.setBounds(700,400,120,40);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        image1.add(back);
        
        setBounds(0,0,900,500);
        setVisible(true);
        
    }
public void actionPerformed(ActionEvent ae){
    if(ae.getSource()== back){
        setVisible(false);
        new secondpage();
    }
}    
public static void main(String[] args){
    new WeightGain();
}

    }