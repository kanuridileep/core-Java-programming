import java.util.Scanner;
public class Calculator
{
    public static void main(String[] args) {
        int a,b;
        Scanner scanner=new Scanner(System.in);
        System.out.println("a= ");
        a=scanner.nextInt();
        System.out.println("b= ");
        b=scanner.nextInt();
        add(a,b);
        sub(a,b);
        mul(a,b);
        div(a,b);
        rem(a,b);
    }
    public static void add(int a,int b)
    {
        int sum=a+b;
        System.out.println("sum="+sum);
    }

    public static void sub(int a,int b)
    {
        int diff=a-b;
        System.out.println("difference="+diff);
    }
    public static void mul(int a,int b)
    {
        int pro=a*b;
        System.out.println("product="+pro);
    }

    public static void div(int a,int b)
    {
        if(b==0){
            System.out.println("divide by zero(0) is not done");}
        else {
            int division = a / b;
            System.out.println("division=" + division);
        }
    }

    public static void rem(int a,int b) {
        if (b == 0) {
            System.out.println("divide by zero(0) is not done");
        } else {
            int r = a % b;
            System.out.println("remainder=" + r);
        }
    }
}
