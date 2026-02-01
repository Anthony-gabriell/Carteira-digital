package principal;

public class Dolar extends Moeda {
	private double taxa = 6;
	
	public Dolar(double valor) {
		super(valor);
	}
	
	public void info() {
		System.out.println("Dolar:" + valor);
	}
	
	public double converter() {
		return valor * taxa;
	}

}



