package daoAluno;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import toAluno.AlunosTO;
import acessoAC.AcessoDB;

public class AlunosDAO 
{
	public void cadastrar(AlunosTO to) 
	{
		String query = "insert into alunos(nome, rg, cpf, logradouro, email, telefone) values (?,?,?,?,?,?)";
		try(Connection conn = AcessoDB.openConnection();PreparedStatement stmt = conn.prepareStatement(query);) 
		{
			stmt.setString(1,to.getNome());
			stmt.setString(2,to.getRg());
			stmt.setString(3,to.getCpf());
			stmt.setString(4,to.getEnd());
			stmt.setString(5,to.getEmail());
			stmt.setString(6,to.getTel());
			stmt.execute();
			
			String sqlSelect = "select LAST_INSERT_ID()";
			try(PreparedStatement pst1 = conn.prepareStatement(sqlSelect);
			ResultSet rs = pst1.executeQuery();){
			if(rs.next()){
			int idGerado = rs.getInt(1);
			}
			} catch (SQLException e) {
			e.printStackTrace();
			}
			//stmt.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public AlunosTO consultar(int id)
	{
		AlunosTO to = new AlunosTO();
	    String query = "select nome, rg, cpf, logradouro, email, telefone from alunos where id=?";
	    try(Connection conn = AcessoDB.openConnection();PreparedStatement stmt = conn.prepareStatement(query);)
	    {	         
	    	stmt.setInt(1,id);
	    	try(ResultSet rs = stmt.executeQuery();)
	    	{    
	    		if(rs.next())
	    		{
	    			//to.setId(rs.getInt("id"));	    			
		            to.setNome(rs.getString("nome"));
		            to.setRg(rs.getString("rg"));
		            to.setCpf(rs.getString("cpf"));
		            to.setEnd(rs.getString("logradouro"));
		            to.setEmail(rs.getString("email"));
		            to.setTel(rs.getString("telefone"));
	    		}
	    	}
	    	catch(SQLException e)
	    	{
	    		e.printStackTrace();
	    	}
	    }
	    catch(SQLException e)
	    {
	    	e.printStackTrace();
	    }                
	    return to;
	}
	
	public void alterar (AlunosTO to)
	{
		String query = "update alunos set nome = ?, rg = ?, cpf = ?, logradouro = ? , email = ?, telefone = ? where id = ?";
		try(Connection conn = AcessoDB.openConnection(); PreparedStatement stmt = conn.prepareStatement(query);) 
		{
			stmt.setString(1,to.getNome());
			stmt.setString(2,to.getRg());
			stmt.setString(3,to.getCpf());
			stmt.setString(4,to.getEnd());
			stmt.setString(5,to.getEmail());
			stmt.setString(6,to.getTel());
			stmt.setInt(7,to.getId());			
			stmt.execute();
			//stmt.close();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public void deletar(AlunosTO to)
	{
		String query = "delete from alunos where id = ?";
		try(Connection conn = AcessoDB.openConnection(); PreparedStatement stmt = conn.prepareStatement(query);)
		{
	         stmt.setInt(1,to.getId());
	         stmt.execute();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
