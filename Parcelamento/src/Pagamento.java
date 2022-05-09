import java.util.*;
public class Pagamento 
{
	public int menu2,z=0,office,d,m,a;
	public double pagar,valor,valor1,valor2;
	Scanner scan= new Scanner(System.in);
	
	public void pagar()
	{
		while(z!=1)
		{
			valor=0;
			valor1=0;
			valor2=0;
			System.out.println("");
			System.out.println("Informe o dia do hoje:");
			d=scan.nextInt();
			System.out.println("Informe o mês atual:");
			m=scan.nextInt();
			System.out.println("Informe o o ano atual:");
			a=scan.nextInt();
			System.out.println("");
			System.out.println("ESCOLHA O CURSO DESEJADO:");
			System.out.println("[1] PARA PACOTE OFFICE COMPLETO");
			System.out.println("[2] PARA OPERADOR DE EMPILHADEIRA");
			System.out.println("[3] PARA METALMECÂNICA");
			System.out.println("[4] PARA ELETROELETRÔNICA");
			System.out.println("[5] PARA VOLTAR AO MENU INICIAL");
			menu2=scan.nextInt();
			
			
				switch(menu2)
				{
				case 1:
				{
						
						System.out.println("Deseja pagar à vista ou parcelado?");
						System.out.println("[1] PARA À VISTA");
						System.out.println("[2] PARA PARCELADO");
						office=scan.nextInt();
						switch(office)
						{
							case 1:
							{
								valor=1600 - (1600/10);
								System.out.println("O valor total é de: R$"+valor);
								z=1;
								
								break;
							}
							case 2:
							{
								valor1=1600/6;
								System.out.println("A data limite para pagamento é dia 25/01/2022");
								System.out.println();
								
								if((d>25 && m==1 && a==2022) || (m>1 && a>=2022) || (a>2022))
								{
									System.out.println("Pagamento atrasado! Juros foram adicionados!");
									valor2=1600 + 80;
									System.out.println("O valor total é de: R$"+valor2);
									z=1;
								}
								else
								{
									System.out.println("O valor total é de: R$"+valor1 + " em 6X");
									z=1;
								}
								break;
							}
					}
				break;
				}
				case 2:
				{
					
					System.out.println("Deseja pagar à vista ou parcelado?");
					System.out.println("[1] PARA À VISTA");
					System.out.println("[2] PARA PARCELADO");
					office=scan.nextInt();
					switch(office)
					{
						case 1:
						{
							valor=1800 - (1800/10);
							System.out.println("O valor total é de: R$"+valor);
							z=1;
							
							break;
						}
						case 2:
						{
							valor1=1800/6;
							System.out.println("A data limite para pagamento é dia 28/01/2022");
							System.out.println();
							
							if((d>28 && m==1 && a==2022) || (m>1 && a>=2022) || (a>2022))
							{
								System.out.println("Pagamento atrasado! Juros foram adicionados!");
								valor2=1800 + 90;
								System.out.println("O valor total é de: R$"+valor2);	
								z=1;
							}
							else
							{
								System.out.println("O valor total é de: R$"+valor1 + " em 6X");
								z=1;
							}
							break;
						}
				}
					break;
				}
				case 3:
				{
					System.out.println("Deseja pagar à vista ou parcelado?");
					System.out.println("[1] PARA À VISTA");
					System.out.println("[2] PARA PARCELADO");
					office=scan.nextInt();
					switch(office)
					{
						case 1:
						{
							valor=3000 - (3000/20);
							System.out.println("O valor total é de: R$"+valor);
							z=1;
							
							break;
						}
						case 2:
						{
							valor1=3000/12;
							System.out.println("A data limite para pagamento é dia 25/01/2022");
							System.out.println();
							
							if((d>25 && m==1 && a==2022) || (m>1 && a>=2022) || (a>2022))
							{
								System.out.println("Pagamento atrasado! Juros foram adicionados!");
								valor2=3000 + 180;
								System.out.println("O valor total é de: R$"+valor2);
								z=1;
							}
							else
							{
								System.out.println("O valor total é de: R$"+valor1 + " em 12X");
								z=1;
							}
							break;
						}
				}
			break;
				}
				case 4:
				{
					System.out.println("Deseja pagar à vista ou parcelado?");
					System.out.println("[1] PARA À VISTA");
					System.out.println("[2] PARA PARCELADO");
					office=scan.nextInt();
					switch(office)
					{
						case 1:
						{
							valor=2500 - (2500/20);
							System.out.println("O valor total é de: R$"+valor);
							z=1;
							
							break;
						}
						case 2:
						{
							valor1=2500/12;
							System.out.println("A data limite para pagamento é dia 25/01/2022");
							System.out.println();
							
							if((d>25 && m==1 && a==2022) || (m>1 && a>=2022) || (a>2022))
							{
								System.out.println("Pagamento atrasado! Juros foram adicionados!");
								valor2=2500+150;
								System.out.println("O valor total é de: R$"+valor2);
								z=1;
							}
							else
							{
								System.out.println("O valor total é de: R$"+valor1 + " em 12X");
								z=1;
							}
							break;
						}
				}
			break;
				}
				case 5:
				{
					z=1;
					System.out.println("Voltando Ao Menu...");
				}
				}
		}
		
		
		
	}
}
