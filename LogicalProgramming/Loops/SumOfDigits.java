//This program is for adding the digits of the number
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int sum=0;
        while(num!=0){
            int digit=num%10;
            sum+=digit;
            num/=10;
        }
        System.out.println("Sum of digit is "+sum);
        sc.close();

    }
}
