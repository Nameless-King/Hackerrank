package introduction;

import java.util.Scanner;

public class SubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String line = s;
        int divider = k;
        String smallest = null;
        String largest = null;

        String[] stringArr = new String[line.length() - (divider - 1)];

        for (int i = 0; i < line.length() - (divider - 1); i++) {
            stringArr[i] = line.substring(i, i + divider);
            if (smallest == null && largest == null) {
                smallest = stringArr[i];
                largest = stringArr[i];
            }
            if (smallest.compareTo(stringArr[i]) > 0) {
                smallest = stringArr[i];
            }
            if (largest.compareTo(stringArr[i]) < 0) {
                largest = stringArr[i];
            }
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}