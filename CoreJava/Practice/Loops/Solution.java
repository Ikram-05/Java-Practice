import java.util.Scanner;
class Solution
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            int product=n*i;
            System.out.println(n+" x "+i+" = "+product);
        }
        sc.close();  
    }
}