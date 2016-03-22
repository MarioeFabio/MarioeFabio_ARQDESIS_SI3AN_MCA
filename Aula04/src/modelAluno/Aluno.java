package modelAluno;

import daoAluno.AlunosDAO;
import toAluno.AlunosTO;

public class Aluno 
{
	private int id;
	private String nome; 
	private String rg; 
	private String end; 
	private String email; 
	private String cpf;
	private String tel;

	public Aluno(int id, String nome, String rg, String end, String email, String cpf, String tel)
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
	
	public void setCpf(String cpf)
	{
		this.cpf = cpf;
	}
	
	public void setTel(String tel)
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

	public String getCpf()
	{
		return cpf;
	}
	
	public String getTel()
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
		dao.alterar(to);
	}
	
	public void deletar()
	{
		AlunosDAO dao = new AlunosDAO();
		AlunosTO to = new AlunosTO();
		to.setId(id);
		dao.deletar(to);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (cpf != other.cpf)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (end == null) {
			if (other.end != null)
				return false;
		} else if (!end.equals(other.end))
			return false;
		if (id != other.id)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (rg == null) {
			if (other.rg != null)
				return false;
		} else if (!rg.equals(other.rg))
			return false;
		if (tel != other.tel)
			return false;
		return true;
	}
	
}
