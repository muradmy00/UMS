
package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project extends JFrame implements ActionListener{
    
    Project()
    {
        
        getContentPane().setBackground(Color.WHITE);
         setSize(1920,1080);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 =i1.getImage().getScaledInstance(1920, 940,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        
        
        JMenuBar mb = new JMenuBar();
        
        JMenu newInformation = new JMenu("New Information");
        newInformation.setFont(new Font("serif",Font.BOLD,15));
        newInformation.setForeground(Color.BLUE);
        mb.add(newInformation);
        
        JMenuItem facultyInfo = new JMenuItem("New Faculty Information");
        facultyInfo.setFont(new Font("serif",Font.BOLD,15));
        facultyInfo.setBackground(Color.WHITE);
        facultyInfo.setForeground(Color.RED);
        facultyInfo.addActionListener(this);
        newInformation.add(facultyInfo);
        
        JMenuItem studentInfo = new JMenuItem("New Student Information");
        studentInfo.setFont(new Font("serif",Font.BOLD,15));
        studentInfo.setBackground(Color.WHITE);
        studentInfo.setForeground(Color.RED);
        studentInfo.addActionListener(this);
        newInformation.add(studentInfo);
        
        
        
        
        JMenu details = new JMenu("View Details");
        details.setFont(new Font("serif",Font.BOLD,15));
        details.setForeground(Color.BLUE);
        mb.add(details);
        
        JMenuItem facultydetails = new JMenuItem("View Faculty Details");
        facultydetails.setFont(new Font("serif",Font.BOLD,15));
        facultydetails.setBackground(Color.WHITE);
        facultydetails.setForeground(Color.RED);
        facultydetails.addActionListener(this);
        details.add(facultydetails);
        
        JMenuItem studentdetails = new JMenuItem("View Student Details");
        studentdetails.setFont(new Font("serif",Font.BOLD,15));
        studentdetails.setBackground(Color.WHITE);
        studentdetails.setForeground(Color.RED);
        studentdetails.addActionListener(this);
        details.add(studentdetails);
        
        
        
        
        
        JMenu leave = new JMenu("Apply Leave");
        leave.setFont(new Font("serif",Font.BOLD,15));
        leave.setForeground(Color.BLUE);
        mb.add(leave);
        
        JMenuItem facultyleave = new JMenuItem("Faculty Leave");
        facultyleave.setFont(new Font("serif",Font.BOLD,15));
        facultyleave.setBackground(Color.WHITE);
        facultyleave.setForeground(Color.RED);
        facultyleave.addActionListener(this);
        leave.add(facultyleave);
        
        JMenuItem studentleave = new JMenuItem("Student Leave");
        studentleave.setFont(new Font("serif",Font.BOLD,15));
        studentleave.setBackground(Color.WHITE);
        studentleave.setForeground(Color.RED);
        studentleave.addActionListener(this);
        leave.add(studentleave);
        
        
        
        
        
        
        JMenu leaveDetails = new JMenu("Leave Details");
        leaveDetails.setFont(new Font("serif",Font.BOLD,15));
        leaveDetails.setForeground(Color.BLUE);
        mb.add(leaveDetails);
        
        JMenuItem facultyleavedetails = new JMenuItem("Faculty Leave Details");
        facultyleavedetails.setFont(new Font("serif",Font.BOLD,15));
        facultyleavedetails.setBackground(Color.WHITE);
        facultyleavedetails.setForeground(Color.RED);
         facultyleavedetails.addActionListener(this);
        leaveDetails.add(facultyleavedetails);
        
        JMenuItem studentleavedetails = new JMenuItem("Student Leave Details");
        studentleavedetails.setFont(new Font("serif",Font.BOLD,15));
        studentleavedetails.setBackground(Color.WHITE);
        studentleavedetails.setForeground(Color.RED);
         studentleavedetails.addActionListener(this);
        leaveDetails.add(studentleavedetails);
        
        
        
        
        
        
        JMenu exam = new JMenu("Examination");
        exam.setFont(new Font("serif",Font.BOLD,15));
        exam.setForeground(Color.BLUE);
        mb.add(exam);
        
        JMenuItem examinationdetails = new JMenuItem("Examination Results");
        examinationdetails.setFont(new Font("serif",Font.BOLD,15));
        examinationdetails.setBackground(Color.WHITE);
        examinationdetails.setForeground(Color.RED);
         examinationdetails.addActionListener(this);
        exam.add(examinationdetails);
        
        JMenuItem entermarks = new JMenuItem("Enter Marks");
        entermarks.setFont(new Font("serif",Font.BOLD,15));
        entermarks.setBackground(Color.WHITE);
        entermarks.setForeground(Color.RED);
         entermarks.addActionListener(this);
        exam.add(entermarks);
        
        
        
        
        
        JMenu updateInfo = new JMenu("Update Details");
        updateInfo.setFont(new Font("serif",Font.BOLD,15));
        updateInfo.setForeground(Color.BLUE);
        mb.add(updateInfo);
        
        JMenuItem updatefacultyinfo = new JMenuItem("Update Faculty Details");
        updatefacultyinfo.setFont(new Font("serif",Font.BOLD,15));
        updatefacultyinfo.setBackground(Color.WHITE);
        updatefacultyinfo.setForeground(Color.RED);
         updatefacultyinfo.addActionListener(this);
        updateInfo.add(updatefacultyinfo);
        
        JMenuItem updatestudentinfo = new JMenuItem("Update Student Details");
        updatestudentinfo.setFont(new Font("serif",Font.BOLD,15));
        updatestudentinfo.setBackground(Color.WHITE);
        updatestudentinfo.setForeground(Color.RED);
        updatestudentinfo.addActionListener(this);
        updateInfo.add(updatestudentinfo);
        
        
        
        
        
        
        JMenu fee = new JMenu("Fee Details");
        fee.setFont(new Font("serif",Font.BOLD,15));
        fee.setForeground(Color.BLUE);
        mb.add(fee);
        
        JMenuItem feestructure = new JMenuItem("Fee Structure");
        feestructure.setFont(new Font("serif",Font.BOLD,15));
        feestructure.setBackground(Color.WHITE);
        feestructure.setForeground(Color.RED);
        feestructure.addActionListener(this);
        fee.add(feestructure);
        
        JMenuItem feeform = new JMenuItem("Student Fee Form");
        feeform.setFont(new Font("serif",Font.BOLD,15));
        feeform.setBackground(Color.WHITE);
        feeform.setForeground(Color.RED);
        feeform.addActionListener(this);
        fee.add(feeform);
           
        JMenu about = new JMenu("About");
        about.setFont(new Font("serif",Font.BOLD,15));
        about.setForeground(Color.BLUE);
        mb.add(about);
        
        JMenuItem ab = new JMenuItem("About");
        ab.setFont(new Font("serif",Font.BOLD,15));
        ab.setBackground(Color.WHITE);
        ab.setForeground(Color.RED);
        ab.addActionListener(this);
        about.add(ab);
        
        
        JMenu exit = new JMenu("Exit");
        exit.setFont(new Font("serif",Font.BOLD,15));
        exit.setForeground(Color.BLUE);
        mb.add(exit);
        
        JMenuItem ex = new JMenuItem("Exit");
        ex.setFont(new Font("serif",Font.BOLD,15));
        ex.setBackground(Color.WHITE);
        ex.setForeground(Color.RED);
        ex.addActionListener(this);
        exit.add(ex);
        
        
        
        
       
        
        
        setJMenuBar(mb);
   
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        
        String msg = ae.getActionCommand();
        
        if(msg.equals("Exit"))
        {
            setVisible(false);
        }
        else if(msg.equals("New Faculty Information"))
        {
            new AddTeacher();
        }
        
        else if(msg.equals("New Student Information"))
        {
            new AddStudent();
        }
        else if(msg.equals("View Faculty Details"))
        {
            new TeacherDetails();
        }
        else if(msg.equals("View Student Details"))
        {
            new StudentDetails();
        }
        else if(msg.equals("Student Leave"))
        {
            new StudentLeave();
        }
        else if(msg.equals("Faculty Leave"))
        {
            new TeacherLeave();
        }
         else if(msg.equals("Faculty Leave Details"))
        {
            new TeacherLeaveDetails();
        }
         else if(msg.equals("Student Leave Details"))
        {
            new StudentLeaveDetails();
        }
         
        else if(msg.equals("Update Faculty Details"))
        {
            new UpdateTeacher();
        }
         else if(msg.equals("Update Student Details"))
        {
            new UpdateStudent();
        }
        else if(msg.equals("Enter Marks"))
        {
            new EnterMarks();
        }
        else if(msg.equals("Examination Results"))
        {
            new ExaminationDetails();
        }
        else if(msg.equals("Fee Structure"))
        {
            new FeeStructure();
        }
        else if(msg.equals("About"))
        {
            new About();
        }
        else if(msg.equals("Student Fee Form"))
        {
            new StudentFeeForm();
        }
        

    }
    
    
    
    public static void main(String[] args)
    {
     new Project();   
    }
}
