package relacionamento;

public class Tecnico extends Pessoa {
	
	protected String funcao;
	protected double salario;
	protected String data_adimisao;
	
	public boolean realizar_manutencao(Ficha FichaCadastro) {
		return true;
	}

}
