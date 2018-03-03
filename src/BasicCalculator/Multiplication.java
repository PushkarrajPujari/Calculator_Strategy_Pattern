package BasicCalculator;

/**
 * @author  Pushkarraj
 * @since 03-03-2018.
 */
public class Multiplication implements ICalculate{
    private int z;
    @Override
    public void calculationStrategy(int x, int y) {
        z = x * y;
        System.out.println("Multiplication of x = "+x+" and y = "+y+" is = "+z);
    }
}
