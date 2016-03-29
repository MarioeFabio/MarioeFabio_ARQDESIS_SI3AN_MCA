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
			assertNotNull("Teste se a conex�o n�o � nula", conn);
			assertTrue("� um objeto de conex�o", conn instanceof Connection);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			fail("Erro de SQL");
		}
	}

}