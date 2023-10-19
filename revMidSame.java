import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a 3-digit number: ");
        num = scanner.nextInt();

        if (num >= 100 && num <= 999) {
            int firstDigit = num / 100;
            int middleDigit = (num / 10) % 10;
            int lastDigit = num % 10;

            int reversedNum = (lastDigit * 100) + (middleDigit * 10) + firstDigit;

            System.out.println("Original number: " + num);
            System.out.println("Reversed number with swapped first and last digits: " + reversedNum);
        } else {
            System.out.println("Invalid number. Please enter a 3-digit number.");
        }
    }
}
