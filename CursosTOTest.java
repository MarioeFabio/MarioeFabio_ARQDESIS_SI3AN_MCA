package testeCurso;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import toCurso.CursosTO;

public class CursosTOTest 
{
	CursosTO to;
	
	@Before
	public void setUp() throws Exception 
	{
		to = new CursosTO();
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
	public void testGets() 
	{
		assertEquals("getCod", to.getCod(), "Info3");
		assertEquals("getNome", to.getNome(), "NomeJUnit");
		assertEquals("getNumLab", to.getNumLab(), "i4");
		assertEquals("getRegSoft", to.getRegSoft(), "aaht653wt1");
		assertEquals("getMaterial", to.getMaterial(), "n");
		assertEquals("getLivro", to.getLivro(), "n");
		assertEquals("getDataIni", to.getDataIni(), "17/03/2016");
		assertEquals("getDataTer", to.getDataTer(), "25/03/2016");
		assertEquals("getHorario", to.getHorario(), "14:00");
		assertEquals("getVagas", to.getVagas(), 18);
		assertEquals("getValor", to.getValor(), 350,00);

		//fail("Not yet implemented");
	}
	
	@Test
	public void testEquals()
	{
		CursosTO copia = new CursosTO();
		copia.setCod(to.getCod());
		copia.setNome(to.getNome());
		copia.setNumLab(to.getNumLab());
		copia.setRegSoft(to.getRegSoft());
		copia.setMaterial(to.getMaterial());
		copia.setLivro(to.getLivro());
		copia.setDataIni(to.getDataIni());
		copia.setDataTer(to.getDataTer());
		copia.setHorario(to.getHorario());
		copia.setVagas(to.getVagas());
		copia.setValor(to.getValor());
		assertEquals("Teste se TO é igual a COPIA", to, copia);
	}

}
