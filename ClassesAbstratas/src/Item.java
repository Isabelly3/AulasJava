
public abstract class Item {
	
	private int posX;
	private int posY;
	
	
	//ações necessarias 
	public abstract void pegar() ;
		
		
	//retorna valor  --get 	
	//((retornando o valor(string) colocando atributo(numero)) -set

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

}
