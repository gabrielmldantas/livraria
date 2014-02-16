package br.ufs.livraria.enumeration;

public enum Estado {
	AC("Acre"),
	AL("Alagoas"),
	AP("Amap�"),
	AM("Amazonas"),
	BA("Bahia"),
	CE("Cear�"),
	DF("Distrito Federal"),
	ES("Esp�rito Santo"),
	GO("Goi�s"),
	MA("Maranh�o"),
	MT("Mato Grosso"),
	MS("Mato Grosso do Sul"),
	MG("Minas Gerais"),
	PA("Par�"),
	PB("Para�ba"),
	PR("Paran�"),
	PE("Pernambuco"),
	PI("Piau�"),
	RR("Roraima"),
	RO("Rond�nia"),
	RJ("Rio de Janeiro"),
	RN("Rio Grande do Norte"),
	RS("Rio Grande do Sul"),
	SC("Santa Catarina"),
	SP("S�o Paulo"),
	SE("Sergipe"),
	TO("Tocantins");
	
	private final String label;
	
	private Estado(String label) {
		this.label = label;
	}
	
	public String getValue() {
		return this.name();
	}
	
	public String getLabel() {
		return label;
	}
	
	@Override
	public String toString() {
		return label;
	}
	
}