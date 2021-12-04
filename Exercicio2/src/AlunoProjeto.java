
public class AlunoProjeto extends Aluno {
	private String area;
	private double valor;
	public AlunoProjeto(String nome, int matricula, int periodo, String area, double valor) {
		super(nome, matricula, periodo);
		this.area = area;
		this.valor = valor;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}

}
