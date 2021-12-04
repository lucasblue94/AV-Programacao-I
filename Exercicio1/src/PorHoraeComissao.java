
public class PorHoraeComissao extends PorHora implements Comission {
	private double sales;
	public PorHoraeComissao(String name, double valorHora, int numHora, double sales) {
		super(name, valorHora, numHora);
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
		return ((precodoProduto*this.sales)*COMISSION_RATE) + super.getPay();
	}

}
