import java.util.Scanner;
public class Day6 {
 public static void main(String[] args) {
        int number = 12345;
        int reversed = 0;
        
        // For loop to reverse the number
        for (; number != 0; number /= 10) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
        }
        System.out.println("Reversed number: " + reversed);
    }
}
   
