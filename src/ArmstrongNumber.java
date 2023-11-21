import java.util.Scanner;

public class ArmstrongNumber {
    /*
    An Armstrong number is a positive m-digit number
    that is equal to the sum of the mth powers of their digits.
    It is also known as pluperfect, or Plus Perfect, or Narcissistic number.

    153: 13 + 53 + 33 = 1 + 125+ 27 = 153
    125: 13 + 23 + 53 = 1 + 8 + 125 = 134 (Not an Armstrong Number)
    */
    public static void main(String[] args) {
        int temp, ones, tens, hundreds;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a 3-digit number: ");
        int number = scanner.nextInt();
        scanner.close();
        if (number >= 100 && number <= 999) {

            temp = number;

            ones = temp % 10;
            temp /= 10;

            tens = temp % 10;
            temp /= 10;

            hundreds = temp % 10;
            temp /= 10;

            int sum = (int) Math.pow(ones, 3) + (int) Math.pow(tens, 3) + (int) Math.pow(hundreds, 3);

            if (sum == number) {
                System.out.println(number + " is an Armstrong Number");
            } else {
                System.out.println(number + " is not an Armstrong Number");
            }
        } else {
            System.out.println("Wrong number entered");
        }


    }
}
