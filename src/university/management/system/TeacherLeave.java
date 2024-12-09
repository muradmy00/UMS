package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import net.proteanit.sql.DbUtils;
import com.toedter.calendar.JDateChooser;


public class TeacherLeave extends JFrame implements ActionListener{
    
    Choice cempId,ctime;
    JDateChooser dcdate;
    JButton submit,cancel;
    
    TeacherLeave(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
        
        JLabel heading = new JLabel("Apply Leave (Teacher):");
        heading.setBounds(40,50,300,30);
        heading.setFont(new Font("serif",Font.BOLD,20));
        add(heading);
        
        
        
        JLabel lblrollno = new JLabel("Search by Employee Id");
        lblrollno.setBounds(60,100,200,40);
        lblrollno.setFont(new Font("serif",Font.PLAIN,18));
        add(lblrollno);
        
        
        cempId = new Choice();
        cempId.setBounds(60,150,200,25);
        add(cempId);
        
        
        try{
            
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from teacher");
            while(rs.next())
            {
                cempId.add(rs.getString("empId"));
            }
        } 
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        
        
        JLabel lbldate = new JLabel("Date");
        lbldate.setBounds(60,190,200,40);
        lbldate.setFont(new Font("serif",Font.PLAIN,18));
        add(lbldate);
        
        
        dcdate = new JDateChooser();
        dcdate.setBounds(60,235,200,25);
        add(dcdate);
        
        
        
        
        JLabel lbltime = new JLabel("Time Duration");
        lbltime.setBounds(60,280,200,40);
        lbltime.setFont(new Font("serif",Font.PLAIN,18));
        add(lbltime);
        
        
        ctime = new Choice();
        ctime.setBounds(60,330,200,25);
        ctime.add("Full Day");
        ctime.add("Half Day");
        add(ctime);
        
        
        submit = new JButton("Submit");
        submit.setBounds(60,400,110,28);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("serif",Font.BOLD,18));
        submit.addActionListener(this);
        add(submit);
        
        
        
        cancel = new JButton("Cancel");
        cancel.setBounds(200,400,110,28);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("serif",Font.BOLD,18));
        cancel.addActionListener(this);
        add(cancel);
        
        
        
        
        
        
        
        
        setSize(500,550);
        setLocation(740,260);
        setVisible(true);
        
        
        
        
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == submit)
        {
            String rollno = cempId.getSelectedItem();
            String date = ((JTextField) dcdate.getDateEditor().getUiComponent()).getText();
            String duration = ctime.getSelectedItem();
            
            String query = "insert into teacherleave values('"+rollno+"','"+date+"','"+duration+"')";
            
              try{
                  
                  Conn c = new Conn();
                  c.s.executeUpdate(query);
                  JOptionPane.showMessageDialog(null, "Leave Confirmed"); 
                  setVisible(false);
                  
              }catch(Exception e){
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
        new TeacherLeave();
    }
}
