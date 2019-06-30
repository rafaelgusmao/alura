
public class TestaValores {
	
	public static void main(String[] args) {
	
	Conta conta = new Conta(1650, 0003);
	System.out.println("Foi criada a conta de ag�ncia " +  conta.getAgencia() + " e numero " + conta.getNumero());
	
	System.out.println();
	
	Conta conta1 = new Conta(1650, 9);
	System.out.println("Foi criada a conta de ag�ncia " +  conta.getAgencia() + " e numero " + conta.getNumero());
	
	System.out.println();
	
	System.out.println("Existem " + Conta.getTotal() + " criadas");
	}
}
