
public class Gerente extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador = new AutenticacaoUtil();

	public double getBonificacao() {
		return super.getSalario();
	}

	@Override
	public boolean autentica(int senha) {
		return autenticador.autentica(senha);

	}

	@Override
	public void setSenha(int senha) {
		autenticador.setSenha(senha);

	}

}
