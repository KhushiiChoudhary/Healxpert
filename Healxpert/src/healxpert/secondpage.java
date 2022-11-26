package healxpert;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class secondpage extends JFrame implements ActionListener {
    JButton title1, title2, title3;
    
    secondpage(){
        
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("Icons/img3.jpg"));
        JLabel image4;
        image4 = new JLabel(i4);
        image4.setBounds(0,0,900,450);
        add(image4);
        
        JLabel heading = new JLabel("WHAT DO YOU WISH TO ACHIEVE");
        heading.setBounds(100,20,800,40);
        heading.setForeground(Color.YELLOW);
        heading.setFont(new Font("serif", Font.BOLD, 40));
        image4.add(heading);
        
        
        JLabel heading1 = new JLabel("FROM THIS APP???");
        heading1.setBounds(250,70,800,40);
        heading1.setForeground(Color.YELLOW);
        heading1.setFont(new Font("serif", Font.BOLD, 40));
        image4.add(heading1);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/img4.jpg"));
        JLabel image1 = new JLabel(i1);
        image1.setBounds(100,130,200,200);
        image4.add(image1);
        
        title1 = new JButton("QUICK TIPS");
        title1.setBounds(100,340,200,60);
        title1.setFont(new Font("serif", Font.BOLD, 20));
        title1.setForeground(Color.WHITE);
        title1.setBackground(Color.BLACK);
        title1.addActionListener(this);
        image4.add(title1);
      
        ImageIcon i2 = new ImageIcon(ClassLoader.getSystemResource("Icons/img6.jpg"));
        JLabel image2 = new JLabel(i2);
        image2.setBounds(350,130,200,200);
        image4.add(image2);
        
        title2 = new JButton("WEIGHT LOSS");
        title2.setBounds(350,340,200,60);
        title2.setFont(new Font("serif", Font.BOLD, 20));
        title2.setForeground(Color.WHITE);
        title2.setBackground(Color.BLACK);
        title2.addActionListener((ActionListener) this);
        image4.add(title2);
        
        ImageIcon i3 = new ImageIcon(ClassLoader.getSystemResource("Icons/img11.jpeg"));
        JLabel image3 = new JLabel(i3);
        image3.setBounds(600,130,200,200);
        image4.add(image3);
        
        title3 = new JButton ("WEIGHT GAIN");
        title3.setBounds(600,340,200,60);
        title3.setFont(new Font("serif", Font.BOLD, 20));
        title3.setForeground(Color.WHITE);
        title3.setBackground(Color.BLACK);
        title3.addActionListener((ActionListener) this);
        image4.add(title3);
        
        setBounds(600,250,900,450);
        setVisible(true);
        
    
}
   
public void actionPerformed(ActionEvent ae){
    if(ae.getSource()== title1){
        setVisible(false);
         new QuickTips();
        }
        
    if(ae.getSource()== title2){
        setVisible(false);
        new WeightLoss();
        }
        
    if(ae.getSource()== title3){
        setVisible(false);
        new WeightGain();
    }
}
 
public static void main(String[] args){
    new secondpage();
}

    }
