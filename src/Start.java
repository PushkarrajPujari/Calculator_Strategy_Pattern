import BasicCalculator.Addition;
import BasicCalculator.Calculator;

/**
 * @author Pushkarraj
 * @since 03-03-2018.
 */
public class Start {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setiCalculate(new Addition());
        calculator.enterNumber();
        calculator.calculate();
    }
}
