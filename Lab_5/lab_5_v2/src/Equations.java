/**
 * Class <code>Equations</code> implements method for  y=7x/tg(2x-4) expression calculation
 * @version 1.0
 */
class Equations {

    public double calculate(double x) throws CalcException {
        double y, rad;
        rad = x * Math.PI / 180.0;
        try {
            if (rad != 0) {
                y = (7 * rad) / (Math.cos(rad) / Math.sin(2 * rad - 4));
                return y;
            } else {
                System.out.println("Arithmetic exception: illegal value (division by zero).");
            }
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception: illegal value.");
        }
        return 0;
    }
}
