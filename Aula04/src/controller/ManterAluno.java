package controller;
import modelAluno.Aluno;
import java.io.IOException;
import java.io.PrintWriter;
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
		
		if(pId == null || pNome == null || pRg == null || pCpf == null || pEndereco == null || pEmail == null || pTelefone == null)
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
					PrintWriter out = response.getWriter();
					out.println("<html><head><title>Cadastro</title></head><body>");
					out.println("<h2>Cadastrado</h2>");
					out.println("ID: " + aln.getId() + "<br>");	
					out.println("Nome: " + aln.getNome() + "<br>");	
					out.println("RG: " + aln.getRg() + "<br>");	
					out.println("CPF: " + aln.getCpf() + "<br>");	
					out.println("Endereço: " + aln.getEnd() + "<br>");	
					out.println("Email: " + aln.getEmail() + "<br>");	
					out.println("Telefone: " + aln.getTel() + "<br>");	
					out.println("</body></html>");	
					break;
					
				case "Consultar":
					aln.consultar();
					
					PrintWriter outC = response.getWriter();
					outC.println("<html><head><title>Consulta</title></head><body>");
					outC.println("<h2>Consulta</h2>");
					outC.println("ID: " + aln.getId() + "<br>");	
					outC.println("Nome: " + aln.getNome() + "<br>");	
					outC.println("RG: " + aln.getRg() + "<br>");	
					outC.println("CPF: " + aln.getCpf() + "<br>");	
					outC.println("Endereço: " + aln.getEnd() + "<br>");	
					outC.println("Email: " + aln.getEmail() + "<br>");	
					outC.println("Telefone: " + aln.getTel() + "<br>");	
					outC.println("</body></html>");				
					break;
					
				case "Alterar":
					aln.alterar();
					aln.consultar();
					PrintWriter outA = response.getWriter();
					outA.println("<html><head><title>Consulta Alteração</title></head><body>");
					outA.println("<h2>Alterado</h2>");
					outA.println("ID: " + aln.getId() + "<br>");	
					outA.println("Nome: " + aln.getNome() + "<br>");	
					outA.println("RG: " + aln.getRg() + "<br>");	
					outA.println("CPF: " + aln.getCpf() + "<br>");	
					outA.println("Endereço: " + aln.getEnd() + "<br>");	
					outA.println("Email: " + aln.getEmail() + "<br>");	
					outA.println("Telefone: " + aln.getTel() + "<br>");	
					outA.println("</body></html>");	
					break;
					
				case "Deletar":
					aln.deletar();
					PrintWriter outD = response.getWriter();
					outD.println("<html><head><title>Consulta</title></head><body>");
					outD.println("<h2>Excluido</h2>");		
					outD.println("</body></html>");	
					break;				
			}
		}
		
		

		/*System.out.println("ID:" + id + "<\n>" + "Nome:" + pNome + "<\n>"
				+ "RG:" + pRg + "<\n>" + "CPF:" + pCpf + "<\n>" + "Endereço:" + pEndereco + 
				"<\n>" + "Email:" + pEmail + "<\n>" + "Telefone:" + pTelefone + "<\n>");*/
		//doGet(request, response);
	}

}
