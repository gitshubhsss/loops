import java.util.Scanner;

public class sumOfN{
    public static void main(String[] args) {
        //print the sum of natural numbers
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int count=1;
        int sum=0;
        while (count<=n) {
           sum=sum+count;
            count++;
        }
        System.out.println("sum is : "+sum);
    }
}