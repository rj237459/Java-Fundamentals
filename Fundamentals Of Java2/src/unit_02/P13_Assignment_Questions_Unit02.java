package unit_02;

public class P13_Assignment_Questions_Unit02 {

	public static void main(String[] args) {
		Assignment_Questions_Unit_02 obj = new Assignment_Questions_Unit_02();
		obj.abstractclasscall();
		obj.overloadindAndOverriding();
		obj.accesprotectionInJava();
		obj.interfaceimplementation();

	}

}

class Assignment_Questions_Unit_02{
	void abstractclasscall() {
		Sample3 obj =new Sample3();
		obj.run();
	}
	void overloadindAndOverriding() {
		Sample3 obj =new Sample3();
		obj.run();
		obj.run(1);
		obj.run(1,2);
		
		obj.display();
	}
	void accesprotectionInJava() {
		Sample3 obj =new Sample3();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		
		obj.showData();
		obj.display();
	}
	void interfaceimplementation() {
		Sample3 obj =new Sample3();
		obj.display1();
		obj.display2();
	}
}

abstract class Sample2{
	int a = 10; // Default protection.
	public int b = 20;// can be accessed outside Unit 02 package but within the same project.
	protected int c = 30;// can only be accessed within Unit 02 package.
	private int d = 40; // within parent class only, not even in its sub-class.
	
	void showData() {
		System.out.println("Inside Sample2 Parent Class");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
	}
	
	public void display() {
		System.out.println("This is display method in abstract class sample 2 !");
	}
	
	abstract void run();//Unimplemented Method.
}

class Sample3 extends Sample2 implements A3, B3 {
	public void display() {
		System.out.println("Inside Child Class");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		//System.out.println("d = " + d); //Private members can't be accessed. 
	}
	
	public void display1() {
		System.out.println("This Is A Display1 Method In Child Class Sample 3 From Interface A3 ");
	}
	
	public void display2() {
		System.out.println("This Is A Display2 Method In Child Class Sample 3 From Interface B3 ");
	}
	
	public void run() {
		System.out.println("This Is A Run Method From Abstract Class Sample2! ");
	}
	
	public void run(int x) {
		System.out.println("This Is A Run Overloaded Method In Sample3! ");
	}
	
	public void run(int x,int y) {
		System.out.println("This Is A Run Overloaded Method In Sample3! ");
	}
}

interface A3{
	public void display1();
}

interface B3{
	public void display1();
}
