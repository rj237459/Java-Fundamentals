package Assignment_01;
import java.util.Scanner;
class Da
{
	int sum(int a,int b)
	{
		return a+b;
	}
	int sub(int a,int b)
	{
		if(a<b) return 0;
		return a-b;
	}
}
public class Q006 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		Da d=new Da();
		int a,b;
		System.out.println("Enter The Value Of A : ");
		a=obj.nextInt();
		System.out.println("Enter The Value Of B : ");
		b=obj.nextInt();
		int result=(a>b)? d.sum(a, b):d.sub(a, b);
		System.out.println(result);

	}

}
