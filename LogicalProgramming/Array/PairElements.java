//Program to print a pair elements where sum is equal to user entered value

import java.util.Scanner;

public class PairElements {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array ");
        int s=sc.nextInt();
        int[] arr=new int[s];
        System.out.println("Enter array elemests ");
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the value for pair element");
        int num=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==num)
                    System.out.println("("+arr[i]+","+arr[j]+")");
            }
        }
        sc.close();
    }
}