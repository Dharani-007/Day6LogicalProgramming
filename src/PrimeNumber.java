import java.util.Scanner;

public class PrimeNumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        int count=0;
// If the number is divisible by any number in this range,
// the counter variable is incremented
        for(int i=2;i<num;i++){
            if (num%i==0){
                count++;
            }
        }
        if (count==0){
            System.out.println(num+ " is a prime number");
        }else
            System.out.println(num + " is not a prime number");
    }

}
