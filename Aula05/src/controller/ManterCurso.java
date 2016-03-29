package controller;

import modelCurso.Curso;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ManterCurso
 */
@WebServlet("/ManterCurso.do")
public class ManterCurso extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	private String vagas;
	private String valor;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{ 
		String pBotao = request.getParameter("botao");
		if(pBotao.equals("Consultar"))
		{
			this.vagas = "0";
			this.valor = "0.0";
		}
		else
		{
			this.vagas = request.getParameter("vagas");
			this.valor = request.getParameter("valor");
		}
		
		String pCodigo = request.getParameter("codigo");
		String pNome = request.getParameter("nome");
		String pDatai = request.getParameter("datai");
		String pDataf = request.getParameter("dataf");
		String pHorario = request.getParameter("horario");
		String pLaboratorio = request.getParameter("laboratorio");
		String pRegistro = request.getParameter("registro");
		String pMaterial = request.getParameter("material");
		String pLivro = request.getParameter("livro");
		int pVagas = Integer.parseInt(vagas);
		double pValor = Double.parseDouble(valor);
		/*if(pCodigo == null || pNome == null || pDatai == null || pDataf == null || pHorario == null || vagas == null || valor == null || pLaboratorio == null || pRegistro == null || pMaterial == null || pLivro == null)
		{
			PrintWriter outM = response.getWriter();
			outM.println("<html><head><title>Erro</title></head><body>");
			outM.println("<h2>Campos vazios! Preencha corretamente!</h2>");	
			outM.println("</body></html>");	
		}
		else
		{*/
			
		
			Curso crs = new Curso(pCodigo, pNome, pLaboratorio, pRegistro, pMaterial, pLivro, pDatai, pDataf, pHorario, pVagas, pValor);
			
			switch(pBotao)
			{
				case "Cadastrar":
					crs.cadastrar();
					crs.consultar();

					request.setAttribute("curso_to", crs.getTO());
					RequestDispatcher despacho = request.getRequestDispatcher("CursoCadastrado.jsp");
					despacho.forward(request, response);
					
					break;
					
				case "Consultar":
					crs.consultar();

					request.setAttribute("curso_to", crs.getTO());
					RequestDispatcher despachoC = request.getRequestDispatcher("CursoConsultado.jsp");
					despachoC.forward(request, response);					
					
					break;
					
				case "Alterar":
					crs.alterar();
					crs.consultar();

					request.setAttribute("curso_to", crs.getTO());
					RequestDispatcher despachoA = request.getRequestDispatcher("CursoAlterado.jsp");
					despachoA.forward(request, response);					
					
					break;
					
				case "Deletar":
					crs.deletar();

					request.setAttribute("curso_to", crs.getTO());
					RequestDispatcher despachoD = request.getRequestDispatcher("CursoDeletado.jsp");
					despachoD.forward(request, response);					
					
					break;
			}
		//}
		
		//doGet(request, response);
	}

}
