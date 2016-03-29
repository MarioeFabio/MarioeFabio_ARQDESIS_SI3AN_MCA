package toCurso;

public class CursosTO 
{

	private String cod;
	private String nome;
	private String numLab;
	private String regSoft;
	private String material;
	private String livro;
	private String dataIni;
	private String dataTer;
	private String horario;
	private String dados;
	private int vagas;
	private double valor;
	
	public void setCod(String cod)
	{
		this.cod = cod;
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	public void setNumLab(String numLab)
	{
		this.numLab = numLab;
	}
	public void setRegSoft(String regSoft)
	{
		this.regSoft = regSoft;
	}
	public void setMaterial(String material)
	{
		this.material = material;
	}
	public void setLivro(String livro)
	{
		this.livro = livro;
	}
	public void setDataIni(String dataIni)
	{
		this.dataIni = dataIni;
	}
	public void setDataTer(String dataTer)
	{
		this.dataTer = dataTer;
	}
	public void setHorario(String horario)
	{
		this.horario = horario;
	}
	public void setDados(String dados)
	{
		this.dados = dados;
	}
	public void setVagas(int vagas)
	{
		this.vagas = vagas;
	}
	public void setValor(double valor)
	{
		this.valor = valor;
	}
	//
	//
	//
	//
	//
	
	public String getCod()
	{
		return cod;
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public String getNumLab()
	{
		return numLab;
	}
	
	public String getRegSoft()
	{
		return regSoft;
	}
	
	public String getMaterial()
	{
		return material;
	}
	
	public String getLivro()
	{
		return livro;
	}
	
	public String getDataIni()
	{
		return dataIni;
	}
	
	public String getDataTer()
	{
		return dataTer;
	}
	
	public String getHorario()
	{
		return horario;
	}
	
	public String getDados()
	{
		return dados;
	}
	
	public int getVagas()
	{
		return vagas;
	}
	
	public double getValor()
	{
		return valor;
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		CursosTO other = (CursosTO) obj;
		if (cod == null) {
			if (other.cod != null) {
				return false;
			}
		} else if (!cod.equals(other.cod)) {
			return false;
		}
		if (dados == null) {
			if (other.dados != null) {
				return false;
			}
		} else if (!dados.equals(other.dados)) {
			return false;
		}
		if (dataIni == null) {
			if (other.dataIni != null) {
				return false;
			}
		} else if (!dataIni.equals(other.dataIni)) {
			return false;
		}
		if (dataTer == null) {
			if (other.dataTer != null) {
				return false;
			}
		} else if (!dataTer.equals(other.dataTer)) {
			return false;
		}
		if (horario == null) {
			if (other.horario != null) {
				return false;
			}
		} else if (!horario.equals(other.horario)) {
			return false;
		}
		if (livro == null) {
			if (other.livro != null) {
				return false;
			}
		} else if (!livro.equals(other.livro)) {
			return false;
		}
		if (material == null) {
			if (other.material != null) {
				return false;
			}
		} else if (!material.equals(other.material)) {
			return false;
		}
		if (nome == null) {
			if (other.nome != null) {
				return false;
			}
		} else if (!nome.equals(other.nome)) {
			return false;
		}
		if (numLab == null) {
			if (other.numLab != null) {
				return false;
			}
		} else if (!numLab.equals(other.numLab)) {
			return false;
		}
		if (regSoft == null) {
			if (other.regSoft != null) {
				return false;
			}
		} else if (!regSoft.equals(other.regSoft)) {
			return false;
		}
		if (vagas != other.vagas) {
			return false;
		}
		if (Double.doubleToLongBits(valor) != Double.doubleToLongBits(other.valor)) {
			return false;
		}
		return true;
	}
}

	