import java.util.Locale;
import java.util.Scanner;

public class lerCarctere {

	public static void main(String[] args) {
		// sc.next().charAt()
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char x;
		x = sc.next().charAt(0);
	
		System.out.printf("Voce digitou: " + x);
		
		sc.close();	


	}

}
