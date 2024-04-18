import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Primeiro numero:");
		double x = sc.nextDouble(); 
		System.out.println("Segundo numero:");
		double y = sc.nextDouble();
		System.out.println("Operacao (+ ,- , *, / ):");
		String operator = sc.next();

		System.out.print("Resultado: ");
		double result =0.0;
				
		if(operator.equals("+")) {
			result = sum(x,y);
		}
		System.out.println(result);
	}
	
	public static double sum(double x, double y) {
		return x+y;
	}

}
