import java.util.Scanner;


public class ReverseANumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String number = scanner.next();
        int newNum = Integer.parseInt(number);
        int reverseNum=0;

        for(int i=1;i<=number.length();i++){
            int remainder = newNum % 10;
            newNum = newNum/10;
            reverseNum = reverseNum * 10 + remainder;
        }
        System.out.println("Reverse number is: "+ reverseNum);
    }

}
