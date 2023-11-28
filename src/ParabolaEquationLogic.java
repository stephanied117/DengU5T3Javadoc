/**
 * The ParabolaEquationLogic class utilizes input values to produce an output.
 *
 * @author Stephanie Deng
 */
import java.util.Scanner;
public class ParabolaEquationLogic {
    /** a of the equation y = ax^2 + bx + c */
    private int a;
    /** b of the equation y = ax^2 + bx + c */
    private int b;
    /** c of the equation y = ax^2 + bx + c */
    private int c;
    /**
     * a constructor with no parameters
     */
    public ParabolaEquationLogic() {
    }
    /**
     * Prints out a menu
     *
     * Sets the values of a, b, and c to the values of the user input
     */
    public void start() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Parabola Calculator!");
        System.out.println("1) Equation");
        System.out.println("2) Coordinate Location");
        System.out.println("3) x Finder");
        System.out.println("4) y Finder");
        int choice = scan.nextInt();
        if (choice == 1) {
            System.out.println("Enter a value for a:");
            a = scan.nextInt();
            System.out.println("Enter a value for b:");
            b = scan.nextInt();
            System.out.println("Enter a value for c:");
            c = scan.nextInt();
        }
    }
    /**
     * Returns the value of a of the equation y = ax^2 + bx + c
     *
     * @return the value of the coefficient of x^2
     */
    public int getA() {
        return a;
    }
    /**
     * Sets the new value of a of the equation y = ax^2 + bx + c from a user input
     *
     * @param newA the new value of the coefficient of x^2
     */
    public void setA(int newA) {
        a = newA;
    }
    /**
     * Returns the value of b of the equation y = ax^2 + bx + c
     *
     * @return the value of the coefficient of x
     */
    public int getB() {
        return b;
    }
    /**
     * Sets the new value of b of the equation y = ax^2 + bx + c from a user input
     *
     * @param newB the new value of the coefficient of x
     */
    public void setB(int newB) {
        b = newB;
    }
    /**
     * Returns the value of c of the equation y = ax^2 + bx + c
     *
     * @return the value of the constant term
     */
    public int getC() {
        return c;
    }
    /**
     * Sets the new value of c of the equation y = ax^2 + bx + c from a user input
     *
     * @param newC  the new value of the constant term
     */
    public void setC(int newC) {
        c = newC;
    }
    public String equation() {
        return "y = " + a + "x^2 + " + b + "x + " + c;
    }
    /**
     * Returns true or false depending on whether the values of x and y make the equation true
     *
     * @return  determines if the coordinates are on the parabola
     */
    public boolean isCoordOnParabola(int x, int y) {
        if (y == a * Math.pow(x, 2) + b * x + c) {
            return true;
        } else {
            return false;
        }
    }


}
