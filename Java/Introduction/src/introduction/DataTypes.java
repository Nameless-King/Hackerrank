package introduction;


import java.util.Scanner;

public class DataTypes {
    public static void main(String[] argh) {

        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();

        for (int i = 0; i < cases; i++) {

            try {
                long num = in.nextLong();
                System.out.println(num + " can be fitted in:");
                if (num >= -128 && num <= 127) {
                    System.out.println("* byte");
                }
                //Complete the code
                if (num >= -Math.pow(2, 15) && num <= Math.pow(2, 15) - 1) {
                    System.out.println("* short");
                }
                if (num >= -Math.pow(2, 31) && num <= Math.pow(2, 31) - 1) {
                    System.out.println("* int");
                }
                if (num >= -Math.pow(2, 63) && num <= Math.pow(2, 63) - 1) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                System.out.println(in.next() + " can't be fitted anywhere.");
            }
        }
        in.close();
    }
}
