package OrientacaoAoObjeto.Employee;

public class SalariedAndComissionedEmploye extends ComissionedEmployee {
    private double salary;

    public SalariedAndComissionedEmploye(String name, String cpf, double comissionPercentege, double salesValue, double salary) {
        super(name, cpf, comissionPercentege, salesValue);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

	@Override
	public String toString() {
		return "Vendedor por Comissão e Asalariado: Salario [" + salary + " ] Valor de venda [" + salesValue + "] porcentagem da comição [" 
				+ comissionPercentege + "] nome [" + name + "] cpf [" + cpf + "]";
	}

	@Override
	public double calculateIncome() {
		return salary + super.calculateIncome();
	}
}