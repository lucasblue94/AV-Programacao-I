
public class Arara extends Animal {
	private String cor;
	public Arara(String nome, String cor) {
		super(nome);
		this.cor = cor;
	}

	@Override
	public String talk() {
		return "Arrrr arrr arrrr!"; //fala da arara foi de fude em professor? kkkkkkkkkkkkkkkk
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

}
