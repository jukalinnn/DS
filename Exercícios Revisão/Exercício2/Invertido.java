import java.util.Scanner;
public class Invertido {

	    public static void main(String args[]) {
	    	
	    	Scanner in = new Scanner (System.in);
	    	System.out.println("Digite o n�mero a ser invertido: ");
			int numero = in.nextInt();

			inverte (numero);
			
		}
		
		
		private static void inverte(int numero){
			
	        int i = 0;

	        while (numero > 0) {
	            i = i *10;
	            i = i + (numero % 10);
	            numero = numero / 10;
			}
			System.out.println("O n�meno invertido �:"+i);
	    }
	}

