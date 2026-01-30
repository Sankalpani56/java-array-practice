import java.util.Scanner;
public class Exercise_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int marks[] = new int[5];

        for(int i =0; i<marks.length; i++){
             
            System.out.print("Enter the marks [" + (i+1) + "] : ");
            marks[i] = input.nextInt();

              sum += marks[i];

        }
        // Find Sum
        System.out.println("The sum is : " + sum);
        
        // Find Average
        double avg = sum/marks.length;
        System.out.printf("The Average is : %.2f" ,avg);
    }
}
