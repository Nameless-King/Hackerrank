package strings;

import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        a = a.toLowerCase();
        b = b.toLowerCase();
        int[] aa = new int[26];
        int[] ba = new int[26];
        for (int i = 0; i < a.length(); i++) {
            ba[b.charAt(i) - 97]++;
            aa[a.charAt(i) - 97]++;
        }
        boolean equal = true;
        for (int i = 0; i < aa.length; i++) {
            if (ba[i] != aa[i]) {
                equal = false;
                i = aa.length;
            }
        }
        return equal;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
