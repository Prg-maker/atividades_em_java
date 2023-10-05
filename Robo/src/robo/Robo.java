package robo;

public class Robo {
	private String modelo;
	private String cor;
	private int ano;
	private String nSerie;
	private boolean ligado;
	private float direcao;
	private float velocidade;
	
	public Robo() {
		modelo = "novo";
		cor = "azul";
		ano = 2;
	}
	public void ligar() {
		ligado = true;
		velocidade = 0 ;
		
	}
	public void andar() {
		velocidade = 2;
	}
	
	public void parar() {
		velocidade = 0;
	}
	public void virar() {
		direcao++;
		if(direcao >= 360)
			direcao =0;	
	}
	
	public void virar(int quantidade) {
		direcao+= quantidade;
		
		if(direcao >= 360) {
			direcao=0;
			direcao+= quantidade;
		}
		
		
	}
	
	public String toString () {
		
		return " ligado  " + ligado
		
		+ "  velocidade =  " + velocidade
	
		+ "  direcao  = " + direcao ;
		
	}
	
	public String toStringRobo() {
	
		String res = " modelo " + modelo  + " cor " + cor + " ano " + ano + " direcao " +  direcao + " velocidade " + velocidade;
		return res;
	}
	
	

}
