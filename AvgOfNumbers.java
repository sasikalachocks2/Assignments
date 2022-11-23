package assignment1;

//Task 3-  Write a program to print the average of below 5 numbers 10,90.78,111,8989,7876

public class AvgOfNumbers {

	public static void main(String[] args) {
		
		int a=10;
		double b=90.78;
		byte c=111;
		short d=8989;
		short e=7876;

		double sum=a+b+c+d+e;
		double avg=sum/5;
		System.out.println(avg);
	}

}
