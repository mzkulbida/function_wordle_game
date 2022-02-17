
/**
 * Describes a mathematical function consisting of the sum of several terms
 *
 * @author Max Kulbida
 * Date: 2/15/2022
 */
public class GuessFunction
{
    Function[] fs;
    public GuessFunction(Function[] fofX)
    {
        fs = fofX;
    }
    
    public int of(int y){
        int ret = 0;
        for(Function f : fs)
            ret += f.of(y);
        return ret;
    }
    public String toString(){
        String ret = "";
        for(Function f : fs){
            ret += f.toString("x");
            if(f != fs[fs.length-1])
                ret += "+";
        }
        return ret;
    }
}
