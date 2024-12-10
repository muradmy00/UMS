
package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import net.proteanit.sql.DbUtils;

public class StudentDetails extends JFrame implements ActionListener{
    
    
    Choice crollno;
    JTable table;
    JButton search,print,update,add,cancel;
    
    StudentDetails(){
        
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
        JLabel heading = new JLabel("Search by Roll Number");
        heading.setBounds(20,20,180,40);
        heading.setFont(new Font("serif",Font.BOLD,14));
        add(heading);
        
        
        crollno = new Choice();
        crollno.setBounds(210,30,150,20);
        add(crollno);
        
        
        try{
            
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from student");
            while(rs.next())
            {
                crollno.add(rs.getString("rollno"));
            }
        } 
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        
        
        table = new JTable();
        
        
        
        try{
            
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from student");
            table.setModel(DbUtils.resultSetToTableModel(rs));
             
        } 
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        
        
        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(0,100,1200,700);
        add(jsp);
        
        
        
        
        search = new JButton("Search");
        search.setBounds(20,70,80,20);
        search.setBackground(Color.BLACK);
        search.setForeground(Color.WHITE);
        search.addActionListener(this);
        add(search);
        
        
        print = new JButton("Print");
        print.setBounds(120,70,80,20);
        print.setBackground(Color.BLACK);
        print.setForeground(Color.WHITE);
        print.addActionListener(this);
        add(print);
        
        update = new JButton("Update");
        update.setBounds(220,70,80,20);
        update.setBackground(Color.BLACK);
        update.setForeground(Color.WHITE);
        update.addActionListener(this);
        add(update);
        
        
        add = new JButton("Add");
        add.setBounds(320,70,80,20);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        add(add);
        
        
        cancel = new JButton("Cancel");
        cancel.setBounds(420,70,80,20);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        add(cancel);
        
        
         
        
        
        setSize(1200,700);
        setLocation(490,210);
        setVisible(true);
        
    }
    
    
     public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == search)
        {
            String query = "select * from student where rollno = '"+crollno.getSelectedItem()+"'";
            
            try{
                
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);
                table.setModel(DbUtils.resultSetToTableModel(rs));
                
            }catch(Exception e){
                
                e.printStackTrace();
            }
        }
        else if(ae.getSource() == print)
        {
            try{
                table.print();
                
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(ae.getSource() == update)
        {
             setVisible(false);
            //new UpdateStudent();
        }
        else if(ae.getSource() == add)
        {
            setVisible(false);
            new AddStudent();
        }
        else
        {
             setVisible(false);
        }
        
    }
    
    
    public static void main(String[] args){
        new StudentDetails();
    }
    
}