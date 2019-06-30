
public class TesteReferencias {

	public static void main(String[] args) {

		Funcionario g1 = new Gerente();
		
		g1.setNome("Marcos");
		g1.setSalario(5000.00);
		
		Funcionario ev = new EditorVideo();
		
		ev.setNome("Paulo");
		ev.setSalario(2500.00);
		
		Funcionario d = new Designer();
		d.setNome("Alisson");
		d.setSalario(1500.00);
		
		
		ControleBonificacao controle = new ControleBonificacao();
				
			controle.registra(g1);
			controle.registra(ev);
			controle.registra(d);


			System.out.println(controle.getSoma());
	}

}
