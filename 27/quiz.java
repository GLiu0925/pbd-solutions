import java.util.Scanner;
public class quiz{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int correct = 0;
    
    System.out.print("Are you ready for a quizz? ");
    String yesOrNo = sc.next();
    System.out.println("Okay, here it comes!");
    
    System.out.println("Q1) WHat is the capital of Alaska?");
    System.out.println("         1) Melbourne");
    System.out.println("         2) Anchorage");
    System.out.println("         3) Juneau");
    System.out.println("");
    System.out.print(">");
    int q1 = sc.nextInt();
    if (q1 == 3){
        System.out.println("That's right!");
        correct ++;
    } else {
        System.out.println("Sorry, Juneau is the capital of Alaska.");
    }
    
    System.out.println("");
    System.out.println("Q2) Can you store the value \"cat\" in a variable of type int?");
    System.out.println("         1) yes");
    System.out.println("         2) no");
    System.out.println("");
    System.out.print(">");
    int q2 = sc.nextInt();
    if (q2 == 2){
        System.out.println("That's right!");
        correct ++;
    } else {
        System.out.println("Sorry, \"cat\" is a string. ints can only store numbers.");
    }
    
    System.out.println("");
    System.out.println("Q3) What is the result of 9+6/3?");
    System.out.println("         1) 5");
    System.out.println("         2) 11");
    System.out.println("         3) 15/3");
    System.out.println("");
    System.out.print(">");
    int q3 = sc.nextInt();
    if (q3 == 2){
        System.out.println("That's correct!");
        correct ++;
    } else {
        System.out.println("The correct answer is 11.");
    }
    
    System.out.println("");
    System.out.println("");
    
    System.out.println("Overall, you got " + correct + "out of 3 correct.");
    System.out.println("Thanks for playing!");
    }
    
}
