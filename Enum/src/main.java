
public class main {
	
	//criando constante
	public static final double PI =  3.14;
	
	//criando enum na classe
	
	 private enum Sexo{
		 MASCULINO, FEMININO
	 }
	 
	

	public static void main(String[] args) {
		
		double pi = main.PI;
		DiaDaSemana hoje = DiaDaSemana.Segunda;
		
		int num = DiaDaSemana.Segunda.getNum();
		System.out.println(num);
		
		String s = "Terca";
		
		hoje = DiaDaSemana.valueOf(s);
		
		
		System.out.println(hoje.getNum());
		
		Sexo sexo = Sexo.FEMININO;
		sexo = sexo.MASCULINO;
	}
	

}
