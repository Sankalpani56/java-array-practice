import java.util.Scanner;
public class Exercise_8{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		String productID[] = new String[4];
		String name[] = new String[4];
		double price[] = new double[4];
		int quantity[] = new int[4];
		double amount[] = new double[4];
		double total=0;
		for(int i=0; i<4; i++){
			System.out.print("Enter the Product ID : ");
			productID[i] = input.nextLine();
			
			System.out.print("Enter the Product name : ");
			name[i] = input.nextLine();
			
			System.out.print("Enter the unit price : ");
			price[i] = input.nextDouble();
			
			System.out.print("Enter the Quantity Sold : ");
			quantity[i] = input.nextInt();
			
			input.nextLine();
			System.out.println();
			
			amount[i] = price[i]*quantity[i];
			total += amount[i];
			
			
		}
		System.out.println("-----Product outline------");
		System.out.println("Product ID\tName\tAmount");
		for(int i=0; i<4; i++){
		System.out.println(productID[i] + "\t\t" + name[i] + "\t" + amount[i]);
	
		}
		System.out.println("Total : "+ total);
	}
}