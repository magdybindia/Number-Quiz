
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author magdy
 */
public class NumberQuiz {
    /**
     * @param args the command line arguments
     */
    public static final int NUMBER_OF_QUESTIONS = 3;
    
    public static void main(String[] args) {
    String opener = "What is ";
    Question q1 = new Question();
    System.out.println(opener+q1.getQuestion()+"?");
    int[] answers = new int[NUMBER_OF_QUESTIONS];
    Scanner scan = new Scanner(System.in);
    answers[0] = scan.nextInt();
    Question q2 = new Question(1);
    System.out.println(opener+q2.getQuestion()+"?");
    answers[1] = scan.nextInt();
    Question q3 = new Question(4);
    System.out.println(opener+q3.getQuestion()+"?");
    answers[2] = scan.nextInt();
    
    int[] cAnswers = {q1.getAnswer(), q2.getAnswer(), q3.getAnswer()};
    Performance myans = new Performance(answers, cAnswers);
    System.out.println("Your performance is: "+myans.getPercent());
    System.out.println("The answers are" + Arrays.toString(cAnswers));
    }
    
}a
