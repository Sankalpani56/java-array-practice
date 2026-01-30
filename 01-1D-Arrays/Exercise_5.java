//Even number count and odd number count
import java.util.Scanner;
public class Exercise_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int even =0;
        int odd=0;

        int marks[]= new int[5];

        for(int i = 0; i < marks.length; i++){
            System.out.print("Enter the marks [" + (i+1)+  "] :");
            marks[i] = input.nextInt();
        

        if  (marks[i] %2==0){
            even++;
        }else{
            odd++;
        }
    }
        System.out.println("even number count : " + even);
        System.out.println("Odd numbe count : " + odd);
    }
}
