/*Write a java program that will count 
the number of primes between 37 and 129.*/
public class Assignment1_6 {
    public static void main(String args[]) {
        int count= 0;
        for (int i = 37; i <= 129; i++)
            if (prime(i))
                count++;
        System.out.println(count);
    }

    static boolean prime(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++)
            if (num % i == 0)
                count++;
        return (count == 2);
    }
}
