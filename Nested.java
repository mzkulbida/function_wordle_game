
/**
 * A nested function g(f(x)). Not very practical because of how fast functions of this nature grow if restricted to polynomials and exponentials
 *
 * @author Max Kulbida
 * Date: 2/16/2022
 */
public class Nested extends Function
{
    Function g;
    Function f;
    /**
     * Constructor for objects of class Nested
     */
    public Nested(int scale, Function outside, Function inside)
    {
        super(scale);
        g = outside;
        f = inside;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int of(int para)
    {
        return getScale() * g.of(f.of(para));
    }
    public String toString(String var){
        String ret = "";
        if(getScale() != 1)
            ret += getScale() + "*";
        return ret + g.toString("(" + f.toString(var) + ")");
    }
    
}
