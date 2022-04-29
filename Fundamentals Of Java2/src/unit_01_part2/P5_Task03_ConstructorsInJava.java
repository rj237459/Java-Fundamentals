package unit_01_part2;

/*
CONSTRUCTOR:-
- Special method that are used to initialize objects.
- It is called when an instance of the class is created
- At the time of calling the constructor, memory for the object is allocated in the memory
- It is a special type of method which is used to initialize the object
- Every time an object is created using the new() keyword, at least one constructor is called
- Two types of Constructors in Java
	- Parameterized Constructor
	   -> constructor having specific number of arguments to be passed.
	   -> to assign users wanted specific value to instance variable of objects.
	- Default Constructor
	   -> they are the constructor that are created by compiler when constructor is not created by the programmer.
	   -> used to initialize default values to the instance variable of the class. 
 * */


public class P5_Task03_ConstructorsInJava {

	public static void main(String[] args) {

		ABC4 obj = new ABC4();
		System.out.println(obj.a);

	}

}

class ABC4 {

	int a;
	
	
	/*
	 ClassName(Constructor Parameters){
	 	All the class and Instance variables can be initialized here!
	 }
	 */
	
	ABC4(){
		a = 10;
	}
	
	
	ABC4(int a ){
		this.a = a;
	}
	
	
	void display() {
		
		int b = 10;

		System.out.println(a);
		System.out.println(b);

	}
	
	int display2() {
		
		System.out.println(a);
		//As a was a local variable so we can not access it outside the method
		//System.out.println(b);
		
		return a;

	}
}