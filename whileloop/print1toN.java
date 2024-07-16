import java.util.Scanner;

public class print1toN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();

        if(n==0){
            System.out.println("value should be greater than 0");
        }
        int count=1;

        while (count<=n) {
            System.out.println(count);
            count++;
        }
    }
}
