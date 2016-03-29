package modelCurso;

import daoCurso.CursosDAO;
import toCurso.CursosTO;

public class Curso 
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
	private int vagas;
	private double valor;
	
	public Curso(String cod, String nome, String numLab, String regSoft, String material, String livro, String dataIni, String dataTer, String horario, int vagas, double valor)
	{
		this.cod = cod;
		this.nome = nome;
		this.numLab = numLab;
		this.regSoft = regSoft;
		this.material = material;
		this.livro = livro;
		this.dataIni = dataIni;
		this.dataTer = dataTer;
		this.horario = horario;
		this.vagas = vagas;
		this.valor = valor;
	}
	
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
	
	public int getVagas()
	{
		return vagas;
	}
	
	public double getValor()
	{
		return valor;
	}
	
	public CursosTO getTO()
	{
		CursosTO to  = new CursosTO();
		to.setCod(cod);
		to.setNome(nome);
		to.setNumLab(numLab);
		to.setRegSoft(regSoft);
		to.setMaterial(material);
		to.setLivro(livro);
		to.setDataIni(dataIni);
		to.setDataTer(dataTer);
		to.setHorario(horario);
		to.setVagas(vagas);
		to.setValor(valor); 
		return to;
	}

	public void cadastrar()
	{
		CursosDAO dao = new CursosDAO();
		CursosTO to  = getTO();
		dao.cadastrar(to);
	}
	
	public void consultar()
	{
		CursosDAO dao = new CursosDAO();
		CursosTO to = dao.consultar(cod);
		cod = to.getCod();
		nome = to.getNome();
		numLab = to.getNumLab();
		regSoft = to.getRegSoft();
		material = to.getMaterial();
		livro = to.getLivro();
		dataIni = to.getDataIni();
		dataTer = to.getDataTer();
		horario = to.getHorario();
		vagas = to.getVagas();
		valor = to.getValor();
		
	}
	
	public void alterar()
	{
		CursosDAO dao = new CursosDAO();
		CursosTO to  = getTO();
		dao.alterar(to);
	}
	
	public void deletar()
	{
		CursosDAO dao = new CursosDAO();
		CursosTO to  = new CursosTO();
		to.setCod(cod);
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
		Curso other = (Curso) obj;
		if (cod == null) {
			if (other.cod != null)
				return false;
		} else if (!cod.equals(other.cod))
			return false;
		if (dataIni == null) {
			if (other.dataIni != null)
				return false;
		} else if (!dataIni.equals(other.dataIni))
			return false;
		if (dataTer == null) {
			if (other.dataTer != null)
				return false;
		} else if (!dataTer.equals(other.dataTer))
			return false;
		if (horario == null) {
			if (other.horario != null)
				return false;
		} else if (!horario.equals(other.horario))
			return false;
		if (livro == null) {
			if (other.livro != null)
				return false;
		} else if (!livro.equals(other.livro))
			return false;
		if (material == null) {
			if (other.material != null)
				return false;
		} else if (!material.equals(other.material))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (numLab == null) {
			if (other.numLab != null)
				return false;
		} else if (!numLab.equals(other.numLab))
			return false;
		if (regSoft == null) {
			if (other.regSoft != null)
				return false;
		} else if (!regSoft.equals(other.regSoft))
			return false;
		if (vagas != other.vagas)
			return false;
		if (Double.doubleToLongBits(valor) != Double.doubleToLongBits(other.valor))
			return false;
		return true;
	}
	
}

	

