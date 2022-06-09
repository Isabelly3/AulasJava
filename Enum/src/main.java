
public class main {
	
	//criando constante
	public static final double PI =  3.14;
	
	//criando enum na classe
	
	 private enum Sexo{
		 MASCULINO, FEMININO
	 }
	 
	

	public static void main(String[] args) {
		
		double pi = main.PI;// declarando que a constante vai ser guardada en um lugar
		DiaDaSemana hoje = DiaDaSemana.Segunda;
		
		int num = DiaDaSemana.Segunda.getNum(); // guarda o dia da semana 
		System.out.println(num); //variavel num= segunda
		
		String s = "Terca"; // s = lugar onde esta a terça
		
		hoje = DiaDaSemana.valueOf(s); // vai no enum e proucura "hoje" que esta dentro do s, que nesse caso seria uma terça-feira
		
		
		System.out.println(hoje.getNum()); //mostra no console que hoje é terça
		
		Sexo sexo = Sexo.FEMININO; //determina sexo fem
		
		sexo = sexo.MASCULINO;//determina sexo masc
	}
	

}
