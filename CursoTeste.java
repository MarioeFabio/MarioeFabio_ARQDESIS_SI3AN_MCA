package Projeto1;

public class CursoTeste 
{
	public static void main(String[]args)
	{
		Curso crs = new Curso(0,"infob1", "Informatica basica 1", "LI3", "3359aw7tip56", "n", "n", "07/03/2016", "21/03/2016", "09:15", 18, 150.00);
		crs.cadastrar();

		crs.consultar();

		System.out.println(crs);

		crs.setNome("NovoNome");

		crs.alterar();

		crs.consultar();

		System.out.println(crs);

		crs.deletar();

		crs.consultar();

		System.out.println(crs);
	}
}
