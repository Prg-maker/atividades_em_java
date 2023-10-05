package relacionamento;
import java.util.Scanner;
import java.util.ArrayList;

public class Aplicativo {
	private static Scanner input = new Scanner(System.in);
	private static int  count = 1;
	static ArrayList<Pessoa> pessoas;
	
	public static void main(String[] args) {
		pessoas = new ArrayList<Pessoa>();
		operacoes();
	}
	
	
	
	
	public static void operacoes() {
		
		
		System.out.println("ESCOLHA UMA OPERAÇÂO");
		System.out.println("__1-cadastrar uma pessoa__");
		System.out.println("__2-listar pessoas__");
		System.out.println("__3-delatar pessoa__");
		
		
		int option = input.nextInt();
		
		switch (option) {
		case 1: {
			criarConta();	
			break;
		}
		case 2:{
			listarPessoas();
			break;
		}
		case 3:{
			deletarPessoa();
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + option);
		}
		
	}
	
	public static void criarConta() {
		System.out.println("Digite seu nome: ");
		String nome = input.next();
		
		System.out.println("Digite seu cpf: ");
		String cpf = input.next();
		
		System.out.println("Digite seu rg: ");
		String rg = input.next();
		
		System.out.println("Digite seu contato: ");
		String contato = input.next();
		
		System.out.println("Digite sua residencia : ");
		String residencia = input.next();
		
		Pessoa pessoa = new Pessoa(nome, cpf, rg, contato, residencia);
		
		System.out.println("Sua Conta foi criada com sucesso");
		
		pessoas.add(pessoa);
		operacoes();
	}
	
	public static Pessoa encontrarPessoa(String cpf) {
		Pessoa pessoa = null;
		
		if(pessoas.size() != 0) {
			for(Pessoa cc: pessoas) {
				if(cc.getCpf().intern() == cpf.intern()) {
					pessoa = cc; 
				}			
			}
		}
		return pessoa;	
	}
	
	public static void listarPessoas() {
		if(pessoas.size() > 0) {
			for(Pessoa pessoa: pessoas) {
				System.out.println(pessoa);
			}
		}else {
			System.out.println("Nenhuma pessoa");
		}
		
		operacoes();
		
	}
	public static void deletarPessoa() {
		if(pessoas.size() != 0) {
			System.out.println("digite cpf");	
			String cpf = input.next();
		
			Pessoa cc = encontrarPessoa(cpf);
			
			if(cc != null) {
				pessoas.remove(cc);
				System.out.println("Pessoas removida com sucesso");
			}else {
				System.out.println("Nenhuma pessoa encontrada");
			}
		}	
		operacoes();	
	}
	
	public static void editarPessoa() {
		String cpf = input.next();
	}
	 
}









