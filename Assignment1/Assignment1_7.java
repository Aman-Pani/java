/*Write a Java program that will evaluate the following exponential series */
import java.util.Scanner;

public class Assignment1_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("x => represents value of x \nn => represents power of x");
        System.out.print("Enter value of x :: ");
        int x = in.nextInt();

        System.out.print("Enter value of n :: ");
        int n = in.nextInt();

        System.out.println(series(n, x));
        in.close();
    }
    static int series(int n,int x) {
        int sum = x;
        for (int i = 0; i < n; i++) {
            sum += (Math.pow(x, i) / factorial(i));
        }
        return sum;
    }
    static int factorial(int n) {
        int p = 1;
        for (int i = 1; i <= n; i++)
            p *= i;
        return p;
    }
}
