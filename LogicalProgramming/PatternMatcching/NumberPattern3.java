//this program to print a number in pattern

import java.util.Scanner;

public class NumberPattern3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no of row ");
        int row=sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row;j++){
                System.out.print(i+j+" ");
            }
            System.out.println("");
        }
        sc.close();

    }
}
