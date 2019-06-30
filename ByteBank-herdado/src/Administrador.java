
public class Administrador extends Funcionario implements Autenticavel {

	
	AutenticacaoUtil autenticador = new AutenticacaoUtil();

	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return 50;
	}

	@Override
	public boolean autentica(int senha) {
		// TODO Auto-generated method stub
		return autenticador.autentica(senha);
	}

	@Override
	public void setSenha(int senha) {
		autenticador.setSenha(senha);

	}

}
