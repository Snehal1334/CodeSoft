package task4;

import java.util.*;

public class Quiz {
    ArrayList<QuizQuestion> questions =new ArrayList<QuizQuestion>();
	private int score=0;
    Scanner sc=new Scanner(System.in);
	
	public void addQue(QuizQuestion que) {
		questions.add(que);
	}
	
	public void start() {
		for (QuizQuestion que : questions) {
			presentQue(que);
		}
		displayResult();
	}

	private void presentQue(QuizQuestion que) {
		// TODO Auto-generated method stub
		System.out.println(que.getQue());
		String[] options=que.getOptions();
		for(int i=0;i<options.length;i++)
		{
			System.out.println((i+1)+" : "+options[i]);
		}
		
		long startTime=System.currentTimeMillis();
		int userAns=-1;
		
		while((System.currentTimeMillis() - startTime) < 10000) //10 seconds
		{
			if(sc.hasNextInt()) {
				userAns=sc.nextInt();
				break;
			}
			
		}
		if(userAns == que.getCorrectAnsIndex()+1)
		{
			System.out.println("Correct!");
			score++;
		}
		else {
			System.out.println("Incorrect! The correct answer is: "+options[que.getCorrectAnsIndex()]);
		}
	}
	
	private void displayResult()
	{
		System.out.println("Quize is Over!");
		System.out.println("Your final score is: "+score+ "/" +questions.size());
		System.out.println("Thank you for playing...");
	}

}
