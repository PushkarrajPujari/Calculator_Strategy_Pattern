package BasicCalculator;

/**
 * @author Pushkarraj
 * @since 03-03-2018.
 */
public class Addition implements ICalculate{
    private int z;
    @Override
    public void calculationStrategy(int x, int y) {
        z = x + y;
        System.out.println("Addition of x = "+x+" and y = "+y+" is = "+z);
    }
}
