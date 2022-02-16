
/**
 * Exponential function of the form c*n^x
 *
 * @author Max Kulbida
 * Date: 2/15/2022
 */
public class Exp extends Function
{
    private int base;
    public Exp(int scaleValue, int power)
    {
        super(scaleValue);
        base = power;
    }
    
    public int getBase(){return base;}
    
    public int of(int y)
    {
        return getScale() * (int) Math.pow(base, y);
    }
    public String toString(){
        return getScale() + "*" + base + "^x";
    }
}
