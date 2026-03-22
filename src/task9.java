import java.util.Scanner;

public class task9 {

    static int countChars(String s) {

        if (s.length() == 0) {
            return 0;
        }

        return 1 + countChars(s.substring(1));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(countChars(s));
    }
}
