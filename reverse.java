
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       int num;
       Scanner scanner=new  Scanner(System.in);
        System.out.println("enter a 3 digit number");
         num=scanner.nextInt();
         if(num>=100 &&  num<=999)
         {
             int rev=0;
             while(num>0) {
                 int r = num % 10;
                 rev = rev * 10 + r;
                 num/=10;

             }
             System.out.println(rev);

         }
         else
             System.out.println("Invalid number\nPlease Enter 3 digit number:");
    }
}