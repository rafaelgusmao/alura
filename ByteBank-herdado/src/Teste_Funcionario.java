
public class Teste_Funcionario {

	
	public static void main(String[] args) {

		Gerente nico = new Gerente();
		
		nico.setCpf("09876678923");
		nico.setNome("Nico Steppat");
		nico.setSalario(2600.00);
		
		System.out.println(nico.getBonificacao());
		System.out.println(nico.getNome());
		
		

}}
