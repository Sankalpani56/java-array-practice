import java.util.Scanner;
public class Exercise_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	
		int max = 0;
		int index =0;
        String BookID[] = new String[3];
		String title[] = new String[3];
		int count[] = new int[3];
		
		for(int i=0; i<3; i++){
			System.out.print("Enter the bookID : ");
			BookID[i] = input.nextLine();
			
			System.out.print("Enter the name of the book : ");
			title[i] = input.nextLine();
			
			System.out.print("Enter the number of readers : ");
			count[i] = input.nextInt();
			
			input.nextLine();
			System.out.println(" ");
			
			if(count[i]>max){
				max = count[i];
				index =i;
			}
		}
		System.out.println("Name of the book : " + title[index]);
		System.out.println("Number of readers : " + max);
    }
}
