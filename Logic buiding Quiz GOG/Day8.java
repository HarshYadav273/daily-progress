import java.util.Scanner;

public class Day8 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the nubmber:");
      int number = sc.nextInt();
        int reversed = 0;
        
        // For loop to reverse the number
        for (int i= number ;i>0;i=i/10) {
            int digit = i % 10;
            reversed = reversed * 10 + digit;
        }
if(reversed==number){
    System.out.println(number+" is a palindrome ");
}else{
    System.out.println(number+" is not a palindrome");
} 
sc.close();
  }  
}
