package task4;

public class Main {
	public static void main(String[] args) {
		Quiz q=new Quiz();
		
		String[] options1= {"Java","Python","C++","Ruby"};
		q.addQue(new QuizQuestion("Which programming language is known for its simplicity and readability?", options1, 1));
		
		String[] options2= {"Guido van Rossum","James Gosling","Dennis Ritchie","Bjarne Stroustrup"};
		q.addQue(new QuizQuestion("Who invented Java Programming?", options2, 1));
		
		String[] options3= {".js",".txt",".class",".java"};
		q.addQue(new QuizQuestion("What is the extension of java code files?", options3, 3));
		
		String[] options4= {"Polymorphism","Inheritance","Compilation","Encapsulation"};
		q.addQue(new QuizQuestion("Which of the following is not an OOPS concept in Java?",options4 ,2));
		
		String[] options5= {"JRE","JIT","JDK","JVM"};
		q.addQue(new QuizQuestion("Which component is used to compile,debug and execute the java programs?", options5, 2));
		
		q.start();
	}

}
