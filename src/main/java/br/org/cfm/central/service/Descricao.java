package br.org.cfm.central.service;

public class Descricao {
    private String description;

    public Descricao(String d) {
    	setDescription(d);
    }
    
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
