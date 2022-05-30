import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class main {

		public static void main(String[] args) throws IOException {


//			 String s = "texto para ser gravado no arquivo.";
		//	
//		    try (BufferedWriter escrever =  new BufferedWriter(new FileWriter("saida.txt"))){
		//	
//			escrever.write(s);
//		    }

			List <Mouse> listaMouse = new ArrayList <Mouse> ();

			Mouse mouse1 = new Mouse("Sim", "2", "Médio");

			Mouse mouse2 = new Mouse("Não", "3", "Pequeno");

			Mouse mouse3 = new Mouse("Sim", "5", "Grande");

			

			listaMouse.add(mouse1);
			listaMouse.add(mouse2);
			listaMouse.add(mouse3);

			try(BufferedWriter escrever = new BufferedWriter(new FileWriter("saida.txt"))){
				for(Mouse mouse : listaMouse)
				escrever.write(mouse.toString());


	}
			List <Mouse> listaMouse2 = new ArrayList <Mouse> ();
			try(BufferedReader reader = new BufferedReader(new FileReader("saida.txt"))){
				String line;
				String string= "";
				
				while((line= reader.readLine()) != null) {
					string+= line + "/n";	
					listaMouse2.add(mouse1);
					
					
					
				}
			for(Mouse mousef : listaMouse2) {
				System.out.println(mousef);
			
			
		}
}
		}
}


