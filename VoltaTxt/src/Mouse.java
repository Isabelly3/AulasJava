
public class Mouse {

	
	private String funciona;
	private String qtdBotoes;
	private String tamanho;


	public Mouse(String funciona, String qtdBotoes, String tamanho) {
		super();
		this.funciona = funciona;
		this.qtdBotoes = qtdBotoes;
		this.tamanho = tamanho;
	}
	@Override
	public String toString() {
		return "Mouse [funciona=" + funciona + ", qtdBotoes=" + qtdBotoes + ", tamanho=" + tamanho + "]";
	}
	public String isFunciona() {
		return funciona;
	}
	public void setFunciona(String funciona) {
		this.funciona = funciona;
	}
	public String getQtdBotoes() {
		return qtdBotoes;
	}
	public void setQtdBotoes(String qtdBotoes) {
		this.qtdBotoes = qtdBotoes;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
}
}