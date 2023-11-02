import java.util.Scanner;

public class question4Array {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int inputArray, inputElement;
        int bigNumber = 0;

        System.out.print("Enter the number of array element   : ");
        inputArray = input.nextInt();
        int[] number = new int[inputArray];

        for (int i = 0; i < number.length; i++) {
            System.out.print("Enter the value of element " + (i + 1) + " : ");
            inputElement = input.nextInt();
            number[i] = inputElement;
        }

        for (int i = 0; i < number.length; i++) {
            if (number[i] > bigNumber) {
                bigNumber = number[i];
            }
        }

        System.out.println("The largest number is " + bigNumber);

    }
}