package unit03;
/*
 
 * 
 * We write those codes in thread which are independent,and also which engage our CPU.
 * Multi-threading can be implemented using implement Runnable interface.
 * This method will consume less amount of memory because when we extends thread class we have to allocate memory for thread class and new class in
   which we are extending it will consume more memory that's why it is expensive also.
 * So that's why we use implement runnable interface method.
 * In thread we can define any new method but we can not use it with thread start function.
 * It allows to remove dependency on cpu blocking task.
 * It is mandatory to start the thread after making the thread.(imp)
 * we write code in run method because it is already defined in thread class.
 * We can define thread in such a way that we can directly override run method at the time of thread creation.
 * JVM do contact switching between threads not task.
 * OS do contact switching between process not tasks or threads.  
 
 * WAIT AND NOTIFY CONCEPT:-
   
   * 
   * Thread do intercommunication by using wait(),notify(),notify all().
   * It is done by using three method present in object class i.e wait(),notify(),notify all().
   * wait and notify method is written in try catch block because it is a sensitive code.
   *  
   * wait()
   	 *  
   	 *  It does not check any condition directly.
   	 *  It is a method of object class.
   	 *  It allows you to engage cpu unnecessarily. 
   	 *  It is done to wait program until a certain condition is fulfilled in program.
   	 *    
   * notify()
     *
     *  It is used to invoke wait method.
     *  It can only invoke one wait method at a time.
     *  
   * Notify all(): It is used to invoke all wait method present inside whole program. 
 
 */

public class P16_MultiThreading_In_Java {

	public static void main(String[] args) {
		
		// THIS WILL EXECUTE TASK SEQUENTIALY.
	//{	
	//	c1 obj=new c1();
	//	obj.show1();
	//	c2 obj2=new c2();
	//	obj2.show2();
	//}
		
		//THIS TASK WILL EXECUTE CONCURENTLY.
//		Thread T1=new Thread(new t1());
//		Thread T2=new Thread(new t2(),"T2");
//		T1.start();
//		T2.start();
		
		//This will execute task more efficiently.
		Thread T1=new Thread(new T3(),"T3");//String T3 is used to check in which place the code is break after completing the project.
											//It is optional to write these string. 
		Thread T2=new Thread(new T4(),"T4");
		T1.start();
		T2.start();
	}

}

class c1{
	void show1() {
		for(int i=0;i<10;i++)
		{
			System.out.println("C1 CLASS SHOW WITHOUT MULTI-THREADING");
		}
	}
}

class c2{
	void show2() {
		for(int i=0;i<10;i++)
		{
			System.out.println("C2 CLASS SHOW WITHOUT MULTI-THREADING");
		}
	}
}

class t1 extends Thread{
	public void run(){
		for(int i=0;i<10;i++)
		{
			System.out.println("T1 CLASS SHOW WITH MULTI-THREADING");
		}
	}
}

class t2 extends Thread{
	public void run() {
		for(int i=0;i<10;i++)
		{
			System.out.println("T2 CLASS SHOW WITH MULTI-THREADING");
		}
	}

}

class T3 extends Thread{
	public void run() {
		try {
			Thread.sleep(5000);
			System.out.println("THREAD TASK OF T3 IS DONE NOW !!!!");
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
}

class T4 extends Thread {
	public void run() {
		for(int i=0;i<10;i++)
		{
			System.out.println("T4 CLASS SHOW WITH MULTI-THREADING IN REAL IMPLIMENTATION");
		}

	}
}
class MultiThreadingClass{
	
	void threadconcept() {
		
	}
	
	void threadSynchronization() {
		
	}
	
	void interThreadCommunication() {
		
	}
	
	void ProducerConsumerProblems() {
		
	}
	
	void Wait_And_Notify() {
		
	}
}