import java.util.Scanner;
public class TaxCalculator
{
    public static void main(String[] args) {
        System.out.println("TAX CALCULATOR APP");
        System.out.println("------WELCOME------");
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter total persons count:");
        int percount=scanner.nextInt();

        String[] names=new String[percount];// array to store names
        long[] income=new long[percount];   // array to store income

        for(int i=0;i<percount;i++) {
            scanner.nextLine();
            System.out.println("enter  name" + (i + 1) + ":");
            names[i] = scanner.nextLine();

            System.out.println("enter " + names[i] + "'s Annual income");
            income[i] = scanner.nextLong();
        }



            System.out.println("Names with liable taxes");
            System.out.println("-----------------------");

            for(int i=0;i<percount;i++)
            {
                calculateTax(names[i],income[i]);
            }
        }


    static void calculateTax(String name,Long income){
        long tax;
        if (income>=300000)
            tax=(income*20/100);
        else if(income>=100000)
            tax=(income*10/100);
        else
            tax=0;

        System.out.println(name+"'s tax = "+tax);
    }
}
