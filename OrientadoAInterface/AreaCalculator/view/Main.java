package OrientadoAInterface.AreaCalculator.view;

import OrientadoAInterface.AreaCalculator.modal.Circulo;
import OrientadoAInterface.AreaCalculator.modal.Quadrado;
import OrientadoAInterface.AreaCalculator.modal.Retangulo;

public class Main {

	public static void main(String[] args) {
		Quadrado areaQuadrado = new Quadrado(4);
		Retangulo areaRetangulo = new Retangulo(4, 10);
		Circulo areaCirculo = new Circulo(10);
		
		System.out.println("Area:" + areaQuadrado.calcularArea());
		System.out.println("Area:" + areaRetangulo.calcularArea());
		System.out.println("Area:" + areaCirculo.calcularArea());
	}

}
