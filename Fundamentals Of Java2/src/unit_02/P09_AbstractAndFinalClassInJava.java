package unit_02;

/*
Abstract Class:
-> An Abstract class must be declared with an abstract keyword.
-> Abstraction is a process of hiding the implementation details.
   And showing only Functionality(function declarations) to the user.
->can't make object of abstract class directly, but through derived class
->Example of abstract method?
->Abstract class may contains abstract and non-abstract methods
->(0-100%) abstract method can be there:
->In case of Interface: 100% abstract methods should be there.

Final class:
->The main purpose of using this class is to prevent the class from being inherited.\
->If a class is marked as final class then no class can inherit any feature from the final class.
->You can't extend a final class. If you try "it gives you compile time error". 


 */

abstract class Bike{
	int a;
	
	Bike(){
		System.out.println("Inside bike Constructor : " + a + "\n");
	}
	
	abstract void run(); //abstract method! (0-100%)

	void display() {
		System.out.println("This is display method!");
	}
}

class Honda4 extends Bike{

	@Override
	void run() {
		// TODO Auto-generated method stub
		
	}
	
}
public class P09_AbstractAndFinalClassInJava {

	public static void main(String[] args) {
		Bike obj = new Honda4();
		// obj.run();
		obj.display();
		//can not be instantiated
        //Bike obj2 = new Bike();

	}

}

// Final class
final class Super{
	public int data = 30;
	void display()
	{
		System.out.println(data);
	}
}
//Final class is tried to inherit and it will raise error

/*
public class Sub extends Super{
	
	void display2() {
		display();
	}
} 
*/