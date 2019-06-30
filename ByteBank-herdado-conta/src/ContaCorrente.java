
public class ContaCorrente extends Conta implements Tributavel {
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
	}
	
	public void deposita(double valor) {
		super.saldo+= valor;
	}

	@Override
	public double getvalorImposto() {
	
		return super.saldo * 0.01;
	}
	
}