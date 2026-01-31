import java.util.Scanner;
public class Exercise_10{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		double rainfall[] = new double[7];
		
		for(int i=0; i<7; i++){
			System.out.print("Enter the rainfall of Day " + (i+1) + ":");
			rainfall[i] = input.nextDouble();
			
		}
		for(int i=0; i<7; i++){
			double sum = 0;
            double max = rainfall[0];
            double min = rainfall[0];
			
			for(int j=0; j<=i; j++){
				sum += rainfall[j];
				
				if (rainfall[j]>max){
					max = rainfall[j];
				}
				if(rainfall[j]<min){
					min = rainfall[j];
				}
				
			}
			double avg = sum/(i+1);
			System.out.println((i + 1) + ". Day 1 to " + (i + 1) + ":"); 
            System.out.printf("   Average rainfall: %.2f mm\n", avg); 
            System.out.println("   Maximum rainfall: " + max + " mm"); 
            System.out.println("   Minimum rainfall: " + min + " mm"); 
            System.out.println();
		}
	}
}
