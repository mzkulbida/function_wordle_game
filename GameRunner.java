
/**
 * Implementation for the game itself
 *
 * @author mzkulbida
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class GameRunner
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Function[] terms = {new P(3,2), new C(12)};
        GuessFunction g = new GuessFunction(terms);
        String function = g.toString();
        boolean guessed = false;
        int numTries = 1;
        
        System.out.println("Welcome to [name in progress]! The objective is to guess the mystery function in as few tries as possible. Before each attempt, you will be prompted to ask for the function's value at your input of choice. All functions are the sum of exponential, polynomial, and constant functions. Here's an example guess: 1*7^x+2*x^2+3");
        while(!guessed){
            System.out.println("Type in a natural number");
            int input = in.nextInt();
            System.out.println("f(" + input + ")=" + g.of(input));
            System.out.println("Type in your guess:");
            String guess = in.next();
            if(guess.equals(function)){
                guessed = true;
                System.out.println("Congrats on guessing the mystery function! It took " + numTries + " attempts.");
                break;
            }
            if(guess.equalsIgnoreCase("quit"))
            	break;
            numTries++;
            System.out.println("Incorrect.");
        }
        in.close();
    }
}
