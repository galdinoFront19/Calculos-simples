package lista2;
import java.util.Scanner;
public class TempConvertida {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double f, c;
		
		System.out.println("Escreve uma temperatura em Fahrenheit: ");
		f = in.nextFloat();
		c = (f-32) * 0.5555555;
		
		if (c<15) {
			System.out.printf("Está Frio, no momento faz: %.2f", c);
			System.out.print("℃");
		}else if(c<22){
			System.out.printf("Está Ameno, no momento faz: %.2f", c);
			System.out.print("℃");
		}else {
			System.out.printf("Está Calor, no momento faz: %.2f", c);
			System.out.print("℃");
		}
		in.close();
	}
}
