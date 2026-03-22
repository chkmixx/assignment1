import java.util.Scanner;

public class task2 {

    public static int sum(int n, Scanner t) {
        if (n == 0) return 0;

        int x = t.nextInt();
        return x + sum(n - 1, t);
    }

    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);

        int n = t.nextInt();
        int total = sum(n, t);

        double average = (double) total / n;
        System.out.println(average);
    }
}
