
public abstract class Empregado {
	private String name;
	public Empregado(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract double getPay();
	
	public void printPay() {
	}
}
