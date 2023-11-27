import java.util.Scanner;
public class ParabolaEquationLogic {
    private int a;
    private int b;
    private int c;
    public ParabolaEquationLogic() {
    }
    public void start() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Parabola Calculator!");
        System.out.println("1) Equation");
        System.out.println("2) Coordinate Location");
        System.out.println("3) x Finder");
        System.out.println("4) y Finder");
        int choice = scan.nextInt();
        if
        System.out.println("Enter a value for a:");
        a = scan.nextInt();
        System.out.println("Enter a value for b:");
        b = scan.nextInt();
        System.out.println("Enter a value for c:");
        c = scan.nextInt();
    }
    public int getA() {
        return a;
    }
    public int setA(int newA) {
        a = newA;
        return a;
    }
    public int getB() {
        return b;
    }
    public int setB(int newB) {
        b = newB;
        return b;
    }
    public int getC() {
        return c;
    }
    public int setC(int newC) {
        c = newC;
        return c;
    }
    public String equation() {
        return "y = " + a + "x^2 + " + b + "x + " + c;
    }

    public boolean isCoordOnParabola(int x, int y) {
        if (y == a * Math.pow(x, 2) + b * x + c) {
            return true;
        } else {
            return false;
        }
    }


}
