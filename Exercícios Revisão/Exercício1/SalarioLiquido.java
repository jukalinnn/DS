
	import java.util.Scanner;
	public class SalarioLiquido {
			public static void main(String[] args) {
				Scanner leia = new Scanner(System.in);
				float horaAula, descont, salario;
				int numAulas;
				
				System.out.println("Digite o valor da hora aula: ");
				horaAula = leia.nextFloat();
				
				System.out.println("Digite o número de aulas dadas: ");
				numAulas = leia.nextInt();
				
				System.out.println("Digite o percentual de desconto do INSS:");
				descont = leia.nextFloat();
				
				salario = horaAula*numAulas;
				salario = salario-(salario/100*descont);
				
				System.out.println(" O valor do salário líquido é de :"+salario);
				
			}
		}
