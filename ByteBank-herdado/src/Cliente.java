
public class Cliente implements Autenticavel {

	private AutenticacaoUtil autenticador = new AutenticacaoUtil();

	public Cliente() {
		this.autenticador = new AutenticacaoUtil();
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