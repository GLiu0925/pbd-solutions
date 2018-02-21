import java.util.Scanner;

public class ForgetfulMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Give me a word!");
        String word = input.next();
        
        System.out.print("Give me a second word!");
        String secondWord = input.next();
        
        System.out.print("Great, now your favorite number?");
        int number = input.nextInt();
        
        System.out.print("And your second favorite number?");
        int secondNumber = input.nextInt();
        
        System.out.println("Whew! Wasn't that fun?");
    }
}
