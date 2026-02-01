package principal;

public class Euro extends Moeda {
	private double taxa = 7;
	
	public Euro(double valor) {
		super(valor);
	}
	
	public void info() {
		System.out.println("Euro:" + valor);
	}
	
	public double converter() {
		return valor * taxa;
	}

}


