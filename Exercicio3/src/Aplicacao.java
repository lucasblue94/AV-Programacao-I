import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		Animal animal;
		String nome, raca, cor;
		int opcao;
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.println("Qual animal voc� deseja cadastrar?");
			System.out.println("1- Cachorro");
			System.out.println("2- Arara");
			System.out.println("3- Quero sair, entrei aqui por acidente rsrsrs");
			opcao = teclado.nextInt();
			teclado.nextLine();
			if (opcao<1 || opcao>3) {
				System.out.println("Op��o inv�lida, tente novamente\n");
			}
		} while (opcao<1 || opcao>3);
		
		if (opcao==1) {
			do {
				System.out.println("Digite o nome do cachorro: ");
				nome = teclado.nextLine();
				if (nome == null || nome.equals("")) {
				System.out.println("Nome n�o pode ser vazio, tente novamente\n");
				}
			} while (nome == null || nome.equals(""));
			
			do {
				System.out.println("Digite a ra�a do cachorro: ");
				raca = teclado.nextLine();
				if (raca == null || raca.equals("")) {
					System.out.println("Ra�a n�o pode ser vazio, tente novamente");
					}
				} while (raca == null || raca.equals(""));
			animal = new Cachorro(nome, raca);
			
			System.out.println("Nome: "+animal.getNome()+"\nRa�a: "+((Cachorro)animal).getRaca()+"\n"+((Cachorro)animal).talk());
			
		} else if (opcao==2) {
			do {
				System.out.println("Digite o nome da arara: ");
				nome = teclado.nextLine();
				if (nome == null || nome.equals("")) {
				System.out.println("Nome n�o pode ser vazio, tente novamente\n");
				}
			} while (nome == null || nome.equals(""));
			
			do {
				System.out.println("Qual a cor da arara: ");
				cor = teclado.nextLine();
				if (cor == null || cor.equals("")) {
					System.out.println("Cor n�o pode ser vazio, tente novamente\n");
					}
				} while (cor == null || cor.equals(""));
			animal = new Arara(nome, cor);
			
			System.out.println("Nome: "+animal.getNome()+"\nCor: "+((Arara)animal).getCor()+"\n"+((Arara)animal).talk());
			}
		System.out.println("\n\nFIM!!!");
		}

}
