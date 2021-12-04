
public class AlunoIniciacaoCientifica extends AlunoProjeto {
	private String nomeProjeto;
	public AlunoIniciacaoCientifica(String nome, int matricula, int periodo, String area, double valor, String nomeProjeto) {
		super(nome, matricula, periodo, area, valor);
		this.nomeProjeto = nomeProjeto;
	}
	public String getNomeProjeto() {
		return nomeProjeto;
	}
	public void setNomeProjeto(String nomeProjeto) {
		this.nomeProjeto = nomeProjeto;
	}

}
