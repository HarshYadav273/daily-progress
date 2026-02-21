import java.util.Scanner;
public class Day3 {
 public static void main(String[] args) {
    // Check wheather a character is vowel or constant//
try(Scanner sc=new Scanner(System.in)){
System.out.print("Please enter a charcter(A to Z):");
String charcter=sc.next();

// Validate single charcter//
 if (charcter.length() != 1) {
            System.out.println("Error: Please enter only ONE character.");
            return;
        }
 // Convert to lowercase
char input=Character.toLowerCase(charcter.charAt(0));

// Check if input is an alphabet
if (input<'a'||input>'z') {
   System.out.println("Error: Not an alphabet.");
   return; 
} 
  if(input=='a'||input=='e'||input=='i'||input=='o'||input=='u'
)
{
    System.out.println(input+" is a vowel");
}
else
    {
    System.out.println(input+" is a constant");
}
}
 }   
}
