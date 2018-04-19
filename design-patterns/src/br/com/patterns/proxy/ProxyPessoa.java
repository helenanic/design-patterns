package br.com.patterns.proxy;

public class ProxyPessoa implements Pessoa {

	private String id;
	private Pessoa pessoa;
	
	public ProxyPessoa(String id) {
		this.id = id;
	}

	@Override
	public String getNome() {
		if (pessoa == null) {
			pessoa = PessoaDAO.getPessoaByID(this.id);
		}
		return pessoa.getNome();
	}

	@Override
	public String getId() {
		return this.id;
	}

}
