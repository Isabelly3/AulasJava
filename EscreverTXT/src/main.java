import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class main {

	public static void main(String[] args) throws IOException {
		
		
		String s = "texto para ser gravado no arquivo";
		try (BufferedWriter escrever = new BufferedWriter(new FileWriter("Saída.txt"))){
		escrever.write(s);

	}

}
}
