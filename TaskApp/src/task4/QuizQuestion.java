package task4;

public class QuizQuestion {
	private String que;
	private String[] options;
	private int correctAnsIndex;
	
	public QuizQuestion(String que, String[] options, int correctAnsIndex) {
		
		this.que = que;
		this.options = options;
		this.correctAnsIndex = correctAnsIndex;
	}
	
	public String getQue() {
		return que;
	}
	
	public String[] getOptions() {
		return options;
	}
	
	public int getCorrectAnsIndex() {
		return correctAnsIndex;
	}
	
}
