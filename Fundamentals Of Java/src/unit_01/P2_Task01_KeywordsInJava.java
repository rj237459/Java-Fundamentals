package unit_01;
/*
 * 50 Such Keywords:- They are Reserved Words And Meaning are defined by the compiler
 * Divided in two grps 48 ( Commonly used in java ) + 2(for future use in java )
 * 2( Future use ) : [goto*, const*]
 * in 1.2v: assert**
 * in 1.4v : strictfp***
 * in 5.0v : enum****
 
 * Keywords can not be used as an identifiers in Java, 
 * Keywords can not be used as an object in Java,
 * Keywords can not be used as an variable name in Java,
 * Keywords can not be used as an function in Java,
 * Keywords can not be used as an class etc.
 
 
 * */

public class P2_Task01_KeywordsInJava {

	public static void main(String[] args) {
		//Keywords can not be used as an variable name or identifiers in Java
		float int=1.5;
		//Syntax error on token "int", invalid VariableDeclaratorId
		
		//Keywords can not be used as an object in Java
		sampleclass int = new sampleclass();
		//sampleclass cannot be resolved to a variable
		

	}
class sampleclass{
	
	//Keywords can not be used as an function in Java
	void int() {
		System.out.println("Keywors in java example.");
	}
	//Syntax error on token "int", Identifier expected
	
};

//Keywords can not be used as an class
class double{
    
}
