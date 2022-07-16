package unit03;
import java.util.*;

public class ExceptionalHandlingInJava {

	public static void main(String[] args) {
		//If exception occurs and we do not handle it then it will close the application and rest of the code will not execute.
		// only write specific exception first then after write general exception.
		// otherwise it will raise a compile time error.
		// error can't be handle because it can't be catched at that time.
		// throw
		// 	->"throw" key word is use to create manual exception.
		// 	-> after throw we need to create a catch block for that manual exception.
		// 	-> otherwise it will become a unhandled exception.
		//  -> it must be written in function.
		try {
			//sensitive code
			int b=0;
			int a=100/b;
			System.out.println(a);
		}catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		// It is a normal code that will execute definately even if we catch an exception or not this will execute.
		// Even if we do not write any code to handel that exception finally code will execute.
		
		finally {
			System.out.println("DONE !");
		}
		
/*
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
		// we can't write child class after master class.
*/
		//rest of the code will execute if exception is handled. 
		System.out.println("Done");
		
		
		ExceptionClass obj=new ExceptionClass();
		obj.BasicException(0,20);
		obj.HandelException(0,100);
		obj.IndexOutofBoundException();
		obj.MultipleCatchBlock(0, 20);
		obj.nullPointerException();
		obj.StackOverFlowError(20);
		//obj.UseOfThrow(14);
		obj.UseOfThrowAndFinal();
		obj.CheckedAndUncheckedException();
		
		
		
	}

}
class ExceptionClass{
	int a;
	int b;
	void BasicException(int a,int b){
		b= b/a;
		System.out.println(b);
	}
	
	void HandelException(int a,int b) {
		try {
			b= b/a;
			System.out.println(b);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("Done");
		}
		
	}
	void MultipleCatchBlock(int a,int b) {
		try {
			b=b/a;
			System.out.println(b);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("Enter value of B other than 0 (Arithmetic Exception).");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Enter value of B other than 0 (Exception e catch block).");
		}
		
	}
	
	void InputMismatch() {
		Scanner obj=new Scanner(System.in);
		try {
			int a;
			System.out.println("Enter Value : ");
			a=obj.nextInt();
			System.out.println("value in a : " + a);
			obj.close();
		}catch(InputMismatchException e) {
			System.out.println(e.getMessage()+"Enter integer value.");
		}
	}
	
	void StackOverFlowError(int a) {
		while(a>0) {
			a++;
			StackOverFlowError(a);
		}
	//This Is A Error it is not recoverable so it can't be resolved.
		
	}
	void IndexOutofBoundException() {
		try {
			Scanner obj1= new Scanner(System.in);
			int arr[];
			arr=new int[6];
			System.out.println("Enter value in array : ");
			for(int i=0;i<6;i++)
			{
				arr[i]=obj1.nextInt();
			}
			obj1.close();
			System.out.println(arr[10]);
		}catch(IndexOutOfBoundsException e) {
			System.out.println(e.getMessage()+"You are printing value which does not exist in array.");
		}
	}
	
	void nullPointerException() {
		try {
			String s=null;
			System.out.println(s.length());
		}catch(NullPointerException e) {
			System.out.println(e.getMessage()+"You haven't Enter any string in it .");
		}
	}
	
	/*
	 * This method is called lazy binding.
	 * In this method we identify the exception but function don't want to handel it.
	 * In this case if exception occurs then it is thrown to another function for handling and 
	   if that function also not handel it then that function also send it to another function.
     * But one of the function has to handel it.
     */
	void UseOfThrow(int a) throws Exception{
			if(a<18) {
				throw new Exception();
			}else {
				System.out.println("You Are Verified for the task.");
			}
		
	}
	
	void UseOfThrowAndFinal() {
		try {
			UseOfThrow(17);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("The Try Block Is Finished.");
		}
	}
	
	void CheckedAndUncheckedException() {
		/*
		 * Unchecked Exception: It is a runtime exception .
		 * In this case we are dividing y by 0 which will not be caught by compiler.
		 * It will be caught at run time because it is mathematically wrong.
		 */
		
		int x=0;
		int y=20;
		int z=y/x;
		System.out.println(z);
		
		/*
		 *  Checked Exception:-
		 * This will be caught at compile time.
		 */
		try {
			UseOfThrow(19);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}