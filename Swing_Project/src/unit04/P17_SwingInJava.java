package unit04;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class P17_SwingInJava {

	public static void main(String[] args) {
		
		SwingInJava obj = new SwingInJava();
		

	}

}

class SwingInJava extends JFrame{
	
	JTable jt1;   //It is used create table in the frame.
	
	JList list;   // It is used to add list in the frame.
	JComboBox jb1;   // It is used to add scroll box for the list.
	
	JTextArea ta1;    //It is used to add text area in the frame. It can be used to take input from user in the frame and mainly used to take paragraph as input.
	JTextField t1;
	JTextField t2;
	
	JButton b1,b2,b3,b4;
	
	JLabel l1;
	SwingInJava(){
		
		ta1= new JTextArea(10,30); // used to take paragraph input from the user in the frame.
		t1= new JTextField(20);
		t2= new JTextField(20); //Used to specify the size of input taken from the user. It is used for only small data input
		b1= new JButton("Sum"); //used to create button in frame.
		b2= new JButton("Sub");
		b3= new JButton("mul");
		b4= new JButton("div");
		
		l1= new JLabel(); // It is  used to display result in java.
		add(ta1);
		add(t1);  //Used to add fields and button in frame to show it in frame.
		add(t2);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		
		ActionListener al=new ActionListener() {        // This method is used for creating methods for our frame which we are creating.

			@Override
			public void actionPerformed(ActionEvent e) {     // In this we write the method logic for frame.
				String data[][]= {{ " 101 "," RAHUL "," 50000 " }, { " 102 "," ROHAN "," 50000 " },{ " 103 "," RAMESH "," 50000 " }};
				String column[]= {" ID ", " NAME ", " SALARY "};
				
				jt1 =new JTable(data,column); // we used this to create table in the frame.
				
				String Week[]= {" SUNDAY "," MONDAY "," TUESDAY "," WEDNESDAY "," THRUSDAY "," FRIDAY "," SATURDAY "};
				String s1= t1.getText(); // it is used get input enter in field.
				String s2= t2.getText();
				
				int a1 = Integer.parseInt(s1); // It is used to convert the input taken as string into text.
				int a2 = Integer.parseInt(s2);
				
				
				
				
			}
			
		};
		setLayout(new FlowLayout());
		setVisible(true);  //It is used to make our frame visible
		setSize(400,400);   //Used To define frame size.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // It is used to close the application so that on closing the frame the code also stop.
	}
	
}