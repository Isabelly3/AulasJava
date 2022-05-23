import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		List < Pessoa > lista = new ArrayList < Pessoa > ();
		Scanner teclado = new Scanner(System.in);
		

		for (int x = 0; x < 4; x++) {
			Pessoa pessoa = new Pessoa();
			pessoa.setEndereco(new Endereco());
			
			System.out.println("Nome completo");
			pessoa.setNome(teclado.next());
			
			System.out.println("Idade");
			pessoa.setIdade(teclado.nextInt());
			
			System.out.println();
			
			
			System.out.println("Endereço*");
			
			System.out.println();
			
			System.out.println("Rua:");
			pessoa.getEndereco().setRua(teclado.next());
			
			System.out.println("Nº");
			pessoa.getEndereco().setNumero(teclado.nextInt());
			
			
			System.out.println("Bairro");
			pessoa.getEndereco().setBairro(teclado.next());
			
			
			
		
			lista.add(pessoa);
			System.out.println(lista);
			

		}

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
