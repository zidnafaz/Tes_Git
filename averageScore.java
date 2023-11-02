import java.util.Scanner;

public class averageScore {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int inputnumber;
        double total = 0;
        double average;
        
        System.out.print("Enter the number of student : ");
        inputnumber = input.nextInt();
        int[] score = new int[inputnumber];

        for (int i = 0; i < score.length; i++) {
            System.out.print("Enter student score " + (i + 1) + " : ");
            score[i] = input.nextInt();
        }

        for (int i = 0; i < score.length; i++) {
            total += score[i];
        }

        average = total / score.length;
        System.out.println("The class average score is " + average);
    }
}
