
public class Pessoa {
	String nome;
	int numFigurinhas;
	
	void receber (int numFigurinhas) {
		this.numFigurinhas += numFigurinhas;
				
	}
	
	boolean dar(int numFigurinhas, Pessoa pessoa) {
		
		if (this.numFigurinhas<numFigurinhas) {
			System.out.println("Você não tem o numero de figurinhas suficiente para realizar esta ação ");
			//retorno falso
		
		return false; 
			
	}
		
		else {
			this.numFigurinhas -= numFigurinhas;
			pessoa.receber(numFigurinhas);
			
			
			return true;
		}
		//retorno verdadeiro 
		}
		
}
