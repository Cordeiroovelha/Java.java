package OrientadoAInterface.AreaCalculator.modal;

public class Circulo implements AreaCalculavel{
	
	private double pi = 3.14;
	private double Raio;
	

	public Circulo(double Raio) {
		this.Raio = Raio;
	}
	
	public double getPi() {
		return pi;
	}

	public void setPi(double pi) {
		this.pi = pi;
	}

	public double getRaio() {
		return Raio;
	}

	public void setRaio(double raio) {
		Raio = raio;
	}
	
	@Override
	public double calcularArea() {
		return Math.pow(Raio, 2) * pi;
	}
	
	
}

