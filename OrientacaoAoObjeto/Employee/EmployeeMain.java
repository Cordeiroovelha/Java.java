package OrientacaoAoObjeto.Employee;

public class EmployeeMain {
    
    public static void main(String[] args) {
		Employee empregado01 = new SalariedEmployee("Ana", "1234", 3000);
		System.out.println(empregado01);
		System.out.println("Rendimentos = R$ " + empregado01.calculateIncome());
		
		Employee empregado02 = new HourlyEmployee("Adriana", "5678", 40, 30);
		System.out.println(empregado02);
		System.out.println("Rendimentos = R$ " + empregado02.calculateIncome());
		
		Employee empregado03 = new ComissionedEmployee("Juliana", "8765", 5, 50000);
		System.out.println(empregado03);
		System.out.println("Rendimentos = R$ " + empregado03.calculateIncome());
		
		Employee empregado04 = new SalariedAndComissionedEmploye("Mariana", "4321", 5, 50000, 2000);
		System.out.println(empregado04);
		System.out.println("Rendimentos = R$ " + empregado04.calculateIncome());
	}
}
