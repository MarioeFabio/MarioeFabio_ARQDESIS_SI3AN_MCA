package testeCurso;

import static org.junit.Assert.assertEquals;

import modelCurso.Curso;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CursoTest 
{
	Curso curso, copia;
	
	@Before
	public void setUp() throws Exception 
	{
		curso = new Curso("info3","Informatica 3","LI13","aaht653wt1","n","n","17/03/2016","25/03/2016","14:00",18,350.00);
		copia = new Curso("info3","Informatica 3","LI13","aaht653wt1","n","n","17/03/2016","25/03/2016","14:00",18,350.00);
	}

	@Test
	public void test00Consultar() 
	{
		Curso fixture = new Curso("info1","Informatica basico 1","LI3","545kgyp85ni","n","n","18/09/2017","19/10/2017","18:00", 30, 350.00);
		Curso novo = new Curso("info1","Informatica basico 1","LI3","545kgyp85ni","n","n","18/09/2017","19/10/2017","18:00", 30, 350.00);
		novo.consultar();
		assertEquals("Teste de seleção", novo, fixture);
		//fail("Not yet implemented");
	}

	@Test
	public void test01Cadastrar() 
	{
		curso.cadastrar();
		curso.consultar();
		assertEquals("Teste de inserção", curso, copia);
		//fail("Not yet implemented");
	}

	@Test
	public void test02Alterar() 
	{
		curso.setNumLab("LI7");
		copia.setNumLab("LI7");
		curso.alterar();
		assertEquals("Teste de alteração",curso,copia);
		//fail("Not yet implemented");
	}
	
	@Test
	public void test03Deletar() 
	{
		curso.setCod(null);
		curso.setNome(null);
		curso.setNumLab(null);
		curso.setRegSoft(null);
		curso.setMaterial(null);
		curso.setLivro(null);
		curso.setDataIni(null);
		curso.setDataTer(null);
		curso.setHorario(null);
		curso.setVagas(0);
		curso.setValor(0.0);
		curso.deletar();
		assertEquals("Teste de deleção",curso,copia);
		//fail("Not yet implemented");
	}
	
}
