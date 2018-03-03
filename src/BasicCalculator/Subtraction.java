package BasicCalculator;

/**
 * @author Pushkarraj
 * @since 03-03-2018.
 */
public class Subtraction implements ICalculate{
    private int z ;
    @Override
    public void calculationStrategy(int x, int y) {
        z = x - y;
        System.out.println("Subtraction of x = "+x+" and y = "+y+" is = "+z);
    }
}
