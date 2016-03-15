package testeAluno;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.junit.FixMethodOrder;
import toAluno.AlunosTO;
import daoAluno.AlunosDAO;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AlunosDAOTest 
{
	AlunosDAO dao;
	AlunosTO to;

	@Before
	public void setUp() throws Exception 
	{
		/*dao = new AlunosDAO();
		to = new AlunosTO();
		to.setId(2);
		to.setNome("NomeJUnit");
		to.setRg("330007777");
		to.setEnd("Rua dos Testes,1203");
		to.setEmail("email@teste.com");
		to.setCpf("44455555599");
		to.setTel("22225555");*/
		
		dao = new AlunosDAO();
		to = new AlunosTO();
		to.setTel("22227777");
		to.setCpf("44455555511");
		to.setEmail("emailntes@teste.com");
		to.setEnd("Rua dos Testes,1213");
		to.setRg("330017777");
		to.setNome("NomedoJUnit");
		to.setId(3);
	}

	@Test
	public void test00Consultar() 
	{
		/*AlunosTO fixture = new AlunosTO();
		fixture.setId(2);
		fixture.setNome("NomeJUnit");
		fixture.setRg("330007777");
		fixture.setEnd("Rua dos Testes,1203");
		fixture.setEmail("email@teste.com");
		fixture.setCpf("44455555599");
		fixture.setTel("22225555");
		AlunosTO novo = dao.consultar(2);
		novo.setId(2);
		assertEquals("Teste de inclusão", novo, fixture);*/
		//fail("Not yet implemented");
		
		
		AlunosTO fixture = new AlunosTO();
		fixture.setTel("22266555");
		fixture.setCpf("77799988822");
		fixture.setEmail("emailteste@teste.com");
		fixture.setEnd("Rua dos Testes,256");
		fixture.setRg("9955566688");
		fixture.setNome("Fulano");
		fixture.setId(1);
		AlunosTO novo = dao.consultar(1);
		novo.setId(1);
		assertEquals("Teste de inclusão", novo, fixture);
		//fail("Not yet implemented");	
	}
	
	@Test
	public void test01Cadastrar() 
	{
		dao.cadastrar(to);
		AlunosTO novo = dao.consultar(to.getId());
		novo.setId(to.getId());
		assertEquals("Teste de inclusão", novo, to);
		//fail("Not yet implemented");
	}
	
	@Test
	public void test02Alterar() 
	{
		to.setTel("33335555");
		dao.alterar(to);
		AlunosTO novo = dao.consultar(to.getId());
		novo.setId(to.getId());
		assertEquals("Teste de alteração", novo, to);
		//fail("Not yet implemented");
	}
	
	@Test
	public void test03Deletar() 
	{
		to.setNome(null);
		to.setRg(null);
		to.setEnd(null);
		to.setEmail(null);
		to.setCpf(null);
		to.setTel(null);
		dao.deletar(to);
		AlunosTO novo = dao.consultar(to.getId());
		novo.setId(to.getId());
		assertEquals("Teste de exclusão", novo, to);
		//fail("Not yet implemented");
	}

}
