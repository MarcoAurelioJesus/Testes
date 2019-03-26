package testesEnum;

public enum ConceitosEnumComConstrutor {

	OTIMO("Aprovado com louvor!"), BOM("Regular!"), REGULAR("Aprovado!"), RUIM("Reprovado!");

	private String mensagem;

	private ConceitosEnumComConstrutor(String mensagem) {
		this.mensagem = mensagem;
	}

	public String calcularAprovacao() {
		return this.mensagem;
	};

	public String test() {
		return "xxxxxxxxxxxx";
	}
}
