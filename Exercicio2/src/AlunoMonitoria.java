
public class AlunoMonitoria extends AlunoProjeto {
	private String disciplina;
	public AlunoMonitoria(String nome, int matricula, int periodo, String area, double valor, String disciplina) {
		super(nome, matricula, periodo, area, valor);
		this.disciplina = disciplina;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

}
