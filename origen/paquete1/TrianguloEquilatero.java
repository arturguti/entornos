package paquete1;

public class TrianguloEquilatero {
	private double lado;
	private double altura;
	
	TrianguloEquilatero (double lado, double altura){
		this.lado = lado;
		this.altura = altura;
	}
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double getAltura() {
		return altura;
	}

	
	
	double calculaArea() {
		double area = 0;
		if (altura==0){
			throw new ArithmeticException("No es posible que la altura sea cero");
		} else {
			area = (lado * 2)/altura;
		}
		return area;
	}

}
