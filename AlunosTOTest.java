package testeAluno;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import toAluno.AlunosTO;

public class AlunosTOTest 
{
	AlunosTO to;

	@Before
	public void setUp() throws Exception 
	{
		to = new AlunosTO();
		to.setId(2);
		to.setNome("NomeJUnit");
		to.setRg("330007777");
		to.setEnd("Rua dos Testes,1203");
		to.setEmail("email@teste.com");
		to.setCpf("44455555599");
		to.setTel("22225555");
	}	
	
	@Test
	public void testGets() 
	{
		assertEquals("getId", to.getId(), 2);
		assertEquals("getNome", to.getNome(), "NomeJUnit");
		assertEquals("getRg", to.getRg(), "330007777");
		assertEquals("getEnd", to.getEnd(), "Rua dos Testes,1203");
		assertEquals("getEmail", to.getEmail(), "email@teste.com");
		assertEquals("getCpf", to.getCpf(), "44455555599");
		assertEquals("getTel", to.getTel(), "22225555");
		//fail("Not yet implemented");
	}
	
	@Test
	public void testEquals()
	{
		AlunosTO copia = new AlunosTO();
		copia.setId(to.getId());
		copia.setNome(to.getNome());
		copia.setRg(to.getRg());
		copia.setEnd(to.getEnd());
		copia.setEmail(to.getEmail());
		copia.setCpf(to.getCpf());
		copia.setTel(to.getTel());
		assertEquals("Teste se TO é igual a COPIA", to, copia);
	}
	
}
