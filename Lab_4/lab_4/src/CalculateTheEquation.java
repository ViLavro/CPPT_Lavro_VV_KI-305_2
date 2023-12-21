import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculateTheEquation implements CalculateTheEquationInterface {
    @Override
    public double doCalculation(double variable) {
        try {
            return (7 * variable) / (Math.cos(variable) / Math.sin(2 * variable - 4));
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception: illegal value.");
            // Обробка арифметичної помилки (якщо необхідно)
        }
        return 0;
    }

    @Override
    public double doCalculationWithInputInside() {
        try {
            Scanner inputScanner = new Scanner(System.in);
            System.out.print("Enter value: ");
            double value = inputScanner.nextDouble();
            inputScanner.nextLine(); // Додано, щоб взяти перенос рядка після введення числа

            return (7 * value) / (Math.cos(value) / Math.sin(2 * value - 4));
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception: illegal value.");
            // Обробка арифметичної помилки (якщо необхідно)
        } catch (InputMismatchException e) {
            System.out.println("Input exception: illegal value.");
            // Обробка помилки введення (якщо необхідно)
        }
        return 0;
    }
}
