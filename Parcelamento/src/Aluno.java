import java.util.*;

public class Aluno 
{
	
	Scanner scan= new Scanner(System.in);
	public String nome[] = new String[5];
	public String cpf[] = new String[5];
	public String ra[] = new String[5];
	public String dataNasc[] = new String[5];
	public int i=0;
	public int b;

	

	public void cadastro()
	{
			
				System.out.println("Digite seu Nome:");
				nome[i]=scan.next();
				System.out.println("Digite seu CPF:");
				cpf[i]=scan.next();
				System.out.println("Digite seu RA:");
				ra[i]=scan.next();
				System.out.println("Digite sua Data De Nascimento:");
				dataNasc[i]=scan.next();
			
				i++;
		
	}
	
	public void excluir()
	{
		System.out.println();
		System.out.println("0º ----"+ nome[0] );
		System.out.println("1º ----"+ nome[1] );
		System.out.println("2º ----"+ nome[2] );
		System.out.println("3º ----"+ nome[3] );
		System.out.println("4º ----"+ nome[4] );
		System.out.println();
		System.out.println("Qual é o número Do Cadastro Que Deseja Excluir?");
		b=scan.nextInt();
		
		if(b==1) 
		{
			nome[1]="";
			cpf[1]="";
			ra[1]="";
			dataNasc[1]="";	
			System.out.println("Cadastro Excluído!");
		}
		else if(b==2) 
		{
			nome[2]="";
			cpf[2]="";
			ra[2]="";
			dataNasc[2]="";	
			System.out.println("Cadastro Excluído!");
		}
		else if(b==3) 
		{
			nome[3]="";
			cpf[3]="";
			ra[3]="";
			dataNasc[3]="";	
			System.out.println("Cadastro Excluído!");
		}
		else if(b==4) 
		{
			nome[4]="";
			cpf[4]="";
			ra[4]="";
			dataNasc[4]="";	
			System.out.println("Cadastro Excluído!");
		}
		else if(b==0) 
		{
			nome[0]="";
			cpf[0]="";
			ra[0]="";
			dataNasc[0]="";	
			System.out.println("Cadastro Excluído!");
		}
		
		
		
	}
	
	
	
	
	
	
}
