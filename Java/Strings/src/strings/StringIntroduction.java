package strings;

import java.util.Scanner;

public class StringIntroduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();
        String result;
        String[] sorted = new String[2];
        if (B.compareTo(A) < 0) {
            sorted[0] = B;
            sorted[1] = A;
            result = "Yes";
        } else {
            sorted[0] = A;
            sorted[1] = B;
            result = "No";
        }

        A = A.substring(0, 1).toUpperCase() + A.substring(1);
        B = B.substring(0, 1).toUpperCase() + B.substring(1);

        System.out.println((A.length() + B.length()));
        System.out.println(result);
        System.out.println(A + " " + B);
        sc.close();
    }
}
