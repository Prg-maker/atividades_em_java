package tarefas;

public class Tarefas {
	private int prioridade;
	private String nome;
	private String data_limit;
	private byte percentual;
	private String detalhes;
	
	
	public Tarefas(int prioridade, String nome, String data_limit, byte percentual) {
		this.prioridade = prioridade;
		this.nome = nome;
		this.data_limit = data_limit;
		this.percentual = percentual;
		
	}
	
	public String ToStringPrioridade() {
		String response="Prioridade Baixa";
		
		if(prioridade <= 5 && prioridade > 8) {
			response = "Prioridade Média";
		}else if(prioridade <=8) {
			response = "Prioridade Alta";
		}
		return response;
		
	}
	public void setPercentual(int x) {
		if(x==0 ) percentual++;
		
		else if(percentual+x <100 ){
			percentual+= x;
		}
		
		
	}
	
	
}
