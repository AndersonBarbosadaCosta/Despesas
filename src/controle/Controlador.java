package controle;

import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class for Servlet: Controlador
 * 
 */
public class Controlador extends javax.servlet.http.HttpServlet implements
		javax.servlet.Servlet {
	static final long serialVersionUID = 1L;
	private SimpleDateFormat dataFormatada = new SimpleDateFormat(
			"dd/MM/yyyy - hh:mm:ss ");

	/*
	 * (non-Java-doc)
	 * 
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public Controlador() {
		super();
	}

	/*
	 * (non-Java-doc)
	 * 
	 * @see javax.servlet.http.HttpServlet#doGet(HttpServletRequest request,
	 *      HttpServletResponse response)
	 */

	@Override
	public void init(ServletConfig config) throws ServletException {

		super.init(config);
		log("O servidor foi iniciado na data "
				+ dataFormatada.format(new Date()));
	}

	@Override
	public void destroy() {

		log("O servidor foi finalizado na data "
				+ dataFormatada.format(new Date()));
		super.destroy();
	}

	protected void processaRequisicao(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String acao = "" + request.getParameter("acao");
		Acao objetoAcao = null;
		if (!(acao == null || acao == "")) {
			try {
				objetoAcao = AcaoFactory.criacao(acao);
				if (objetoAcao != null) {
					objetoAcao.executarAcao(request, response);
				}
			} catch (Exception e) {
				e.printStackTrace();
				response.sendRedirect("Erro.jsp");
			}
		} else {
			response.sendRedirect("index.jsp");
		}

	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		processaRequisicao(request, response);
	}

	/*
	 * (non-Java-doc)
	 * 
	 * @see javax.servlet.http.HttpServlet#doPost(HttpServletRequest request,
	 *      HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		processaRequisicao(request, response);

	}

}