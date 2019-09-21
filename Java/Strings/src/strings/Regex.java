package strings;

import java.util.Scanner;

public class Regex {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
        in.close();
    }
}

class MyRegex {
    String z5 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
    public String pattern = this.z5 + "\\." + this.z5 + "\\." + this.z5 + "\\."
            + this.z5;

}
