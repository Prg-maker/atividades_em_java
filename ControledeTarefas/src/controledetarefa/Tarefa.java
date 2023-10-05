package controledetarefa;

public class Tarefa {
	private byte prioridade = 0, percentual;
	private String nome, data_end, detalhe;
	private boolean complete = false;
	
	public Tarefa(byte prioridade, byte percentual, String nome, String data_end, String detalhe){
		this.prioridade = prioridade;
		this.percentual = percentual;
		this.nome = nome;
		this.data_end = data_end;
		this.detalhe = detalhe;
	}
		
	private void Toggle() {
		if(percentual == 100)complete = true;
	}
	
	
	
	
	
	
	

}
