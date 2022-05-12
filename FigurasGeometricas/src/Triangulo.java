
public class Triangulo implements AreaCalculavel {
	
	double base;
	double altura;
	
	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
		
	}
	@Override
	public void calcularArea() {
		System.out.println( "O Valor é " + base*altura);
		
	}
	
	
	
	
	
	
	
	
	
	

}
