
public abstract class Animal implements Talkable {
	private String nome;
	public Animal(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}
