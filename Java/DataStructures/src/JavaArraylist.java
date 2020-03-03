import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaArraylist {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        List<List<Integer>> list = new ArrayList<>();


        int n = console.nextInt();


        for(int i = 0;i<n;i++){
            list.add(new ArrayList<>());
            int d = console.nextInt();
            for(int j = 0;j<d;j++){
                list.get(i).add(console.nextInt());
            }
        }

        int q = console.nextInt();
        for(int i = 0;i<q;i++){
            int x = console.nextInt();
            int y = console.nextInt();

            try{
                System.out.println(list.get(x).get(y));
            }catch(Exception e){
                System.out.println("ERROR!");
            }
        }

        console.close();
    }

}
