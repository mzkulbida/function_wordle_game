
/**
 * Constant function
 * 
 * @author Max Kulbida
 * Date: 2/15/2022
 */
public class C extends Function
{
    public C(int value)
    {
        super(value);
    }
    
    public int of(int y){return super.getScale();}
    public String toString(String var){return "" + super.getScale();}
}
