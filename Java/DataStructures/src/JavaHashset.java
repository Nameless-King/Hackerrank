import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class JavaHashset {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Set<String> names = new HashSet<>();
        int numPairs = console.nextInt();

        for(int i = 0;i<numPairs;i++){
            String s0 = console.nextLine();

            if (!names.contains(s0)) {
                names.add(s0);
            }
           System.out.println(names.size());
        }

        console.close();
    }

}
