package br.com.patterns.proxy;

public class PessoaDAO {
	 
	public static Pessoa getPessoaByID(String id){
          System.out.println("select * from PESSOA where id="+id);
          return new PessoaImpl(id,"Pessoa " + id);
    }
}
