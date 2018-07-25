package controle;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Acao {
	
	public void executarAcao(HttpServletRequest request,HttpServletResponse response)throws IOException;

}
