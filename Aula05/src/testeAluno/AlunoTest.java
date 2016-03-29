package testeAluno;

import static org.junit.Assert.assertEquals;

import modelAluno.Aluno;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AlunoTest 
{
	Aluno aluno, copia;

	@Before
	public void setUp() throws Exception 
	{
		aluno = new Aluno(3,"NomedoJUnit","330017777","Rua dos Testes,1213","emailntes@teste.com","44455555511","22227777");
		copia = new Aluno(3,"NomedoJUnit","330017777","Rua dos Testes,1213","emailntes@teste.com","44455555511","22227777");
	}

	@Test
	public void test00Consultar() 
	{
		//Aluno fixture = new Aluno(1, "Fulano", "9955566688", "77799988822", "Rua dos Teste,256", "emailteste@email.com", "22266555");
		Aluno fixture = new Aluno(1, "Fulano", "9955566688", "77799988822", "Rua dos Teste,256", "emailteste@email.com", "22266555");
		Aluno novo = new Aluno(1, null, null, null, null, null, null);
		novo.consultar();
		assertEquals("Teste de seleção", novo, fixture);
		//fail("Not yet implemented");
	}

	@Test
	public void test01Cadastrar() 
	{
		aluno.cadastrar();
		aluno.consultar();
		assertEquals("Teste de inserção", aluno, copia);
		//fail("Not yet implemented");
	}
	
	@Test
	public void test02Alterar() 
	{
		aluno.setTel("33335555");
		copia.setTel("33335555");
		aluno.alterar();
		assertEquals("Teste de alteração", aluno, copia);
		//fail("Not yet implemented");
	}
	
	@Test
	public void test03Deletar() 
	{
		aluno.setNome(null);
		aluno.setRg(null);
		aluno.setEnd(null);
		aluno.setEmail(null);
		aluno.setCpf(null);
		aluno.setTel(null);
		copia.setNome(null);
		copia.setRg(null);
		copia.setEnd(null);
		copia.setEmail(null);
		copia.setCpf(null);
		copia.setTel(null);
		aluno.deletar();
		assertEquals("Teste de deleção", aluno, copia);
		//fail("Not yet implemented");
	}

}
