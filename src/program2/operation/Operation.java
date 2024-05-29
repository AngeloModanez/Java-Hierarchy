package program2.operation;

public class Operation {
    public double sum(double a, double b) throws Exception {
        if (a < 0 || b < 0) {
            throw new Exception("The number not can be negative");
        } else {
            return a + b;
        }
    }

    public double sub(double a, double b) throws Exception {
        if (a < 0 || b < 0) {
            throw new Exception("The number not can be negative");
        } else {
            return a - b;
        }
    }

    public double mul(double a, double b) throws Exception {
        if (a < 0 || b < 0) {
            throw new Exception("The number not can be negative");
        } else {
            return a * b;
        }
    }

    public double div(double a, double b) throws Exception {
        if (a < 0 || b < 0) {
            throw new Exception("The number not can be negative");
        } else {
            return a / b;
        }
    }
}
