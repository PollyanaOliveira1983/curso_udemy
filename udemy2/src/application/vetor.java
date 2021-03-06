package application;

import java.util.Locale;
import java.util.Scanner;

import entities.vetorProduct;

public class vetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		vetorProduct[] vect = new vetorProduct[n];
		
		for(int i=0; i<vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new vetorProduct(name, price);
		}
		
		double sum = 0.0;
		for (int i=0; i<vect.length; i++) {
			sum += vect[i].getPrice();
			
		}
		
		double avg = sum / vect.length;
		
		System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);


		sc.close();

	}

}
