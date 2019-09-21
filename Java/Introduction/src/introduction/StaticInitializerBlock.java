package introduction;

import java.util.Scanner;

public class StaticInitializerBlock {
    static final int B;
    static final int H;
    static boolean flag;
    static {
        Scanner in = new Scanner(System.in);
        B = in.nextInt();
        H = in.nextInt();
        in.close();
        if (B > 0 && H > 0) {
            flag = true;
        } else {
            System.out.println(
                    "java.lang.Exception: Breadth and height must be positive");
        }

    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.println(area);
        }
    }
}
