package OrientacaoAoObjeto.Employee;

public class SalariedEmployee extends Employee{
	private double salary;
	
	public SalariedEmployee(String name, String cpf, double salary) {
		super(name, cpf);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public double calculateIncome() {
		return salary;
	}
	
	@Override
	public String toString() {
		return "Empregado Assalariado : salario [R$" + salary + "] nome [" + name + "] cpf [" + cpf + "]";
	}
}

