import java.util.Scanner;

public class calcular {

	public static void main(String[] args) {
	
		Scanner scanner =  new Scanner(System.in);
		
		  CalcularArea calculararea=  new CalcularArea();
		  
		  System.out.println("Somar dois N�meros");
		  System.out.println("Digite o primeiro n�mero");
		  int x = scanner.nextInt();
		  
		  System.out.println("Digite o segundo n�mero");
		  int y = scanner.nextInt();
		  
		  int soma = matematica.somar(x, y);
		  System.out.println("o resultado � " + soma + "!!");
		  
		   soma = matematica.somar(x, y, 5);
		  System.out.println("o resultado � " + soma + "!!");
		  
		  double soma2 = matematica.somar(3.5, 4.2);
		  System.out.println("o resultado � " + soma2 + "!!");
		  
	  
	}

}
