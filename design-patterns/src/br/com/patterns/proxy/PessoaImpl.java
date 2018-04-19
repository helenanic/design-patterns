package br.com.patterns.proxy;

public class PessoaImpl implements Pessoa {

	private String nome;
	private String id;
	
	public PessoaImpl(String nome, String id) {
		this.nome = nome;
		this.id = id;
		System.out.println("Buscou a pessoa no banco -> " + nome);
	}

	@Override
	public String getNome() {
		return nome;
	}

	@Override
	public String getId() {
		return this.id;
	}

}
