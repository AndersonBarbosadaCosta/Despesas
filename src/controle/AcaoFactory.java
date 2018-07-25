package controle;

public class AcaoFactory {

	@SuppressWarnings("unchecked")
	public static Acao criacao(String acao) {

		Acao objetoAcao = null;
		String nomeDaClasse = "acao." + acao + "Acao";
		Class classe = null;
		Object objeto = null;
		try {
			classe = Class.forName(nomeDaClasse);
			objeto = classe.newInstance();

		} catch (Exception e) {
			return null;
		}
		if (!(objeto instanceof Acao)) {
			return null;
		}
		objetoAcao = (Acao) objeto;
		return objetoAcao;
	}
}
