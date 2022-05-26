
public class Mouse {
	private boolean funciona;
	private int qtoBotoes;
	private String tamaho;
	
	
	
	
	public Mouse(boolean funciona, int qtoBotoes, String tamaho) {
		super();
		this.funciona = funciona;
		this.qtoBotoes = qtoBotoes;
		this.tamaho = tamaho;
	}
	
	
	@Override
	public String toString() {
		return "Mouse [funciona=" + funciona + ", qtoBotoes=" + qtoBotoes + ", tamaho=" + tamaho + "]";
	}


	public boolean isFunciona() {
		return funciona;
	}
	public void setFunciona(boolean funciona) {
		this.funciona = funciona;
	}
	public int getQtoBotoes() {
		return qtoBotoes;
	}
	public void setQtoBotoes(int qtoBotoes) {
		this.qtoBotoes = qtoBotoes;
	}
	public String getTamaho() {
		return tamaho;
	}
	public void setTamaho(String tamaho) {
		this.tamaho = tamaho;
	}
	
	
	

}
