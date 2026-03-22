import java.util.Scanner;

public class task3 {

    public static boolean isPrimeorComposite(int b, int t) {

        if (b <= 2)
            return b == 2;

        if (b % t == 0)
            return false;

        if (t * t > b)
            return true;

        return isPrimeorComposite(b, t + 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (isPrimeorComposite(n, 2))
            System.out.println("prime");
        else
            System.out.println("composite");
    }
}

