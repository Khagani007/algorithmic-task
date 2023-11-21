import java.util.Scanner;

public class EvenOddNumber {

    // Even number : if (number / 2 = 0) this is the even number
    // Odd number : if (number / 2!= 0) this is the odd number

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        if (num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }


}
