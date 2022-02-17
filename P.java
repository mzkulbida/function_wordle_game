
/**
 * Polynomial function of the form c*x^n
 *
 * @author Max Kulbida
 * Date: 2/15/2022
 */
public class P extends Function
{
    private int exp;
    
    public P(int scaleValue, int power)
    {
        super(scaleValue);
        exp = power;
    }
    
    public int getPower(){return exp;}
    
    public int of(int y)
    {
        return getScale() * (int) Math.pow(y, exp);
    }
    public String toString(String var){
        String ret = "";
        if(getScale() != 1)
            ret += getScale() + "*";
        ret += var;
        if(exp != 1)
            ret += "^" + exp;
        return ret;
    }
}
