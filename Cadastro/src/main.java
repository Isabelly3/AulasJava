//acessar algo que não esta na sua pasta
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {

		List < Pessoa > lista = new ArrayList < Pessoa > ();//instanciando/criando uma lista 
		Scanner teclado = new Scanner(System.in);//scanner, usado para entrar informações/dados do usuário 
		

		for (int x = 0; x < 4; x++) {//nesse caso ele "determina" o numero de cadastro
			Pessoa pessoa = new Pessoa(); //instanciando/criando objeto pessoa 
			pessoa.setEndereco(new Endereco()); //chamando metodo
			
			System.out.println("Nome completo"); //printar o que vai aparecer na tela 
			pessoa.setNome(teclado.next());//chamando metodo scanner  
			
			System.out.println("Idade"); //printar o que vai aparecer na tela
			pessoa.setIdade(teclado.nextInt());//chamando metodo scanner
			
			System.out.println();
			
			
			System.out.println("Endereço*"); //printar o que vai aparecer na tela
			
			System.out.println();//pular linha/dar um espaço
			
			System.out.println("Rua:"); //printar o que vai aparecer na tela
			pessoa.getEndereco().setRua(teclado.next());//chamando metodo scanner
			
			System.out.println("Nº"); //printar o que vai aparecer na tela
			pessoa.getEndereco().setNumero(teclado.nextInt());//chamando metodo scanner
			
			
			System.out.println("Bairro"); //printar o que vai aparecer na tela
			pessoa.getEndereco().setBairro(teclado.next());//chamando metodo scanner
			
			
			
			//assim q acabar um "cadastro" já iniciar outro em seguida
			
			lista.add(pessoa);
			System.out.println(lista);
			

		}

	}
	 //reescrevendo o metodo
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
