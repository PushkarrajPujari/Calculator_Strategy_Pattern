package BasicCalculator;

import java.util.Scanner;

/**
 * @author Pushkarraj
 * @since 03-03-2018.
 */
public class Calculator {
    private int x;
    private int y;
    private Scanner scanner;
    private ICalculate iCalculate;
    public Calculator(){
        this.scanner = new Scanner(System.in);
    }
    public Calculator(ICalculate iCalculate){
        this();
        this.iCalculate = iCalculate;
    }

    public void enterNumber(){
        System.out.println("Enter the value for 'X' ");
        x = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the value for 'Y' ");
        y = Integer.parseInt(scanner.nextLine());
    }
    public void calculate(){
        iCalculate.calculationStrategy(x,y);
    }

    public void setiCalculate(ICalculate iCalculate) {
        this.iCalculate = iCalculate;
    }
}
