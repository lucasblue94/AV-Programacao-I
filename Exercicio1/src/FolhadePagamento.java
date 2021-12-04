import java.util.Scanner;

public class FolhadePagamento {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Empregado empregado;
		String name;
		double sales, valorHora;
		int numHora, opcao;
		
		
	do {	
		System.out.println("Qual tipo de pagamento você deseja cadastrar?");
		System.out.println("1- Por comissão");
		System.out.println("2- Por hora");
		System.out.println("3- Por hora e comissão");
		System.out.println("4- Quero sair, entrei aqui por acidente rsrsrs");
		opcao = teclado.nextInt();
		teclado.nextLine();
		if (opcao!=1 && opcao!=2 && opcao!=3 && opcao!=4) {
			System.out.println("Opção inválida, tente novamente\n");
		}
	} while(opcao!=1 && opcao!=2 && opcao!=3 && opcao!=4);
	
	
	if (opcao==1) {
		System.out.println("Digite o nome do empregado: ");
		name = teclado.nextLine();
		System.out.println("Quantos produtos o empregado vendeu? ");
		sales = teclado.nextDouble();
		empregado = new PorComissao(name, sales);
		
		System.out.println("Nome: "+empregado.getName()+"\nQuantidade de produtos vendidos: "+((PorComissao)empregado).getSales()
				+"\nPagamento: R$"+((PorComissao)empregado).getPay());
		
	} else if(opcao==2) {
		System.out.println("Digite o nome do empregado: ");
		name = teclado.nextLine();
		System.out.println("Quanto o empregado recebe por hora trabalhada? ");
		valorHora= teclado.nextDouble();
		System.out.println("Por quantas horas o empregado trabalhou? ");
		numHora = teclado.nextInt();
		empregado = new PorHora(name, valorHora, numHora);
		
		System.out.println("Nome: "+empregado.getName()+"\nRecebe por hora: R$"+((PorHora)empregado).getValorHora()
				+"\nQuantidade de horas trabalhadas: "+((PorHora)empregado).getNumHora()+" horas"
				+"\nPagamento: R$"+((PorHora)empregado).getPay());
		
	} else if (opcao==3) {
		System.out.println("Digite o nome do empregado: ");
		name = teclado.nextLine();
		System.out.println("Quantos produtos o empregado vendeu? ");
		sales = teclado.nextDouble();
		System.out.println("Quanto o empregado recebe por hora trabalhada? ");
		valorHora= teclado.nextDouble();
		System.out.println("Por quantas horas o empregado trabalhou? ");
		numHora = teclado.nextInt();
		empregado = new PorHoraeComissao(name, valorHora, numHora, sales);
		
		System.out.println("Nome: "+empregado.getName()+"\nQuantidade de produtos vendidos: "+((PorHoraeComissao)empregado).getSales()
				+"\nRecebe por hora: R$"+((PorHora)empregado).getValorHora()
				+"\nQuantidade de horas trabalhadas: "+((PorHora)empregado).getNumHora()+" horas"
				+"\nPagamento: R$"+((PorHoraeComissao)empregado).getPay());
	}
	
	System.out.println("\n\nFIM!!!");
	
	}

}
