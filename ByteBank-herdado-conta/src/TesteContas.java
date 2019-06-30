
public class TesteContas {

	public static void main(String[] args) {

			ContaCorrente cc = new ContaCorrente(111,  111);
			cc.deposita(100.0);
			
			ContaPoupanca cp = new ContaPoupanca(222, 222);
			cp.deposita(200.0);
			
			try {
				cc.transfere(10.00, cp);
			} catch (SaldoInsuficienteException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			
			System.out.println("saldo cp " + cp.getSaldo());
			System.out.println("saldo cc " + cc.getSaldo());

	}

}
