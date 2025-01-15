package lista2;
import java.util.Scanner;
public class ReconhecerNum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		
		System.out.print("Digite um numero: ");
		n = in.nextInt();
		if(n>0) {
			System.out.println("Numero Positivo");
		}else if(n==0) {
			System.out.println("Numero Neutro");
		}else {
			System.out.println("NNegativo");
		}
		in.close();
	}
}
