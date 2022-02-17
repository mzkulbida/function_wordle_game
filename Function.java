
/**
 * Abstract superclass for a single polynomial, exponential, constant, etc. term
 *
 * @author mzkulbida
 * Date: 2/15/2022
 */
public abstract class Function
{
    private int scale;

    public Function(int scaleValue)
    {
        scale = scaleValue;
    }
    
    public int getScale(){return scale;}
    
    public abstract int of(int y);
    public abstract String toString(String var);
}
