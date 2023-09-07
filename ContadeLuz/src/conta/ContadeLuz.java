package conta;

public class ContadeLuz {
	// atributos: dt_leitura, qnt_KW, valor, dt_pagamento;
	
	private String dt_leitura, dt_pagamento;
	private double qnt_kw , valor;
	

	public ContadeLuz(String dt_leitura, String dt_pagamento, double qnt_kw, double valor) {
		super();
		this.dt_leitura = dt_leitura;
		this.dt_pagamento = dt_pagamento;
		this.qnt_kw = qnt_kw;
		this.valor = valor;
	}
	
	public double getValor() {
		return valor;
	}
	public double getQnt_kw() {
		return qnt_kw;
	}
	
	public String getDt_leirtura() {
		return dt_leitura;
	}
	public String getDt_pagamento() {
		return dt_pagamento;
	}
}
