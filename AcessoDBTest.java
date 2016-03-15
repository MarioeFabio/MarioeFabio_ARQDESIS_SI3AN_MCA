package testeCurso;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;
import acessoAC.AcessoDB;

public class AcessoDBTest 
{

	@Test
	public void testOpenConnection() 
	{
		try
		{
			Connection conn = AcessoDB.openConnection();
			assertNotNull("Teste se a conexão não é nula", conn);
			assertTrue("É um objeto de conexão", conn instanceof Connection);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			fail("Erro de SQL");
		}
	}

}