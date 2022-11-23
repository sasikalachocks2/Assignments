package assignment1;

public class ScoreRange {

	public static void main(String[] args) {
		
		int[]studentMarks=new int[5];
		
		studentMarks[0]=78;
		studentMarks[1]=12;
		studentMarks[2]=89;
		studentMarks[3]=55;
		studentMarks[4]=35;
		
		for(int i=0;i<5;i++)
		{
			if(studentMarks[i]>75)
			{
				System.out.println(studentMarks[i]);
			}
			else
			{
				System.out.println("Student Marks is less than 75");
			}
		}
	}
}
