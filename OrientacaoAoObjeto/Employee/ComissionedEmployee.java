package OrientacaoAoObjeto.Employee;

public class ComissionedEmployee extends Employee{
	protected double salesValue;
	protected double comissionPercentege;
	
	public ComissionedEmployee(String name, String cpf, double comissionPercentege, double salesValue) {
		super(name, cpf);
		this.salesValue = salesValue;
		this.comissionPercentege = comissionPercentege;
	}

	public double getSalesValue() {
		return salesValue;
	}

	public void setSalesValue(double salesValue) {
		this.salesValue = salesValue;
	}

	public double getComissionPercentege() {
		return comissionPercentege;
	}

	public void setComissionPercentege(double comissionPercentege) {
		this.comissionPercentege = comissionPercentege;
	}

	@Override
	public double calculateIncome() {
		return salesValue *comissionPercentege / 100;
	}
	
	@Override
	public String toString() {
		return "Vendedor por Comissão: salesValue [" + salesValue + "] comissionPercentege [" + comissionPercentege
				+ "] name [" + name + "] cpf [" + cpf + "]";
	}
	
}
