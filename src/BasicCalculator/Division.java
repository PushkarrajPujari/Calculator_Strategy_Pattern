package BasicCalculator;

/**
 * @author  Pushkarraj
 * @since 03-03-2018.
 */
public class Division implements ICalculate{
    private int z;
    @Override
    public void calculationStrategy(int x, int y) {
        z = x / y ;
        System.out.println("Division of x = "+x+" and y = "+y+" is = "+z);
    }
}
