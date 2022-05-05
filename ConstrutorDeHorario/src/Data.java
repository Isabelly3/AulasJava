
public class Data {
	public  static final int FORMATO_12H = 1;
	public static final int FORMATO_24H = 2;
	
	private int dia;
	private int mes;
	private int ano;
	private int hora;
	private int minuto = -1;
	private int segundo = -1;


	//Construtor que recebe dia, mes e ano 
	public Data(int dia, int mes, int ano) {
		this.dia =  dia;
		this.mes = mes;
		this.ano = ano;
	}
		
	//CONSTRUO COMPLETO, QUE RECEBE INFORMAÇÕES DE DATA E HORARIO
	public Data (int dia, int mes, int ano, int hora, int minuto, int segundo) {
		//CHAMA O OUTRO CONSTRUTOR DA CLASSE 
		this (dia, mes, ano);
		
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	//IMPRIME A DATA/HORA FORMATADA (DE ACORDO COM FORMATO ESPECIFICADO)
	public void imprimir (int formato) {
		//MONTA A STRING DE IMPRESSÃO DE DATA 
		String data = dia + "/" + mes + "/" + ano;
		
		if (hora == -1) {
			//SE HORA FOR  -1, SIGNIFICA QUE OS DADOS NÃO FORAM PASSADOS NO CONSTRUTOR
			//ENTÃO EXIBE SÓ A DATA 
			System.out.println(data);
			
		}else {
			//MONTA PARTE DA STRING DA HORARIO  (DEIXA DE FORA POR ENQUANTO)
			String horario = ":" + minuto + ":" + segundo;
			
			if (formato == FORMATO_24h) {
				//se o formato for 24h, concatena a hora no inicio da string(o atribuido ja foi forecido no formato 24h)
			    horario = hora + horario;
			}else {
				// Se o formato for 12h
				if (hora == 0) {
					horario = 12 + horario;
					horario += " AM";
				} else if (hora >= 12) {
					// Se hora for maior ou igual a 12, é preciso subtrair 12 da hora para obter 
					// a hora no formato 12h, e concatena o "PM" no fim
					horario = (hora - 12) + horario;
					horario += " PM";
				
				} else {
					// Se a hora for menor que 12, simplesmente utiliza a própria hora e concatena
					// o "AM" no fim
					horario = hora + horario;
					horario += " AM";
				}
			}

			// Imprime a data/hora formatada
			System.out.println(data + " " + horario);
		}
	}

	// Métodos getters
	
	public int getDia() {
		return dia;
	
				}
			}
		
		
				
			
			
			
		
	
	
	
