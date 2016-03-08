package project;

import project.Aluno;;

public class AlunoTeste 
{
	public static void main(String[] args) 
	{
		//Cliente cliente = new Cliente(3, "Bela Lugosi", null);
		Aluno aln = new Aluno(0,"Nome","3100622588","Rua do Joca,12","email@email.com",1114445559,33556699);
		//cliente.criar();
		aln.cadastrar();
		//cliente.carregar();
		aln.consultar();
		//System.out.println(cliente);
		System.out.println(aln);
		//cliente.setFone("123123333");
		aln.setNome("NovoNome");
		//cliente.atualizar();
		aln.alterar();
		//cliente.carregar();
		aln.consultar();
		/*System.out.println(cliente);*/
		System.out.println(aln);
		//cliente.excluir();
		aln.deletar();
		//cliente.carregar();
		aln.consultar();
		//System.out.println(cliente);
		System.out.println(aln);
	}
}
