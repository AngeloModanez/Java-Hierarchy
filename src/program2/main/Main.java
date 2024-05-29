package program2.main;

import java.util.Scanner;

import program2.operation.Operation;

public class Main {
    public static void main(String[] args) {
        double a, b, reSum, reSub, reMul, reDiv;
        Scanner in = new Scanner(System.in);
        Operation op = new Operation();

        System.out.print("Type a value: ");
        a = in.nextInt();

        System.out.print("Type a second value: ");
        b = in.nextInt();

        in.close();

        try{
            reSum = op.sum(a, b);
            System.out.println("Sum :" + reSum);
            reSub = op.sub(a, b);
            System.out.println("Subtract :" + reSub);
            reMul = op.mul(a, b);
            System.out.println("Multiply :" + reMul);
            reDiv = op.div(a, b);
            System.out.println("Divide :" + reDiv);
        } catch (Exception ex) {
            System.out.println("The number should be May 0 or positive");
        }
    }
}
