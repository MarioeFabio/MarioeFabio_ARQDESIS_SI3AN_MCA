package project;

public class Aluno 
{
	private int id;
	private String nome; 
	private String rg; 
	private String end; 
	private String email; 
	private int cpf;
	private int tel;

	public Aluno(int id, String nome, String rg, String end, String email, int cpf, int tel)
	{
		this.id = id;
		this.nome = nome;
		this.rg = rg;
		this.end = end;
		this.email = email;
		this.cpf = cpf;
		this.tel = tel;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public void setRg(String rg)
	{
		this.rg = rg;
	}
	
	public void setEnd(String end)
	{
		this.end = end;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public void setCpf(int cpf)
	{
		this.cpf = cpf;
	}
	
	public void setTel(int tel)
	{
		this.tel = tel;
	}
	//
	//
	//
	//
	//
	public int getId()
	{
		return id;
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public String getRg()
	{
		return rg;
	}
	
	public String getEnd()
	{
		return end;
	}
	
	public String getEmail()
	{
		return email;
	}

	public int getCpf()
	{
		return cpf;
	}
	
	public int getTel()
	{
		return tel;
	} 
	
	public void cadastrar()
	{
		AlunosDAO dao = new AlunosDAO();
		AlunosTO to = new AlunosTO();
		to.setNome(nome);
		to.setRg(rg);
		to.setEnd(end);
		to.setEmail(email);
		to.setCpf(cpf);
		to.setTel(tel);
		dao.cadastrar(to);
	}
	
	public void consultar()
	{
		AlunosDAO dao = new AlunosDAO();
		AlunosTO to = dao.consultar(id);
		nome = to.getNome();
		rg = to.getRg();
		end = to.getEnd();
		email = to.getEmail();
		cpf = to.getCpf();
		tel = to.getTel();
		
	}
	
	public void alterar()
	{
		AlunosDAO dao = new AlunosDAO();
		AlunosTO to = new AlunosTO();
		to.setId(id);
		to.setNome(nome);
		to.setRg(rg);
		to.setEnd(end);
		to.setEmail(email);
		to.setCpf(cpf);
		to.setTel(tel);
		dao.cadastrar(to);
	}
	
	public void deletar()
	{
		AlunosDAO dao = new AlunosDAO();
		AlunosTO to = new AlunosTO();
		to.setId(id);
		dao.deletar(to);
	}
	
}
