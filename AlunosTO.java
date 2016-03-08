package project;

public class AlunosTO 
{
	private int id;
	private String nome; 
	private String rg; 
	private String end; 
	private String email; 
	private int cpf;
	private int tel;
	
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
}
