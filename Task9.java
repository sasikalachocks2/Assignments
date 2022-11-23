package assignment1;

//Task 9- Write a program which will break the current execution if it find number 85 
//Input – [12,34,66,85,900]


public class Task9 {

	public static void main(String[] args) {
		
		int[]number= {12,34,66,85,900};
		
		for(int i=0;i<5;i++)
		{
			System.out.println(number[i]);
			
			if(number[i]==85)
				break;
		}
	}
}


