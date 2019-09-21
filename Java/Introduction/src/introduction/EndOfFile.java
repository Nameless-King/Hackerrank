package introduction;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EndOfFile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        while (in.hasNext()) {
            list.add(in.nextLine());
        }

        for (int i = 1; i <= list.size(); i++) {
            System.out.println(i + " " + list.get(i - 1));
        }
        in.close();
    }
}
