//finding the minimum number
import java.util.Scanner;
public class Exercise_4 {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int marks[]= new int[5];

    for(int i =0; i < marks.length; i++){
        System.out.print("Enter the mark [" + (i+1) + "] : ");
        marks[i] = input.nextInt();
    }
        int min = marks[0];
        for(int i =1 ; i<marks.length; i++){
            if(marks[i]<min){
                min = marks[i];
            }
        }
       System.out.println("Minimum value is : " + min);
    
    
    
   } 
}
