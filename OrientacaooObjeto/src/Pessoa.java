
public class Pessoa {
	String nome;
	int numFigurinhas;
	
	void receber (int numFigurinhas) {
		this.numFigurinhas += numFigurinhas;
				
	}
	
	boolean dar(int numFigurinhas, Pessoa pessoa) {
		//boolean retorno, forma de retornar uma msg
		if (this.numFigurinhas<numFigurinhas) {
		System.out.println("Voc� n�o tem o numero de figurinhas suficiente para realizar esta a��o ");
		//retorn = false; - mesmo metodo do acima
		
		return false; 
			
	}
		
		else {
			this.numFigurinhas -= numFigurinhas;
			pessoa.receber(numFigurinhas);
			//return = true 
			return true;
		}
		}
		
}
