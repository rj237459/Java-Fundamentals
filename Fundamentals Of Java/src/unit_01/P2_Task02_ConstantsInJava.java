package unit_01;
/*
 *  Constants 
 *  	Piece of code/data that does not change its value
 *  	they never change the value once assigned
 *  private: INSIDE CLASS ONLY
 *  protected:CLASS + WITHIN THE PACKAGE
 *  public:CLASS + WITHIN THE PACKAGE +OUTSIDE THE PACKAGE
 *  Default:No Keyword ,Package private{ Not Outside the package }
 */
public class P2_Task02_ConstantsInJava {
	    private static final double pi = 3.14; /*private:- access specifier,static is used so that we can 
	    access pi in main function as main can only access static member. final is to make it constant 
	    */
	    
	    public static void main(String[] args) {
	    final int a=10;
	    //a=11;
	    //we can't change a constant(final) variable 
	    //static function can't access non-static members
	    System.out.println(pi);// use sysout + ctrl +space  shortcut for System.out.println()
	    //add(10,20); main can only access static functon so we have to use class object
	        calculator obj = new calculator();
	        System.out.println(obj.add(10,20));
	        System.out.println(obj.multi(10,20));
	  }
	    int add(int a, int b)
	    {
	      System.out.println(a);
	      System.out.println(pi);
	      return(a+b);
	    }
	    int multi(int a,int b)
	    {
	      return(a*b);
	    }

	}
	class calculator
	{
	  int a,b ;
	  int add(int a,int b)
	  {
	    System.out.println(pi);
	    return (a+b);
	  }
	    int multi(int a,int b)
	    {
	      return(a*b);
	    }

		
	}


