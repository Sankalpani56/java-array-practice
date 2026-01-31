import java.util.Scanner;
public class Exercise_9{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int fib[] = new int[10];
		
		fib[0] = 0;
		fib[1] = 1;
		
		for(int i=2; i<10; i++){
			fib[i] = fib[i-1] + fib[i-2];
		}
		System.out.println("Fibonacci Series:");
		for(int i=0; i<10; i++){
			System.out.print(fib[i]+ " ");
		}	
	}
}