import java.math.BigDecimal;
import java.util.Scanner;

public class JavaBigDecimal {
    public static void main(String[] args) {
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();


        BigDecimal[] decimals = new BigDecimal[n];
        for(int i = 0;i<n;i++){
            decimals[i] = new BigDecimal(s[i]);
        }

        String[] sorted = new String[n];
        for(int j=0;j<n;j++){
            int most = n-1;
            for(int i = n-2;i>=0;i--){
                if(decimals[i]!=null){
                    if(decimals[most]==null||decimals[most].compareTo(decimals[i])<=0){
                        most = i;
                    }
                }
            }
            decimals[most] = null;
            sorted[j] = s[most];
        }

        s = sorted;

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
