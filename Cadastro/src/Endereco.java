
public class Endereco {
	private  String Rua;//determinando o tipo de variavel do objeto e seu valor
	private int Numero;//determinando o tipo de variavel do objeto e seu valor
	private String Bairro;//determinando o tipo de variavel do objeto e seu valor
	
	
	
	
	
	
	
	public String getRua() {
		return Rua; //retorna valor (rua)
	}




	public void setRua(String rua) {
		Rua = rua; //((retornando o valor(string) colocando atributo(rua))
	}



	

	public int getNumero() {
		return Numero;//retorna valor (numero)
	}




	public void setNumero(int numero) {
		Numero = numero;((retornando o valor(string) colocando atributo(numero))
	}







	public String getBairro() {
		return Bairro;retorna valor (bairro)
	}




	public void setBairro(String bairro) {
		Bairro = bairro;((retornando o valor(string) colocando atributo(bairro))
	}




	@Override
	public String toString() {
	
		return "Endereço [Rua=" + Rua + ", Numero=" + Numero + "]"; //reescrevendo o metodo
	
	
	

	}
}
	
	

