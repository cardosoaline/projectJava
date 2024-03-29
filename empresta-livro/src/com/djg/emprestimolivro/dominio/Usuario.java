package com.djg.emprestimolivro.dominio;

public class Usuario {
	
	private String codigoUsuario;
	private String nomeCompleto;
	private String dataNascimento;
	private String endereco;
	
	public String getCodigoUsuario() {
		return codigoUsuario;
	}

	public void setCodigoUsuario(String codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public Usuario(String nomeCompleto, String dataNascimento, String endereco) {
		super();
		this.nomeCompleto = nomeCompleto;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void imprimeUsuario() {
		System.out.println("codigo: "+codigoUsuario);
		System.out.println("Nome Completo: "+nomeCompleto);
		System.out.println("Data de Nascimento: "+dataNascimento);
		System.out.println("Endere�o: "+endereco);
	}

}
