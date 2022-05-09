
public class Relogio 
{
	Ponteiro pHora = new Ponteiro();
	Ponteiro pMin=new Ponteiro();
	Ponteiro pSeg=new Ponteiro();
	
	
	void acertarRelogio(int hora, int min, int seg)
	{
		hora=hora%12;
		
		pHora.posicao=hora;
		pMin.posicao=min/5;
		pSeg.posicao=seg/5;
	}
	
	int lerHora()
	{
		return pHora.posicao;	
	}
	
	int lerMin()
	{
		return pMin.posicao * 5;	
	}
	
	int lerSeg()
	{
		return pSeg.posicao * 5;	
	}
}
