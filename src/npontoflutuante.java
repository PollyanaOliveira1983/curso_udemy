import java.util.Scanner;

public class npontoflutuante {

	public static void main(String[] args) {
		// sc.nextDouble()
		
		Scanner sc = new Scanner(System.in);
		
		double x;
		x = sc.nextDouble();
		//System.out.println("Voce digitou: " + x);
		System.out.printf("Voce digitou: " + "%.2f%n", x);
		
		sc.close();		
	}

}
