package introduction;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String result = "";
        if (num % 2 == 1) {
            result = "Weird";
        } else if (num % 2 == 0 && num >= 2 && num <= 5) {
            result = "Not Weird";
        } else if (num % 2 == 0 && num >= 6 && num <= 20) {
            result = "Weird";
        } else if (num % 2 == 0 && num > 20) {
            result = "Not Weird";
        }

        System.out.println(result);
        in.close();

    }
}
