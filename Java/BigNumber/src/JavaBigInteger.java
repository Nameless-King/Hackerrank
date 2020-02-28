import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String sNum1 = console.next();
        String sNum2 = console.next();
        BigInteger b1 = new BigInteger(sNum1);
        BigInteger b2 = new BigInteger(sNum2);
        System.out.println(b1.add(b2).toString());
        System.out.println(b1.multiply(b2).toString());
    }
}
