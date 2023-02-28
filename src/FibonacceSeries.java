import java.util.Scanner;

public class FibonacceSeries {
    public static void main(String[] args) {
        //Initializing
        int a=0,b=1,sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of terms n: ");
        // Input int,used nextint
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            System.out.println(a);
            sum=a+b;
            a=b;
            b=sum;
        }
    }
}
