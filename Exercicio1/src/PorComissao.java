
public class PorComissao extends Empregado implements Comission {
	private double sales;
	public PorComissao(String name, double sales ) {
		super(name);
		this.sales = sales;
		
	}

	@Override
	public void setVendas(double sales) {
		this.sales = sales;

	}

	public double getSales() {
		return sales;
	}

	@Override
	public double getPay() {
		double precodoProduto = 100;
		return (precodoProduto*this.sales)*COMISSION_RATE; 

	}

}
