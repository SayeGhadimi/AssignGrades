import java.util.Scanner;

public class AssignGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        int[] scores = new int[numberOfStudents];

               System.out.print("Enter " + numberOfStudents + " scores: ");
        for (int i = 0; i < numberOfStudents; i++) {
            scores[i] = input.nextInt();
        }

       
        int best = scores[0];
        for (int score : scores) {
            if (score > best) {
                best = score;
            }
        }

       
        for (int i = 0; i < numberOfStudents; i++) {
            char grade;
            if (scores[i] >= best - 10)
                grade = 'A';
            else if (scores[i] >= best - 20)
                grade = 'B';
            else if (scores[i] >= best - 30)
                grade = 'C';
            else if (scores[i] >= best - 40)
                grade = 'D';
            else
                grade = 'F';

            System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grade);
        }

        input.close();
    }
}
