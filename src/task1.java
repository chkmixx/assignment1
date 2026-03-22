import java.util.Scanner;

public class task1 {

    public static void numbers(int n) {
        if (n == 0) return;

        numbers(n / 10);
        System.out.println(n % 10);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        numbers(n);
    }
}

