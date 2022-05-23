
public enum DiaDaSemana {
	Domingo(1),
	Segunda(2),
	Terca(3),
	Quarta(4),
	Quinta(5),
	Sexta(6),
	Sabado(7);
	
	private int num;

	
	public int getNum() {
		return num;
	}
	
	private DiaDaSemana(int num) {
		this.num = num;
	}
	
	

}
