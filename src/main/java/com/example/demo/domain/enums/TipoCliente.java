package com.example.demo.domain.enums;

public enum TipoCliente {
	
	PESSOAJURIDICA(1,"Pessoa Juridica"),
	PESSOAFISICA(2,"Pessoa Fisica");
	
	private TipoCliente(int cod,String nome) {
		this.cod = cod;
		this.nome = nome;
	}
	
	
	private int cod;
	private String nome;
	
	public int getCod() {
		return cod;
	}
	
	public String getNome() {
		return nome;
	}
	
	public static TipoCliente toEnum(Integer cod) {
		if (cod == null){
			return null;
		}
	
		for (TipoCliente x : TipoCliente.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id inválido: "+cod);
	}

}
