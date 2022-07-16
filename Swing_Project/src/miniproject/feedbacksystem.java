package miniproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class myframe extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,msg;
	JTextField t1,t2;
	JTextArea ta1;
	JCheckBox terms;
	JButton submit;
	JComboBox day,month,year;
	
	
	public myframe(){
		setTitle("FEEDBACK SYSTEM");
		setSize(700,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(null);
		
		l1=new JLabel("NAME : ");
		l1.setBounds(20, 50, 100, 20);
		c.add(l1);
		
		t1=new JTextField();
		t1.setBounds(130,50,100,20);
		c.add(t1);
		
		l2=new JLabel("EMAIL : ");
		l2.setBounds(20, 100, 100, 20);
		c.add(l2);
		
		t2=new JTextField();
		t2.setBounds(130,100,100,20);
		c.add(t2);
		
		l3=new JLabel("DATE : ");
		l3.setBounds(20, 150, 100, 20);
		c.add(l3);
		
		String days[]= {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
		String Months[]= {"JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"};
		String Year[]={"2022","2023","2024","2025"};
		day=new JComboBox(days);
		month=new JComboBox(Months);
		year=new JComboBox(Year);
		
		day.setBounds(130, 150, 50, 20);
		month.setBounds(190,150,50,20);
		year.setBounds(250,150,60,20);
		
		c.add(day);
		c.add(month);
		c.add(year);
		
		l4=new JLabel("WRITE COMMENT IN THE GIVEN BOX: ");
		l4.setBounds(20,200,500,20);
		c.add(l4);
		
		ta1=new JTextArea();
		ta1.setBounds(20,250,650,150);
		c.add(ta1);
		
		
		submit=new JButton("SUBMIT");
		submit.setBounds(300,410,100,20);
		c.add(submit);
		submit.addActionListener(this);
		
		l5=new JLabel();
		l5.setBounds(20,420,500,20);
		c.add(l5);
		
		c.setBackground(Color.ORANGE);

		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
	
		l5.setText(" THANKYOU FOR YOUR VALUABLE REVIEW. ");
		String s1=t1.getText();
		String s2=t2.getText();
		String s3=ta1.getText();
		String s4=(String) day.getSelectedItem()+"/"+(String) month.getSelectedItem()+"/"+(String) year.getSelectedItem();
		FileWriter myobj=null;
		try {
		 myobj=new FileWriter("C:\\Users\\HP\\eclipse-workspace\\Swing_Project\\src\\miniproject\\MINIPROJECT.txt",true);
		} catch (Exception e1) {
		
			e1.printStackTrace();
		}
		
		BufferedWriter f_writer = new BufferedWriter(myobj);
		try {
			f_writer.write("\n");
			f_writer.write("NAME : "+s1);
			f_writer.write("\n");
			f_writer.write("DATE : "+s4);
			f_writer.write("\n");
			f_writer.write("EMAIL : "+s2);
			f_writer.write("\n");
			f_writer.write("REVIEW OF THE USER : ");
			f_writer.write("\n");
			f_writer.write(s3);
			f_writer.write("\n");
			
		} catch (IOException e2) {
			
			e2.printStackTrace();
		}
		
		try {
			f_writer.close();
		} catch (IOException e3) {
			e3.printStackTrace();
		}
		dispose();
	}
}


public class feedbacksystem {

	public static void main(String[] args) {
		
        myframe frame=new myframe(); 
		
	}

}
