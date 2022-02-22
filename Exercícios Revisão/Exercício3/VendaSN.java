
	import java.util.Scanner;
	public class VendaSN {
		
		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			float preco, por, venda;
			String cont="S";
			
			while (! cont.equals("N")) {
				System.out.println("Digite o preço do produto:");
				preco = input.nextFloat();
				
				System.out.println("Digite a margem de lucro do produto :");
				por = input.nextFloat();
				por = por/100*preco;
				venda = preco+por;
				
				System.out.println("Valor da venda deste produto é: " +venda);
				System.out.println("Deseja continuar a execução? (S/N)?");
				cont = input.next();
			}
		
		}
	}