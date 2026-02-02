import java.util.Scanner;
public class Day5 {
    public static void main(String[] args) {
        // Count number of digits in a integer
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number ");
        int num=sc.nextInt();
        int count=0;
        num=Math.abs(num);
        if (num==0) {
          System.out.println("1 digit");  
        }else{
            for(int i=num;i>0;i=i/10){
                count++;
            }
           
        } System.out.println(count+" digits");
    }
}
