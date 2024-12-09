
package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;

public class AddStudent extends JFrame implements ActionListener{
    
    JTextField tfname,tffname,tfaddress,tfphone,tfemail,tfx,tfxii,tfnid;
    JLabel labelrollno;
    JDateChooser dcdob;
    JComboBox cbcourse,cbdegree;
    JButton submit,cancel;
    
    Random ran = new Random();
    long first3 = Math.abs((ran.nextLong() % 900L) + 100L);
    
    AddStudent()
    {
        
        setSize(900,700);
        setLocation(490,190);
        
        setLayout(null);
        
        JLabel heading = new JLabel("New Student Information");
        heading.setBounds(260,30,500,50);
        heading.setFont(new Font("serif",Font.BOLD,30));
        add(heading);
        
        
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(30,140,100,50);
        lblname.setFont(new Font("serif",Font.BOLD,20));
        add(lblname);
        
    
        tfname = new JTextField();
        tfname.setBounds(200, 155, 150, 30);
        add(tfname);
        
        
        
        JLabel lblfname = new JLabel("Father's Name");
        lblfname.setBounds(400,150,200,30);
        lblfname.setFont(new Font("serif",Font.BOLD,20));
        add(lblfname);
        
    
        tffname = new JTextField();
        tffname.setBounds(600, 155, 150, 30);
        add(tffname);
        
        
        
        JLabel lblrollno = new JLabel("Roll Number");
        lblrollno.setBounds(30,220,200,30);
        lblrollno.setFont(new Font("serif",Font.BOLD,20));
        add(lblrollno);
        
        labelrollno = new JLabel("21225103"+first3);
        labelrollno.setBounds(200,220,200,30);
        labelrollno.setFont(new Font("serif",Font.BOLD,20));
        add(labelrollno);
        
        
        
        JLabel lbldob = new JLabel("Date of Birth");
        lbldob.setBounds(400,215,200,30);
        lbldob.setFont(new Font("serif",Font.BOLD,20));
        add(lbldob);
        
        
        dcdob = new JDateChooser();
        dcdob.setBounds(600,215,150,30);
        add(dcdob);
        
        
        
        JLabel lbladdress = new JLabel("Address");
        lbladdress.setBounds(30,280,200,30);
        lbladdress.setFont(new Font("serif",Font.BOLD,20));
        add(lbladdress);
        
    
        tfaddress = new JTextField();
        tfaddress.setBounds(200, 280, 150, 30);
        add(tfaddress);
        
        
        
        JLabel lblphone = new JLabel("Phone Number");
        lblphone.setBounds(400,275,200,30);
        lblphone.setFont(new Font("serif",Font.BOLD,20));
        add(lblphone);
        
    
        tfphone = new JTextField();
        tfphone.setBounds(600, 275, 150, 30);
        add(tfphone);
        
        
        
        
        
        JLabel lblemail = new JLabel("Email Id");
        lblemail.setBounds(30,330,200,30);
        lblemail.setFont(new Font("serif",Font.BOLD,20));
        add(lblemail);
        
    
        tfemail = new JTextField();
        tfemail.setBounds(200, 330, 150, 30);
        add(tfemail);
        
        
        
        
        
        JLabel lblx = new JLabel("Class X (%)");
        lblx.setBounds(400,330,200,30);
        lblx.setFont(new Font("serif",Font.BOLD,20));
        add(lblx);
        
    
        tfx = new JTextField();
        tfx.setBounds(600, 330, 150, 30);
        add(tfx);
        
        
        
        
        
         JLabel lblxii = new JLabel("Class XII (%)");
        lblxii.setBounds(30,380,200,30);
        lblxii.setFont(new Font("serif",Font.BOLD,20));
        add(lblxii);
        
    
        tfxii = new JTextField();
        tfxii.setBounds(200, 380, 150, 30);
        add(tfxii); 
        
        
        
        JLabel lblnid = new JLabel("NID Number");
        lblnid.setBounds(400,380,200,30);
        lblnid.setFont(new Font("serif",Font.BOLD,20));
        add(lblnid);
        
    
        tfnid = new JTextField();
        tfnid.setBounds(600, 380, 150, 30);
        add(tfnid);
        
        
        
        JLabel lblcourse = new JLabel("Course");
        lblcourse.setBounds(30,430,200,30);
        lblcourse.setFont(new Font("serif",Font.BOLD,20));
        add(lblcourse);
        
        
        String course[] = {"CSE","EEE","BBA","MATH","CIVIL","TEXTILE"};
        cbcourse = new JComboBox(course);
        cbcourse.setBounds(200,430,150,30);
        cbcourse.setBackground(Color.WHITE);
        add(cbcourse);
        
        
        
        JLabel lbldegree = new JLabel("Degree");
        lbldegree.setBounds(400,430,200,30);
        lbldegree.setFont(new Font("serif",Font.BOLD,20));
        add(lbldegree);
        
        
        String degree[] = {"BSc","MBA","MCom","BS","BDM","BSS","BA","BTech"};
        cbdegree = new JComboBox(degree);
        cbdegree.setBounds(600,430,150,30);
        cbdegree.setBackground(Color.WHITE);
        add(cbdegree);
        
        
        
        
        submit = new JButton("Submit");
        submit.setBounds(250,550,110,30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("serif",Font.BOLD,18));
        submit.addActionListener(this);
        add(submit);
        
        
        
        cancel = new JButton("Cancel");
        cancel.setBounds(480,550,110,30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("serif",Font.BOLD,18));
        cancel.addActionListener(this);
        add(cancel);
        
        
        
        
        
        
        
        setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == submit)
        {
            String name = tfname.getText();
            String fname = tffname.getText();
            String rollno = labelrollno.getText();
            String dob = ((JTextField) dcdob.getDateEditor().getUiComponent()).getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String x = tfx.getText();
            String xii = tfxii.getText();
            String nid = tfnid.getText();
            String course = (String) cbcourse.getSelectedItem();
            String degree = (String) cbdegree.getSelectedItem();
            
            try {
                
                String query = "insert into student values('"+name+"' , '"+fname+"', '"+rollno+"', '"+dob+"', '"+address+"', '"+phone+"', '"+email+"', '"+x+"', '"+xii+"', '"+nid+"', '"+course+"', '"+degree+"')";
                
                Conn con = new Conn();
                con.s.executeUpdate(query);
                
                
                JOptionPane.showMessageDialog(null, "Student Details Inserted Successfully");
                setVisible(false);
            } catch(Exception e){
                e.printStackTrace();
            }
            
            
            
            
        }
        else
        {
            setVisible(false);
        }
        
    }
    
    
    public static void main(String[] args)
    {
        new AddStudent();
    }
    
}
