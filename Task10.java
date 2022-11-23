package assignment1;

//ask 10- Write a program which will break the current execution if it find “Selenium”
//Input – [“Java”,”JavaScript”,”Selenium”,”Python”,”Mukesh”]


public class Task10 {

	public static void main(String[] args) {
		
		String[]str={"Java","JavaScript","Selenium","Python","Mukesh"};
		
		for (int i=0;i<5;i++)
		{
			System.out.println(str[i]);
			
			if(str[i]=="Selenium")
				break;
		}
	}
		
}

