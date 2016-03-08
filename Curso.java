package Projeto1;

public class Curso 
{
	private int id;
	private String cod;
	private String nome;
	private String numLab;
	private String regSoft;
	private String material;
	private String livro;
	private String dataIni;
	private String dataTer;
	private String horario;
	//private String dados;
	private int vagas;
	private double valor;
	
	public Curso(int id, String cod, String nome, String numLab, String regSoft, String material, String livro, String dataIni, String dataTer, String horario, int vagas, double valor)
	{
		this.id = id;
		this.cod = cod;
		this.nome = nome;
		this.numLab = numLab;
		this.regSoft = regSoft;
		this.material = material;
		this.livro = livro;
		this.dataIni = dataIni;
		this.dataTer = dataTer;
		this.horario = horario;
		//this.dados = dados;
		this.vagas = vagas;
		this.valor = valor;
	}
	
	public void setId(int id)
	{
		this.id = id;
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
	/*public void setDados(String dados)
	{
		this.dados = dados;
	}*/
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
	public int getId()
	{
		return id;
	}
	
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
	
	/*public String getDados()
	{
		return dados;
	}*/
	
	public int getVagas()
	{
		return vagas;
	}
	
	public double getValor()
	{
		return valor;
	}
	
	public void cadastrar()
	{
		CursosDAO dao = new CursosDAO();
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
		//to.setDados(dados);
		to.setVagas(vagas);
		to.setValor(valor);
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
		//dados = to.getDados();
		vagas = to.getVagas();
		valor = to.getValor();
		
	}
	
	public void alterar()
	{
		CursosDAO dao = new CursosDAO();
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
		//to.setDados(dados);
		to.setVagas(vagas);
		to.setValor(valor);
		dao.alterar(to);
	}
	
	public void deletar()
	{
		CursosDAO dao = new CursosDAO();
		CursosTO to  = new CursosTO();
		to.setCod(cod);
		dao.deletar(to);
	}
	
}

	

