
import java.util.Scanner;
public class StudentId {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String name = id.nextLine();//got name

        System.out.println("Enter your age:");
        int age = id.nextInt();//got age
        id.nextLine();
        //Displaying the information
        System.out.println("Enter blood group");
        String blood = id.nextLine();//got blood group
        System.out.println("-------------------------");
        System.out.println("Name: " + name);
        System.out.println("age: " + age);
        System.out.println("Blood Group: " + blood);
        System.out.println("-------------------------");
        String grade = groupAssign(age);
        System.out.println("Your group is " + grade);
        System.out.println("-------------------------");
    }
    static String groupAssign(int age){
            //group assigning based on age
        /* >=20--RED
           >=15--BLUE
           >=10--yellow
         */
            if(age>=20)
            {
                return "RED";
            }
            else if(age>=15)
            {
               return "BLUE";
            }
            else
            {
                 return "YELLOW";
            }

        }
}
