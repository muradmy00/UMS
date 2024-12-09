
package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import net.proteanit.sql.DbUtils;

public class TeacherDetails extends JFrame implements ActionListener{
    
    
    Choice cEmpId;
    JTable table;
    JButton search,print,update,add,cancel;
    
    TeacherDetails(){
        
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
        JLabel heading = new JLabel("Search by Employee Id");
        heading.setBounds(20,20,180,40);
        heading.setFont(new Font("serif",Font.BOLD,14));
        add(heading);
        
        
        cEmpId = new Choice();
        cEmpId.setBounds(210,30,150,20);
        add(cEmpId);
        
        
        try{
            
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from teacher");
            while(rs.next())
            {
                cEmpId.add(rs.getString("empId"));
            }
        } 
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        
        
        table = new JTable();
        
        
        
        try{
            
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from teacher");
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
            String query = "select * from teacher where empId = '"+cEmpId.getSelectedItem()+"'";
            
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
            //new UpdateTeacher();
        }
        else if(ae.getSource() == add)
        {
            setVisible(false);
            new AddTeacher();
        }
        else
        {
             setVisible(false);
        }
        
    }
    
    
    public static void main(String[] args){
        new TeacherDetails();
    }
    
}