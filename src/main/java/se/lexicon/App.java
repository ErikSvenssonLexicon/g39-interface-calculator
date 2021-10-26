package se.lexicon;

import se.lexicon.model.BasicCalculator;

/**
 * G39 - Interface calculator
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        CalculatorConsole calculatorConsole = new CalculatorConsole(
                new BasicCalculator()
        );
        calculatorConsole.running();
        System.out.println("Goodbye!");
    }
}
