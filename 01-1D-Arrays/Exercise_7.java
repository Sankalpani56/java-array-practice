import java.util.Scanner;
public class Exercise_7{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		String EmployeeID[] = new String[3];
		String name[] = new String[3];
		int exp[] = new int[3];
		double salary[] = new double[3];
		double increment[] = new double[3];
		
		for(int i=0; i<3; i++){
			System.out.print("Enter the Employee ID :");
			EmployeeID[i] = input.nextLine();
			
			System.out.print("Enter the Name :");
			name[i] = input.nextLine();
			
			System.out.print("Enter the Experience (in years) :");
			exp[i] = input.nextInt();
			
			System.out.print("Enter the Salary :");
			salary[i] = input.nextDouble(); 
			
			input.nextLine();
			System.out.println(" ");
			if(exp[i]>2){
				increment[i] = salary[i]*0.10;
			}else{
				increment[i] = 0.0;
			}
		}
		System.out.println("\n---Employee Details---");
			for(int i = 0; i<3; i++){
			System.out.println("Employee ID : " + EmployeeID[i]);
			System.out.println("Name: " + name[i]);
			System.out.println("Increment: " + increment[i]);
			}
	}
}