//PROGRAM TO CHECK A NUMBER IS PRIME OR NOT

import java.util.Scanner;
public class PrimeNumber {
    static boolean isPrime(int n){
        if(n<=1)
            return false;
        for(int i=2;i<=n/2;i++){
            if(n%i==0)
                return false;
        }
            return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        System.out.println(isPrime(num)?"PrimeNumber":"Not a Prime Number");
        sc.close();
    }
}
