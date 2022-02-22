import java.util.Scanner;
public class SalarioLiquido2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numAula;
		double descont, salario;
		float horaAula;
		
		System.out.println("Digite o valor da horas aula:");
		horaAula = leia.nextFloat();
		System.out.println("Digite o número de aulas dadas: ");
		
		numAula = leia.nextInt();
		salario = horaAula*numAula;
		
		if(salario<=1212.00) {
			descont = 7.5;
		}else if(salario >=1212.01 && salario <=2427.35) {
			descont = 9;
		}else if(salario >=2427.36 && salario <=3641.03) {
			descont = 12;
		}else if(salario >=3641.04 && salario <=7087.22) {
			descont = 14;
		}else if(salario >=7087.23 && salario <=12136.79) {
			descont = 14.5;
		}else if(salario >=12136.80 && salario <=24273.57) {
			descont = 16.5;
		}else if(salario >=24273.58 && salario <=47333.46) {
			descont = 19;
		}else {
			descont= 22;
		}
		salario=salario-(salario/100*descont);
		System.out.println("O valor do sálario líquido é de: " +salario);
	
	}
}
