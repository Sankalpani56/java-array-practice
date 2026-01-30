//finding the maximum number
import java.util.Scanner;
public class Exercise_3 {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int marks[]= new int[5];

    for(int i =0; i < marks.length; i++){
        System.out.print("Enter the mark [" + (i+1) + "] : ");
        marks[i] = input.nextInt();
    }
        int max = marks[0];
        for(int i =1 ; i<marks.length; i++){
            if(marks[i]>max){
                max = marks[i];
            }
        }
       System.out.println("Maximum value is : " + max);
    
    
    
   } 
}

