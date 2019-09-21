package strings;

import java.util.Scanner;

public class StringToken {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        scan.close();
        if (s.length() <= 400000 && s.length() > 0) {
            String[] stringSplit = s.split("[ !,?._'@]++");
            System.out.println(stringSplit.length);
            for (String str : stringSplit) {
                System.out.println(str);
            }
        } else if (s.length() == 0) {
            System.out.println(0);
        }

    }
}
