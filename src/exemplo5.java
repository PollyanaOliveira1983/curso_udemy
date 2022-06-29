
public class exemplo5 {

	public static void main(String[] args) {
		
		double a;
		int b;
		
		a = 5.0;
		//É necessário quando o compilador não é capaz de “adivinhar” que o
		//resultado de uma expressão deve ser de outro tipo.
		b = (int)a;
		
		System.out.println(b);
	}

}
