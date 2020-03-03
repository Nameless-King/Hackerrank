import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int numElements = Integer.parseInt(console.nextLine());
        Map<String, String> lookup = new HashMap<>();
        for(int i = 0;i<numElements;i++){
            String name = console.nextLine();
            String num = console.nextLine();
            lookup.put(name,num);
        }

       while(console.hasNext()){
            String current = console.nextLine();
            if(lookup.containsKey(current)){
                System.out.println(current+"="+lookup.get(current));
            }else{
                System.out.println("Not found");
            }
        }

        console.close();
    }
}
