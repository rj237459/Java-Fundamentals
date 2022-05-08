package Assignment_01;

/*Q1- WAP which would contain 6 objects, of a class Student. Student [Name, Age, section, percentage]. They all belong to Section-A. 
Your program would be able to find the average percentage of students in this section. Use constructors to create these 6 objects and 
input from Scanner class.*/
import java.util.Scanner;
class student {
	String name="";
	int age;
	String section;
	float percentage;
	Scanner obj= new Scanner(System.in);
	student(int age ,String section, float percentage)
	{
		System.out.println("Enter the name: ");
		name=obj.nextLine();
		this.age=age;
		System.out.println("Enter The Section: ");
		section=obj.nextLine();
		this.percentage=percentage;
	
	}
	student()
	{
		name="XYZ";
		age=0;
		section="A";
		percentage=10;
		System.out.println("Not enterded value.");
	}
}

class input{
	int age;
	
	float percentage;
	float a ;
	
	Scanner obj= new Scanner(System.in);
	public float inputstudent() {

		
		System.out.println("Enter The Age Of Student :");
		age=obj.nextInt();
		
		System.out.println("Enter The Percentage of Student : ");
		percentage=obj.nextFloat();
		
		student obj1=new student(age,"A",percentage);
		a=obj1.percentage;
		return a;
	}
	
}


public class Q001 {

	public static void main(String[] args) {
		float p1;
		float average=0;
		input val=new input();
		for(int i=0;i<6;i++)
		{
			p1=val.inputstudent();
			average=average+p1;
			System.out.println(" ");
		}
		average=average/6; 
		System.out.println("Percentage of Section A is:"+average);
	}

}


