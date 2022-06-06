import java.util.Scanner;

public class calcular {

	public static void main(String[] args) {
	
		Scanner scanner =  new Scanner(System.in);//scanner, usado para entrar informações/dados do usuário 
		
		  CalcularArea calculararea=  new CalcularArea(); //instanciando/criando objeto
		  
		  System.out.println("Somar dois Números");//printar o que vai aparecer na tela (mensagem)
		  System.out.println("Digite o primeiro número");//printar o que vai aparecer na tela (mensagem)
		  int x = scanner.nextInt();//determinando conforme digitado pelo usuario, o valor de x
		  
		  System.out.println("Digite o segundo número");//printar o que vai aparecer na tela (mensagem)
		  int y = scanner.nextInt();//determinando conforme digitado pelo usuario, o valor de y
		  
		  int soma = matematica.somar(x, y);//conforme determinado os valores de x e y pelo usuario, o comando matematica.somar vai executar a ação(Ssomar)
		  System.out.println("o resultado é " + soma + "!!");
		  
		   soma = matematica.somar(x, y, 5);
		  System.out.println("o resultado é " + soma + "!!");
		  
		  double soma2 = matematica.somar(3.5, 4.2);
		  System.out.println("o resultado é " + soma2 + "!!");
		  
	  
	}

}
