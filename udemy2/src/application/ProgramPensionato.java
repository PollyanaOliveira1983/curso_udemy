package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pensionato;

public class ProgramPensionato {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Pensionato[] vect = new Pensionato[10];
		
		System.out.print("Quantos quartos vão ser alugados? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Alugado #" + i + ":");
			System.out.print("Nome: ");
			sc.nextLine();					
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			vect[quarto] = new Pensionato(nome, email);
			}
			System.out.println();
			System.out.println("Quartos ocupados:");
			for (int i=0; i<10; i++) {
			if (vect[i] != null) {
			System.out.println(i + ": " + vect[i]);
			
			}
		
		}
		
		sc.close();
	}

}
