import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Teona Odisharia on 10/18/2015.
 */
public class SieveOfEratosthenes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sheiyvanet saboloo ricxvi:");
        int lastN = sc.nextInt();
        boolean[] primes=new boolean[lastN];

        Arrays.fill(primes, true);
        primes[0]=primes[1]=false;
        for (int i=2;i<primes.length;i++) {
            if(primes[i]) {
                for (int j=2;i*j<primes.length;j++) {
                    primes[i*j]=false;
                }
            }
        }
        for (int i = 0; i < primes.length; i++) {
            if(primes[i]== true){
                System.out.print(i + " ");
            }
        }
    }
}

