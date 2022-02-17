
/**
 * Tests a function to be guessed
 *
 * @author mzkulbida
 * Date: 2/16/2022
 */
public class GuessFunctionTester
{
    public static void main(String[] args){
        //2*2^(2^x)... Yeah it'll grow fast
        Function[] terms = {new Nested(2, new Exp(1, 2), new Exp(1,2))};
        GuessFunction f = new GuessFunction(terms);
        System.out.println("f(x) = " + f.toString());
        System.out.println("Test Values:");
        System.out.println("f(1) = " + f.of(1));
        System.out.println("f(2) = " + f.of(2));
        System.out.println("f(3) = " + f.of(3));
        System.out.println("f(4) = " + f.of(4));
        System.out.println("f(5) = " + f.of(5));
        System.out.println("f(6) = " + f.of(6));
        System.out.println("f(7) = " + f.of(7));
        System.out.println("f(8) = " + f.of(8));
        System.out.println("f(9) = " + f.of(9));
        System.out.println("f(10) = " + f.of(10));
    }
}
