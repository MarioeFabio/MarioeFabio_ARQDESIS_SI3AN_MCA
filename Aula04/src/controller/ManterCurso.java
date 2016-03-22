package controller;
import modelCurso.Curso;
import java.io.IOException;
import java.io.PrintWriter;
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
		String pCodigo = request.getParameter("codigo");
		String pNome = request.getParameter("nome");
		String pDatai = request.getParameter("datai");
		String pDataf = request.getParameter("dataf");
		String pHorario = request.getParameter("horario");
		String vagas = request.getParameter("vagas");
		String valor = request.getParameter("valor");
		String pLaboratorio = request.getParameter("laboratorio");
		String pRegistro = request.getParameter("registro");
		String pMaterial = request.getParameter("material");
		String pLivro = request.getParameter("livro");
		int pVagas = Integer.parseInt(vagas);
		double pValor = Double.parseDouble(valor);
		String pBotao = request.getParameter("botao");
		
		if(pCodigo == "" || pNome == "" || pDatai == "" || pDataf == "" || pHorario == "" || vagas == "" || valor == "" || pLaboratorio == "" || pRegistro == "" || pMaterial == "" || pLivro == "")
		{
			PrintWriter outM = response.getWriter();
			outM.println("<html><head><title>Erro</title></head><body>");
			outM.println("<h2>Campos vazios! Preencha corretamente!</h2>");	
			outM.println("</body></html>");	
		}
		else
		{
			
			Curso crs = new Curso(pCodigo, pNome, pLaboratorio, pRegistro, pMaterial, pLivro, pDatai, pDataf, pHorario, pVagas, pValor);
			
			switch(pBotao)
			{
				case "Cadastrar":
					crs.cadastrar();
					crs.consultar();
					PrintWriter out = response.getWriter();
					out.println("<html><head><title>Cadastro</title></head><body>");
					out.println("<h2>Cadastrado</h2>");
					out.println("Código: " + crs.getCod() + "<br>");	
					out.println("Nome: " + crs.getNome() + "<br>");	
					out.println("Data Inicial: " + crs.getDataIni() + "<br>");	
					out.println("Data Final: " + crs.getDataTer() + "<br>");	
					out.println("Horário: " + crs.getHorario() + "<br>");	
					out.println("Vagas: " + crs.getVagas() + "<br>");	
					out.println("Valor: " + crs.getValor() + "<br>");	
					out.println("Laboratório: " + crs.getNumLab() + "<br>");	
					out.println("Registro: " + crs.getRegSoft() + "<br>");	
					out.println("Material: " + crs.getMaterial() + "<br>");	
					out.println("Livro: " + crs.getLivro() + "<br>");	
					out.println("</body></html>");	
					break;
					
				case "Consultar":
					crs.consultar();
					PrintWriter outC = response.getWriter();
					outC.println("<html><head><title>Consulta</title></head><body>");
					outC.println("<h2>Consulta</h2>");
					outC.println("Código: " + crs.getCod() + "<br>");	
					outC.println("Nome: " + crs.getNome() + "<br>");	
					outC.println("Data Inicial: " + crs.getDataIni() + "<br>");	
					outC.println("Data Final: " + crs.getDataTer() + "<br>");	
					outC.println("Horário: " + crs.getHorario() + "<br>");	
					outC.println("Vagas: " + crs.getVagas() + "<br>");	
					outC.println("Valor: " + crs.getValor() + "<br>");	
					outC.println("Laboratório: " + crs.getNumLab() + "<br>");	
					outC.println("Registro: " + crs.getRegSoft() + "<br>");	
					outC.println("Material: " + crs.getMaterial() + "<br>");	
					outC.println("Livro: " + crs.getLivro() + "<br>");	
					outC.println("</body></html>");				
					break;
					
				case "Alterar":
					crs.alterar();
					crs.consultar();
					PrintWriter outA = response.getWriter();
					outA.println("<html><head><title>Consulta</title></head><body>");
					outA.println("<h2>Alterado</h2>");
					outA.println("Código: " + crs.getCod() + "<br>");	
					outA.println("Nome: " + crs.getNome() + "<br>");	
					outA.println("Data Inicial: " + crs.getDataIni() + "<br>");	
					outA.println("Data Final: " + crs.getDataTer() + "<br>");	
					outA.println("Horário: " + crs.getHorario() + "<br>");	
					outA.println("Vagas: " + crs.getVagas() + "<br>");	
					outA.println("Valor: " + crs.getValor() + "<br>");	
					outA.println("Laboratório: " + crs.getNumLab() + "<br>");	
					outA.println("Registro: " + crs.getRegSoft() + "<br>");	
					outA.println("Material: " + crs.getMaterial() + "<br>");	
					outA.println("Livro: " + crs.getLivro() + "<br>");	
					outA.println("</body></html>");					
					break;
					
				case "Deletar":
					crs.deletar();
					PrintWriter outD = response.getWriter();
					outD.println("<html><head><title>Consulta</title></head><body>");
					outD.println("<h2>Excluido</h2>");		
					outD.println("</body></html>");	
					break;
			}
		}
		
		//doGet(request, response);
	}

}
