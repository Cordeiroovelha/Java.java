package OrientacaoAoObjeto.Employee;

public class HourlyEmployee extends Employee{

	private int hoursWorked;
	private double valueOfHoursWorked;
	
	public HourlyEmployee(String name, String cpf, int hoursWorked, double valueOfHoursWorked) {
		super(name, cpf);
		this.hoursWorked = hoursWorked;
		this.valueOfHoursWorked = valueOfHoursWorked;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public double getValueOfHoursWorked() {
		return valueOfHoursWorked;
	}

	public void setValueOfHoursWorked(double valueOfHoursWorked) {
		this.valueOfHoursWorked = valueOfHoursWorked;
	}

	@Override
	public double calculateIncome() {
		return hoursWorked * valueOfHoursWorked;
	}
	
	@Override
	public String toString() {
		return "Funcionario por Hora: Quantidade de horas [" + hoursWorked + "] Valor da hora [" + valueOfHoursWorked + "] nome ["
				+ name + "] cpf [" + cpf + "]";
	}

}

