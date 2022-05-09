import java.util.*;
public class Executar 
{
	public static void main(String[] args)
	{
		int menu,i=0,j=0;
		menu=0;
		Scanner scan= new Scanner(System.in);
		Aluno a1= new Aluno();
		
		while(j!=1)
		{
			System.out.println("BEM VINDO AO SENAI-SP.");
			System.out.println("[1] PARA CADASTRAR ALUNO.");
			System.out.println("[2] PARA REMOVER CADASTRO.");
			System.out.println("[3] PARA GERAR INFORMACOES SOBRE CURSOS.");
			System.out.println("[4] PARA MOSTRAR PAGAMENTO.");
			System.out.println("[5] PARA SAIR.");
			System.out.println("");
			menu=scan.nextInt();
			switch(menu)
			{
			case 1:
			{
				
				a1.cadastro();
				System.out.println("CADASTRO REALIZADO!");
				System.out.println("");
				break;
			}
			case 2:
			{
				
				a1.excluir();
				break;
				
			}
			case 3:
			{
				Cursos a3= new Cursos();
				a3.mostrar();
				break;
				
			}
			case 4:
			{
				Pagamento a4= new Pagamento();
				a4.pagar();
				break;
			}
			case 5:
			{
				j=1;
				System.out.println("Obrigado e Volte Sempre!");
			}
		}
		
		
	
		
		
		
		}scan.close();
	}	
}
