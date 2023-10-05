package conta;

import java.util.ArrayList;

public class Controle {
	
	private String id;
	private ContadeLuz contas[];
	private int qnt_contas;
	
	
	public void Controle() {
		 contas = new ContadeLuz[120];
		
		 qnt_contas = 0;
	}
	
	public boolean addNewConta(ContadeLuz c) {
		
		boolean isNew = qnt_contas < 120? 	true : false;
	
		if(isNew) {
			
			contas[qnt_contas] = c;
			qnt_contas++;
		}
		
		return isNew;
	}
	
	public double calcularMediadasContas() {
		double sum = 0;
	
		if(contas.length!=0) {
			for(int i=0; i<= qnt_contas ; i++ ) {
				sum += contas[i].getValor();
			}
			
			return sum /qnt_contas;
		}
		return 0;
	}
	
	public double verificarMenorConsumo() {
	
		// try - catch
		if(contas.length!=0) {
			double min = contas[0].getValor();
			
			for(int i =0;i<qnt_contas;i++) {
				min = Math.min(min, contas[i].getValor());
			}
			
			return min;
		}
		return 0;
	}
	
	public double verificarMaiorConsumo() {
		
		// try - catch
		if(contas.length!=0) {
			double max = contas[0].getValor();
			
			for(int i =0;i<qnt_contas;i++) {
				max = Math.max(max, contas[i].getValor());
			}
			
			return max;
		}
		return 0;
	}
}
