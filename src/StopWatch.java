import java.util.Random;
import java.util.*;

public class StopWatch {

    public static void main(String[] args) {
        System.out.println("Welcome To The Stop Watch Program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a key to start the time");
        char startch = sc.next().charAt(0);
        Long start = System.currentTimeMillis();
        System.out.println("Enter a key to stop the time");
        char stopch = sc.next().charAt(0);
        Long stop = System.currentTimeMillis();
        float timeElapsed = (float) (stop - start) / 1000;
        System.out.println("Time = " + timeElapsed + " Seconds");
    }
}