import java.util.Scanner;

public class entrada {

	public static void main(String[] args) {
		//Para fazer entrada de dados, nós vamos criar um objeto do tipo
		//"Scanner" da seguinte forma:
		
		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next();
		System.out.println("Voce digitou: " + x);
		
		sc.close();		
	}

}
