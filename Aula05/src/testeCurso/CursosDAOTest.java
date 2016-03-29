package testeCurso;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.junit.FixMethodOrder;

import toCurso.CursosTO;
import daoCurso.CursosDAO;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CursosDAOTest 
{
	CursosTO to;
	CursosDAO dao;
	
	@Before
	public void setUp() throws Exception 
	{
		dao = new CursosDAO();
		to = new CursosTO();
		//to.setId(4);
		to.setCod("info3");
		to.setNome("Informatica 3");
		to.setNumLab("13");
		to.setRegSoft("aaht653wt1");
		to.setMaterial("n");
		to.setLivro("n");
		to.setDataIni("17/03/2016");
		to.setDataTer("25/03/2016");
		to.setHorario("14:00");
		to.setVagas(18);
		to.setValor(350.00);
	}

	@Test
	public void test00Consultar() 
	{
		CursosTO fixture = new CursosTO();
		fixture.setCod("info3");
		fixture.setNome("Informatica 3");
		fixture.setNumLab("13");
		fixture.setRegSoft("aaht653wt1");
		fixture.setMaterial("");
		fixture.setLivro("n");
		fixture.setDataIni("17/03/2016");
		fixture.setDataTer("25/03/2016");
		fixture.setHorario("14:00");
		fixture.setVagas(18);
		fixture.setValor(350.00);
		CursosTO novo = dao.consultar("info3");
		novo.setCod("info3");
		assertEquals("Teste de inclusão", novo, fixture);
		//fail("Not yet implemented");
	}
	
	@Test
	public void test01Cadastrar() 
	{
		dao.cadastrar(to);
		CursosTO novo = dao.consultar(to.getCod());
		novo.setCod(to.getCod());
		assertEquals("Teste de inclusão", novo, to);
		//fail("Not yet implemented");
	}
	
	@Test
	public void test02Alterar() 
	{
		to.setHorario("11:00");
		dao.alterar(to);
		CursosTO novo = dao.consultar(to.getCod());
		novo.setCod(to.getCod());
		assertEquals("Teste de alteração", novo, to);
		//fail("Not yet implemented");
	}
	
	@Test
	public void test03Deletar() 
	{
		to.setCod(null);
		to.setNome(null);
		to.setNumLab(null);
		to.setRegSoft(null);
		to.setMaterial(null);
		to.setLivro(null);
		to.setDataIni(null);
		to.setDataTer(null);
		to.setHorario(null);
		to.setVagas(0);
		to.setValor(0);
		dao.deletar(to);
		CursosTO novo = dao.consultar(to.getCod());
		novo.setCod(to.getCod());
		assertEquals("Teste de exclusão", novo, to);
		//fail("Not yet implemented");
	}
}
