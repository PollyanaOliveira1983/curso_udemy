
public class expressoes {

	public static void main(String[] args) {
		
		double delta;
		double x1;
		double x2;
		double b = -8;
		double a = 10.0 ;
		double c = -30.0 ;
		//Simplificando, NaN é um valor de tipo de dados numérico que significa “não é um número”.
		//NaN geralmente indica o resultado de operações inválidas. Por exemplo, tentar dividir zero por zero é uma dessas operações.
		
		delta = Math.pow(b, 2.0) - 4*a*c; //delta = b2 - 4ac
		System.out.println(delta);
		x1 = (-b + Math.sqrt(delta)) / (2.0 * a); //-b + √ delta / 2*a
		System.out.println(x1);
		x2 = (-b - Math.sqrt(delta)) / (2.0 * a); //-b - √ delta / 2*a
		System.out.println(x2);

	}

}
