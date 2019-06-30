
public class CalculadorDeImposto {

	private double totalImposto;
	
	public void registro(Tributavel t) {
		double valor = t.getvalorImposto();
		this.totalImposto+=valor;
	}
	
	public double getTotalImposto() {
		return totalImposto;
	}
}
