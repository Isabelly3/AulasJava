
public class Carro  extends Veiculo {
	//extends puxa heran�a
	private boolean quatroPortas;

	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("Tem 4 portas: " + quatroPortas);
	}

	public boolean isQuatroPortas() {
		return quatroPortas;
	}

	public void setQuatroPortas(boolean quatroPortas) {
		this.quatroPortas = quatroPortas;
	}
	
	

}
