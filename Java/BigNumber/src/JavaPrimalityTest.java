import java.math.BigInteger;
import java.util.Scanner;

public class JavaPrimalityTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String n = console.nextLine();

        BigInteger probablePrime = new BigInteger(n);

        if(probablePrime.isProbablePrime(n.length())){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }

        console.close();
    }
}
