package tarefas;

public class Controle {
	private Tarefas tarefas[];
	private int contador;
	private int legth;
	
	
	public void Controle() {
		tarefas = new Tarefas[120];
		
		contador = 0;	
	}
	
	public int a() {
		System.out.println(tarefas.length);
		 return tarefas.length;
	}

	
	public static void main(String[] args) {
		Controle controle = new Controle();

		
	}
	
	
}
