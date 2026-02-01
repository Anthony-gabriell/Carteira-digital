package principal;

	import java.util.ArrayList;

public class Cofre {
	private ArrayList<Moeda> listaMoedas = new ArrayList<>();

	public void adicionarMoeda(Moeda m) {
		listaMoedas.add(m);
	}
	public void removerMoeda(Moeda m) {
		listaMoedas.remove(m);		
	}
	
	public void listarMoedas() {
	for (Moeda m: listaMoedas) {
		m.info();
		}
	}
	public double calcularTotal() {
		double total = 0;
		
		for (Moeda m: listaMoedas) {
			total +=m.converter();
			}
		
		return total;
	}
}