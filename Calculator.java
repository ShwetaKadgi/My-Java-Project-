import java.util.Scanner;


public class Calculator {
	
	void Addition(int a, int b)
	{
		System.out.println("Addition is:"+(a+b));
	}

	void Subtraction(int a, int b)
	{
		System.out.println("Subtraction is:"+(a-b));
	}
	
	public static void main(String[] args)
	{
		Calculator c = new Calculator();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a = scan.nextInt();
		
		System.out.println("Enter the second number:");
		int b = scan.nextInt();
		
		c.Addition(a,b);
		c.Subtraction(a, b);
		c.Multiplication(a,b);
		c.Division(a,b);
		
	}
	
	void Multiplication(int a , int b)
	{
		System.out.println("Multiplication is :"+ (a*b));
		
		
	}
	
	void Division(int a, int b)
	{
		System.out.println("Division is :"+(a/b));
	}
}
