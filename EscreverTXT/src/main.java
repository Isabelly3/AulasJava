import java.io.BufferedWriter;
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
		
		
		
		
		
		List < Mouse > listaMouse = new ArrayList < Mouse > ();
				
		Mouse mouse1 = new Mouse (true, 3, "pequeno");
		
		Mouse mouse2 = new Mouse (true, 4, "pequeno");
		
		Mouse mouse3 = new Mouse (true, 3, "pequeno");
		
		
		listaMouse.add(mouse1);
		listaMouse.add(mouse2);
		listaMouse.add(mouse3);
		
		  try (BufferedWriter escrever =  new BufferedWriter(new FileWriter("saida.txt"))){
			  
			  for(Mouse mouse : listaMouse)
			  escrever.write(mouse.toString());
			  
			  
			  
			
			  
		
		
		
		}
	}
}


