
public class Pessoa {
	
	private String Nome;//determinando o tipo de variavel do atributo e seu valor
	private int Idade;//determinando o tipo de variavel do atributo e seu valor
	private Endereco endereco;//determinando o tipo de variavel do atributo e seu valor
	
	
	public String getNome() {
		return Nome;//retorna valor
	}
	public void setNome(String nome) {
		Nome = nome; //((retornando o valor(string) colocando atributo(Nome))
	}
	public int getIdade() {
		return Idade;//retorna valor
	}
	
	
	
	
	public void setIdade(int idade) {
		Idade = idade; //((retornando o valor(string) colocando atributo(idade))
	}
	public Endereco getEndereco() {
		return endereco;//retorna valor
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco; //((retornando o valor(string) colocando atributo(endereço))
	}
	 
	

	

}


