package unit_01_part2;

import java.util.Scanner;

/*When user takes input from the console!
 * 
 * nextLine()     Read user input [to read Strings]
 * next()         Read next token from the input entered by the user until a space is encountered.(used to read string.) 
 * 
 * nextBoolean()  Reads a boolean value from the user
 * nextByte()     Reads a byte value from the user
 * nextDouble()  Reads a double value from the user
 * nextFloat()  Reads a float value from the user
 * nextInt()  Reads a int value from the user
 * nextLine()  Reads a string value from the user
 * nextLong()  Reads a long value from the user[used for integers only]
 * nextShort()  Reads a short value from the user[used for integers only]
 * 
 */

public class P4_Task03_ScannerClassInJava {

	public static void main(String[] args) {
		Scanner myObj1 = new Scanner(System.in); //Create a Scanner object
		Scanner myObj2 = new Scanner(System.in);
		
		
		// Read the First-Token:(_ space bar)
		String firstName = myObj1.next();
		System.out.println("Name is : " + firstName +"\n");
		
		
		String name = myObj2.nextLine();//(\n)
		String name2 = myObj2.nextLine();//(\n)
		
		System.out.println("Name is: " + name + "\n");
		System.out.println("Name is: " + name2 + "\n");
		
		boolean b = myObj2.nextBoolean();
		System.out.println(b + "\n");
		
		long name3= myObj1.nextLong();
		System.out.println(name3);
		
		short name4=myObj1.nextShort();
		System.out.println(name4);
		
		myObj1.close();
		myObj2.close();
		
		// It is necessary to close the scanner class object in java because it will create a memory leakage in program.
		// As Java garbage collector does not scan for unused variable in the program.


	}

}
