import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        int iter = console.nextInt();
        for(int i = 0;i<iter;i++){
            list.add(console.nextInt());
        }

        iter = console.nextInt();
        for(int i = 0;i<iter;i++){
            String instruction = console.next();
            if(instruction.equals("Insert")){
                int index = console.nextInt();
                int num = console.nextInt();

                list.add(index,num);
            }else{
                int index = console.nextInt();
                list.remove(index);
            }
        }

        System.out.print(list.get(0));
        for(int i = 1;i<list.size();i++){
            System.out.print(" "+list.get(i));
        }
    }

}
