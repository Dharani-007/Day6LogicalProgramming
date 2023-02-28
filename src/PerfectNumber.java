import java.util.Scanner;


public class PerfectNumber  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        int sum = 0;
        System.out.println("The divisors are ");
//Finding perfect number
        for(int i=1; i<num ;i++){
            //the program checks if num is divisible by i using the modulo operator
            if (num%i==0){
                sum+=i;
                System.out.println(i);
            }
        }
        if (sum==num){
            System.out.println("So "+num + " is a perfect number");
        }else
            System.out.println("So "+num+" is not a perfect number");
    }
}