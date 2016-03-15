package toAluno;

public class AlunosTO 
{
	private int id;
	private String nome; 
	private String rg; 
	private String end; 
	private String email; 
	private String cpf;
	private String tel;
	
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

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AlunosTO other = (AlunosTO) obj;
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
