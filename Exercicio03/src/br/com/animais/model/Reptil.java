package br.com.animais.model;

public class Reptil extends Animal{
	
	private String corEscama;
	
	
	
	
	
	
	
	
	
	
	
	
	

	@Override
	public void locomover() {
		System.out.println("rastejando");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo vegetais");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de reptil");
		
	}

	public String getCorEscama() {
		return this.corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	
	
	
	
	

}
