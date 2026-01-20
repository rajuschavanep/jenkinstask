package newjen.task;

public class Calculator {


    public static double add(double a, double b) {
        return a + b;
    }
    
    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int pow(int a, int b) {
        return (int) Math.pow(2, 3);
    }
    
    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }
	
    public static double mod(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }
    
    
    
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }
    
    public static int mod(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }
    
    public static double sqrt(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negative number not allowed");
        }
        return Math.sqrt(n);
    }
}
