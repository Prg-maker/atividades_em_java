package atividade;

public class Curso {
	
	
	private String carga_horaria;
	private String conteudo;
	private double valor_pago;
	
	public Curso(String carga_horaria, String conteudo, double valor_pago) {
		super();
		this.carga_horaria = carga_horaria;
		this.conteudo = conteudo;
		this.valor_pago = valor_pago;
	}

	public boolean criar_curso() {
		return true;
	}
	

	
}
