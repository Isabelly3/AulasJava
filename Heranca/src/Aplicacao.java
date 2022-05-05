
public class Aplicacao {

	public static void main(String[] args) {
		
		Veiculo veiculo = new  Veiculo();
		
		veiculo.setMarca("Honda");
		veiculo.setModelo("Civic");
		veiculo.setAno(2015);
		
		veiculo.imprimir();
		veiculo.buzinar();
		
		Carro carro = new Carro ();
		
		carro.setMarca("Range Rover");
		carro.setModelo("Velar");
		carro.setAno(2022);
		carro.setQuatroPortas(true);
		
		System.out.println();
		
		 carro.imprimir();
		 carro.buzinar();
		 
		 
		 Caminhao caminhao = new Caminhao();
		 
		 caminhao.setMarca("SCANIA");
			caminhao.setModelo("P310");
			caminhao.setAno(2022);
			
			
			System.out.println();
			
			 caminhao.imprimir();
			 caminhao.buzinar();
		 
			 Moto moto = new Moto();
			 
			 moto.setMarca("Honda");
			 moto.setModelo("XRE");
			 moto.setAno(2016);
				
				
				System.out.println();
				
				 moto.imprimir();
				 moto.empinar();
			 
			 
		 
		 
		

	}

}
