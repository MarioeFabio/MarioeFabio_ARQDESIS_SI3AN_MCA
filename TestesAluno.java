package testeAluno;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AlunosDAOTest.class, AlunoTest.class, AlunosTOTest.class,
		AcessoDBTest.class })

public class TestesAluno 
{

}
