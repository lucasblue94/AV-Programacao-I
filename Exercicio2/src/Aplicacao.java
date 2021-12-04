import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		String nome, area, disciplina, nomeProjeto;
		int matricula, periodo, opcao;
		double valor;
		Scanner teclado = new Scanner(System.in);
		Aluno aluno;
		
		do {
			System.out.println("Qual tipo de Aluno voc� deseja cadastrar?");
			System.out.println("1- Aluno normal");
			System.out.println("2- Aluno em monitoria");
			System.out.println("3- Aluno em inicia��o cient�fica");
			System.out.println("4- Quero sair, entrei aqui por acidente rsrsrs");
			opcao = teclado.nextInt();
			teclado.nextLine();
			if(opcao>4 || opcao<1) {
				System.out.println("Op��o indispon�vel, tente novamente\n");
			}
		} while(opcao>4 || opcao<1);

		if (opcao==1) {
			do {
				System.out.println("Digite o nome do aluno: ");
				nome = teclado.nextLine(); 
				if (nome == null || nome.equals("")) {
					System.out.println("Nome n�o pode ser vazio, tente novamente\n");	
					}
				} while (nome == null || nome.equals(""));
				
				do {
					System.out.println("Digite o n�mero de matr�cula do aluno: ");
					matricula = teclado.nextInt();
					if (matricula<0) {
						System.out.println("Matricula n�o pode ser menor que 0, tente novamente\n");	
						}
					} while (matricula<0);
				
				do {
					System.out.println("Digite o per�odo do aluno: ");
					periodo = teclado.nextInt();
					teclado.nextLine();
					if (periodo<0) {
						System.out.println("Per�odo n�o pode ser menor que 0, tente novamente\n");	
						}
					} while (periodo<0);
				aluno = new Aluno(nome, matricula, periodo);
			
			System.out.println("Nome: "+aluno.getNome()+"\nMatr�cula: "+aluno.getMatricula()+"\nPer�odo atual: "+aluno.getPeriodo());
			
		} else if (opcao==2) {
			do {
				System.out.println("Digite o nome do aluno: ");
				nome = teclado.nextLine(); 
				if (nome == null || nome.equals("")) {
					System.out.println("Nome n�o pode ser vazio, tente novamente\n");	
				}
			} while (nome == null || nome.equals(""));
			
			do {
				System.out.println("Digite o n�mero de matr�cula do aluno: ");
				matricula = teclado.nextInt();
				if (matricula<0) {
					System.out.println("Matricula n�o pode ser menor que 0, tente novamente\n");	
					}
				} while (matricula<0);
			
			do {
				System.out.println("Digite o per�odo do aluno: ");
				periodo = teclado.nextInt();
				teclado.nextLine();
				if (periodo<0) {
					System.out.println("Per�odo n�o pode ser menor que 0, tente novamente\n");	
					}
				} while (periodo<0);
			
			do {
				System.out.println("Digite a �rea da monitoria: ");
				area = teclado.nextLine();
				if (area == null || area.equals("")) {
				System.out.println("�rea n�o pode ser vazia, tente novamente\n");	
					}
				} while (area == null || area.equals(""));
			
			do {
				System.out.println("Digite o valor da bolsa: ");
				valor = teclado.nextDouble();
				teclado.nextLine();
				if (valor<0) {
					System.out.println("Valor da bolsa n�o pode ser menor que 0, tente novamente\n");	
					}
				} while (valor<0);
			
			do {
				System.out.println("Monitoria em qual disciplina? ");
				disciplina = teclado.nextLine();
				if (disciplina == null || disciplina.equals("")) {
					System.out.println("Disciplina n�o pode ser vazia, tente novamente\n");	
					}
				} while (disciplina == null || disciplina.equals(""));
			aluno = new AlunoMonitoria(nome, matricula, periodo, area, valor, disciplina);
			
			System.out.println("Nome: "+aluno.getNome()+"\nMatr�cula: "+aluno.getMatricula()+"\nPer�odo atual: "+aluno.getPeriodo()
			+"\nMonitoria na �rea de "+((AlunoProjeto)aluno).getArea()+"\nValor da bolsa: R$"+((AlunoProjeto)aluno).getValor()
			+"\nMonitoria em "+((AlunoMonitoria)aluno).getDisciplina());

		} else if (opcao==3) {
			do {
				System.out.println("Digite o nome do aluno: ");
				nome = teclado.nextLine(); 
				if (nome == null || nome.equals("")) {
					System.out.println("Nome n�o pode ser vazio, tente novamente\n");	
					}
				} while (nome == null || nome.equals(""));
				
				do {
					System.out.println("Digite o n�mero de matr�cula do aluno: ");
					matricula = teclado.nextInt();
					if (matricula<0) {
						System.out.println("Matricula n�o pode ser menor que 0, tente novamente\n");	
							}
					} while (matricula<0);
				
				do {
					System.out.println("Digite o per�odo do aluno: ");
					periodo = teclado.nextInt();
					teclado.nextLine();
					if (periodo<0) {
						System.out.println("Per�odo n�o pode ser menor que 0, tente novamente\n");	
						}
					} while (periodo<0);
				
				do {
					System.out.println("Digite a �rea da monitoria: ");
					area = teclado.nextLine();
					if (area == null || area.equals("")) {
					System.out.println("�rea n�o pode ser vazia, tente novamente\n");	
						}
					} while (area == null || area.equals(""));
				
				do {
					System.out.println("Digite o valor da bolsa: ");
					valor = teclado.nextDouble();
					teclado.nextLine();
					if (valor<0) {
						System.out.println("Valor da bolsa n�o pode ser menor que 0, tente novamente\n");	
						}
					} while (valor<0);
				
				do {
					System.out.println("Digite o nome do projeto: ");
					nomeProjeto = teclado.nextLine();
					if (nomeProjeto == null || nomeProjeto.equals("")) {
						System.out.println("Nome do projeto n�o pode ser vazio, tente novamente\n");
					}
				} while (nomeProjeto == null || nomeProjeto.equals(""));
				aluno = new AlunoIniciacaoCientifica(nome, matricula, periodo, area, valor, nomeProjeto);
				
				System.out.println("Nome: "+aluno.getNome()+"\nMatr�cula: "+aluno.getMatricula()+"\nPer�odo atual: "+aluno.getPeriodo()
				+"\nMonitoria na �rea de "+((AlunoProjeto)aluno).getArea()+"\nValor da bolsa: R$"+((AlunoProjeto)aluno).getValor()
				+"\nNome do projeto: "+((AlunoIniciacaoCientifica)aluno).getNomeProjeto());
		}
	System.out.println("\n\nFIM!!!");
	}

}
