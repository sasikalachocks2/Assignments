package assignment1;

//Task 7- Write a program to print below pattern
//*
//* *
//* * *
//* * * *
//* * * * *
//* * * * * *

public class PatternPrint {

	public static void main(String[] args) {
		
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
		System.out.println();
		}
	}
}
