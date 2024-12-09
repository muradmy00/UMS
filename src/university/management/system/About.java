package university.management.system;

import javax.swing.*;
import java.awt.*;

public class About extends JFrame {

    About() {
        setSize(1000, 700);
        setLocation(400, 150);
        getContentPane().setBackground(Color.WHITE);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/about.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 10, 300, 200);
        add(image);
        
        JLabel heading = new JLabel("<html>University<br/>Management System</html>");
        heading.setBounds(70, 20, 300, 130);
        heading.setFont(new Font("serif", Font.BOLD, 30));
        add(heading);
        
        JLabel name = new JLabel("Developed By: Md Mohiuddin Murad");
        name.setBounds(70, 300, 500, 40);
        name.setFont(new Font("serif", Font.BOLD, 25));
        add(name);
        
        JLabel rollno = new JLabel("ID Number: 21225103160");
        rollno.setBounds(70, 350, 550, 40);
        rollno.setFont(new Font("serif", Font.PLAIN, 30));
        add(rollno);
        
        JLabel contact = new JLabel("Contact: murad.my00@gmail.com");
        contact.setBounds(70, 400, 550, 40);
        contact.setFont(new Font("serif", Font.PLAIN, 20));
        add(contact);
        
        setLayout(null);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new About();
    }
}