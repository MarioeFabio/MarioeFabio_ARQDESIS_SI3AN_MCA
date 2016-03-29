package controller;

import modelAluno.Aluno;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ManterAluno
 */
@WebServlet("/ManterAluno.do")
public class ManterAluno extends HttpServlet 
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
		String pId = request.getParameter("id");
		String pNome = request.getParameter("nome");
		String pRg = request.getParameter("rg");
		String pCpf = request.getParameter("cpf");
		String pEndereco = request.getParameter("endereco");
		String pEmail = request.getParameter("email");
		String pTelefone = request.getParameter("telefone");
		int id = Integer.parseInt(pId);
		String pBotao = request.getParameter("botao");
		
		if((pId == null) || (pNome == null) || (pRg == null) || (pCpf == null) || (pEndereco == null) || (pEmail == null) || (pTelefone == null))
		{
			PrintWriter outM = response.getWriter();
			outM.println("<html><head><title>Erro</title></head><body>");
			outM.println("<h2>Campos vazios! Preencha corretamente!</h2>");	
			outM.println("</body/></html>");	
		}
		else
		{
			
			Aluno aln = new Aluno(id, pNome, pRg, pCpf, pEndereco, pEmail, pTelefone);
			
			switch(pBotao)
			{
				case "Cadastrar":
					aln.cadastrar();
					aln.consultar();
					
					request.setAttribute("aluno_to", aln.getTO());
					RequestDispatcher despacho = request.getRequestDispatcher("AlunoCadastrado.jsp");
					despacho.forward(request, response);
					
					break;
					
				case "Consultar":
					aln.consultar();

					request.setAttribute("aluno_to", aln.getTO());
					RequestDispatcher despachoC = request.getRequestDispatcher("AlunoConsultado.jsp");
					despachoC.forward(request, response);					
				
					break;
					
				case "Alterar":
					aln.alterar();
					aln.consultar();

					request.setAttribute("aluno_to", aln.getTO());
					RequestDispatcher despachoA = request.getRequestDispatcher("AlunoAlterado.jsp");
					despachoA.forward(request, response);					
					
					break;
					
				case "Deletar":
					aln.deletar();

					RequestDispatcher despachoD = request.getRequestDispatcher("AlunoDeletado.jsp");
					despachoD.forward(request, response);					
					
					break;				
			}
		}
		
		

		/*System.out.println("ID:" + id + "<\n>" + "Nome:" + pNome + "<\n>"
				+ "RG:" + pRg + "<\n>" + "CPF:" + pCpf + "<\n>" + "Endereço:" + pEndereco + 
				"<\n>" + "Email:" + pEmail + "<\n>" + "Telefone:" + pTelefone + "<\n>");*/
		//doGet(request, response);
	}

}
