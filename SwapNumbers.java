package assignment1;

//Task 1 – Write a program to swap two number. For example a=10 and b=20 output should be a=20 and b=10

public class SwapNumbers {

	public static void main(String[] args) {
		
	int a = 10, b =20;
	System.out.println("Value of a = " + a);
	System.out.println("Value of b = " + b);
	
	int temp = a;
	a = b;
	b = temp;
	
	System.out.println("Value of a after swap = " + a);
	System.out.println("Value of b after swap = " + b);
	}

}
