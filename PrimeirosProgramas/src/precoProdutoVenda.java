import java.util.Scanner;
public class precoProdutoVenda {
	public class produto {
		public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

			double p, ml, total, venda, sn;
			int i=1;
			
			do {
				System.out.println("Digite o pre�o do produto:");
				p = in.nextDouble();
				
				System.out.println("Digite a margem de lucro do produto em %:");
				ml = in.nextDouble();
				
				total = (p*ml) / 100;
		
	            venda = total*p;
				
	            System.out.println("O pre�o da venda � de R$: "+venda);

				System.out.println("Deseja continuar o programa? 1 para S e 2 para N");
				sn = in.nextDouble();
				
				
				}while (sn = 1);
			}
		}
	}

