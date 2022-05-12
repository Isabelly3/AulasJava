
public class Circulo implements AreaCalculavel {
	double raio;

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public void calcularArea() {
		System.out.println("O valor é" + Math.PI * Math.pow(raio, 2));
		
	}
	
	

}
