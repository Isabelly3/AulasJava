
public class Executa 
{
	public static void main(String[] args)
	{
		Relogio r1= new Relogio();
		
		r1.acertarRelogio(3,30,50);
		
		System.out.println("Posição da Hora: "+r1.pHora.posicao);
		System.out.println("Posição do Minuto: "+r1.pMin.posicao);
		System.out.println("Posição do Segundo: "+r1.pSeg.posicao);
		
		int hora=r1.lerHora(),min=r1.lerMin(),seg=r1.lerSeg();
		
		System.out.println("Hora: "+hora);
		System.out.println("Minuto: "+min);
		System.out.println("Segundo: "+seg);
		
		Relogio r2= new Relogio();
		
		r2.acertarRelogio(22,0,0);
		r1=r2;
		System.out.println(r1.lerHora());
		System.out.println(r1.lerMin());
		
	}
}
