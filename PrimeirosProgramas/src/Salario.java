package lista2;
import java.util.Scanner;
public class Salario {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float sal;
		System.out.print("Digite seu sal�rio: ");
		sal = in.nextFloat();
		if (sal<954) {
			System.out.println("Sal�rio menor que o Sal�rio Minimo");
		}else {
			System.out.println("Sal�rio maior que o Sal�rio M�nimo");
		}
		in.close();
	}

}
