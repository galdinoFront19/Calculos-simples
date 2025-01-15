import java.util.Scanner;

public class ProgramaNumeros {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int a,b,r;
		
		System.out.println("Entre com o Primeiro Valor:");
		a = entrada.nextInt();
		
		System.out.println("entre com o Segundo Valor:");
		b = entrada.nextInt();
		
		r = a+b;
		System.out.println("/nTotal de "+a+" + "+b+" = "+r);
	}

}
