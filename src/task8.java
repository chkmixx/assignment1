import java.util.Scanner;

public class task8 {

    static boolean onlyDigits(String s) {

        if (s.length() == 0) return true;

        if (!Character.isDigit(s.charAt(0))) return false;

        return onlyDigits(s.substring(1));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        System.out.println(onlyDigits(s1) ? "Yes" : "No");
        System.out.println(onlyDigits(s2) ? "Yes" : "No");

    }
}
