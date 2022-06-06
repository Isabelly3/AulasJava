import java.util.Scanner;

public class CalculadoraTop {

	public static void main(String[] args) {
		int n1; //determinando o tipo de variavel do atributo e seu valor
		int n2; //determinando o tipo de variavel do atributo e seu valor
		
		String op = "";//determinando o tipo de variavel do atributo e seu valor
		int control= 0;//determinando o tipo de variavel do atributo e seu valor
		
		Scanner entrada = new Scanner(System.in); //criando scanner //scanner, usado para entrar informações/dados do usuário
		System.out.println("Digite a operação desejada (+, -, *, /):"); //printar o que vai aparecer na tela
		op = entrada.nextLine(); 
		
		System.out.println("Digite um valor:");//printar o que vai aparecer na tela
		n1 = Integer.parseInt(entrada.nextLine());
		//passar para inteiro oq receber 
		
		System.out.println("Digite o segundo valor");
		n2 = Integer.parseInt(entrada.nextLine());
		//passar para inteiro oq receber 
		
		//SE o usuario escolher"+"
		if(op.equals("+")) {
			System.out.println("O resultado da soma é: " + (n1+n2)); //fazer esse calculo
			control++;
		}
		//SE o usuario escolher"-"	
		if(op.equals("-")) {
			System.out.println("O resultado da subtração é:" + (n1-n2));//fazer esse calculo
			control++;
		}
	
		//SE o usuario escolher"*"	
		if(op.equals("*")) {
			System.out.println("O resultado da multiplicação é:" + (n1*n2));//fazer esse calculo
			control++;
		}
		//SE o usuario escolher"/"	
		if(op.equals("/")) {
			System.out.println("O resultado da divisão é:" + (n1/n2));//fazer esse calculo
			control++;
		}
		//SE for diferente ou igual a 0 
		if(control == 0) {
			System.out.println("Operação inválida, Tente Novamente!");//aparecer essa mensagem na tela
		
		}
			
		

		
	}

}
