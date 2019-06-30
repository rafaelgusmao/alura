
public class TesteConexao {

	public static void main(String[] args) {
		
		try (Conexao con1 = new Conexao()){
			con1.leDados();
		} catch (IllegalStateException e) {
			System.out.println("Erro de conexao " + e.hashCode());
			
		}
		
		//-------------------------------------
		
//		Conexao con = null;
//		try {
//			con = new Conexao();
//			con.leDados();
//		} catch (IllegalStateException e) {
//			System.out.println("Erro de conexao " + e.getMessage());
//		} finally {
//			System.out.println("Finally");
//			if(con != null) {
//				con.fecha();
//			}
//		}

	}

}
