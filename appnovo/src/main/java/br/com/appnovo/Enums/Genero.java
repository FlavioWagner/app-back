package br.com.appnovo.Enums;

public enum Genero {
	Masculino("M"),
	Feminino("F"),
	NaoInformado("N");
	
	private String indicador;

	public String getDescricao() {
		return this.toString();
	}
	
	public String getIndicador() {
		return indicador;
	}	
	
	Genero(String indicador) {
		this.indicador = indicador;
	}	
		
}
