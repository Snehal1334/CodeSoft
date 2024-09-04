package task2;

import java.util.Scanner;

public class StudentGradeCalculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of subjects: ");
		int num=sc.nextInt();
		int[] marks=new int[num];
		int totalMarks=0;
		
		for(int i=0;i<num; i++)
		{
			System.out.println("Enter the marks obtained in subject "+(i+1)+ " :");
			marks[i]=sc.nextInt();
			totalMarks =totalMarks +marks[i];
		}
		
		double avgPercentage =totalMarks / num;
		char grade;
		if(avgPercentage >=90)
		{
			grade='A';	
		}
		else if(avgPercentage >=80)
		{
			grade='B';
		}
		else if(avgPercentage >=70)
		{
			grade='C';
		}
		else if(avgPercentage >=60)
		{
			grade='D';
		}
		else {
			grade='F';
		}
		
		System.out.println("Total Marks: "+totalMarks);
		System.out.println("Average Percentage: "+avgPercentage);
		System.out.println("Grade: "+grade);
	}

}
