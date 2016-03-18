
import java.util.Arrays;


/*
 *Class for creating questions of different difficulties for the App
 */

/**
 *
 * @author magdy
 */
public class Question {
    public static String numb;
    public static String question;
    public int answer;
    
    public Question(){
       int level = (int)((Math.random()*5)+1); 
       int[] num = generateNumber();
       question = generateSign(num, level);
       numb = Arrays.toString(num);
       
}
    public Question(int lvl){
       int[] num = generateNumber();
       question = generateSign(num, lvl);
    }
    
    private static int[] generateNumber(){
        int n1 = (int)((Math.random()+1)*6)*5;
        int n2 = (int)((Math.random()+1)*6)*5;
        int n3 = (int)((Math.random()+1)*6)*5;
        
        int[] num ={n1, n2, n3};
        return num;
    }
    
    private String generateSign (int[] n, int lvl){
        int num1 = n[0];
        int num2 = n[1];
        int num3 = n[2];
        switch(lvl){
            case 1:
                question = num1 + "+" + num2;
                answer = num1 + num2;
            break;
            case 2:
                question = num1 + "-"+ num2;
                answer = num1 - num2;
            break;
            case 3:
                question = num1+ "*" + num2; 
                answer = num1*num2;
            case 4:
                question = num1+ "*" + num2 + "+" + num3;
                answer = num1*num2+num3;
            break;
            case 5:
                question = num1 + "*"+num2 + "*" + num3;
                answer = num1*num3*num2;
            break;         
        }
        return question;
                
    }
    
    public String getNumber(){
        return numb;
    }
    public String getQuestion(){
        return question;
    }
    public int getAnswer(){
        return answer;
    }
}
   