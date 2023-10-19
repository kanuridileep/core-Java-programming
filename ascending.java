import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter array size:");
        int n=scanner.nextInt();//no. of elements in array

        System.out.println("enter array elements");
        int i,temp;
        int[] arr=new int[n];
        for (i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();// array elements were scanned
        }
        for (i=0;i<n-1;i++)
        {
            for (int j=0;j<n-i-1;j++)
            {
            if (arr[j]>arr[j+1])
            { 
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
        }
        System.out.println("asscending order:-----------------");
        for (i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }

    }
}