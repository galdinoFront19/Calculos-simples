package lista2;
import java.util.Scanner;
public class Salario {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float sal;
		System.out.print("Digite seu salário: ");
		sal = in.nextFloat();
		if (sal<954) {
			System.out.println("Salário menor que o Salário Minimo");
		}else {
			System.out.println("Salário maior que o Salário Mínimo");
		}
		in.close();
	}

}
