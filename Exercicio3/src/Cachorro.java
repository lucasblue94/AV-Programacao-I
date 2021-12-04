
public class Cachorro extends Animal {
	private String raca;
	public Cachorro(String nome, String raca) {
		super(nome);
		this.raca = raca;
	}

	@Override
	public String talk() {
		return "Au au au au au!";
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

}
