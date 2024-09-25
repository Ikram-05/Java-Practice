//Program for calculate the Factorial of the number

import java.util.Scanner;

public class Factorial {

    static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        System.out.println("Factorial of the number="+factorial(num));

    }
}
