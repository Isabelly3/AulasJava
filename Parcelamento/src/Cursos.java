import java.util.*;

public class Cursos 
{
	public int menu1,y=0;
	Scanner scan= new Scanner(System.in);
	
	
	
	public void mostrar()
	{
		while(y!=1)
		{
			System.out.println("");
			System.out.println("ESCOLHA O CURSO DESEJADO:");
			System.out.println("[1] PARA PACOTE OFFICE COMPLETO");
			System.out.println("[2] PARA OPERADOR DE EMPILHADEIRA");
			System.out.println("[3] PARA METALMEC�NICA");
			System.out.println("[4] PARA ELETROELETR�NICA");
			System.out.println("[5] PARA VOLTAR AO MENU INICIAL");
			menu1=scan.nextInt();
			
			
				switch(menu1)
				{
				case 1:
				{
					System.out.println("Pacote Office Completo R$1600,00 PARCELADO em 6 Vezes de R$266,00");
					System.out.println("� vista com 10% de desconto");
					System.out.println("Em caso de atraso, � cobrado 5% de Juros!");
					break;
				}
				case 2:
				{
					System.out.println("Operador de Empilhadeira R$1800,00 PARCELADO em 6 Vezes de R$300,00");
					System.out.println("� vista com 10% de desconto");
					System.out.println("Em caso de atraso, � cobrado 5% de Juros!");
					break;
				}
				case 3:
				{
					System.out.println("MetalMec�nica R$3000,00 PARCELADO em 12 Vezes de R$250,00");
					System.out.println("� vista com 20% de desconto");
					System.out.println("Em caso de atraso, � cobrado 6% de Juros!");
					break;
				}
				case 4:
				{
					System.out.println("EletroEletr�nica R$2500,00 PARCELADO em 12 Vezes de R$208,00");
					System.out.println("� vista com 20% de desconto");
					System.out.println("Em caso de atraso, � cobrado 6% de Juros!");
					break;
				}
				case 5:
				{
					y=1;
					System.out.println("Voltando Ao Menu...");
				}
				}
		}
		
		
		
	}
}
