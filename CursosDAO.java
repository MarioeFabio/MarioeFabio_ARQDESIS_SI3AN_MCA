package Projeto1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CursosDAO
{
	public void cadastrar(CursosTO to) 
	{
		String query = "insert into curso(codigo, nome, data_inicio, data_termino, horario, vagas, valor, numero_laboratorio, registro_software, material, livros) values (?,?,?,?,?,?,?,?,?,?,?)";
		try(Connection conn = AcessoDB.openConnection();PreparedStatement stmt = conn.prepareStatement(query);) 
		{
			stmt.setString(1, to.getCod());
			stmt.setString(2, to.getNome());
			stmt.setString(3, to.getDataIni());
			stmt.setString(4, to.getDataTer());
			stmt.setString(5, to.getHorario());
			stmt.setInt(6, to.getVagas());
			stmt.setDouble(7, to.getValor());
			stmt.setString(8, to.getNumLab());
			stmt.setString(9, to.getRegSoft());
			stmt.setString(10, to.getMaterial());
			stmt.setString(11, to.getLivro());
			stmt.execute();
			//stmt.close();

		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	public CursosTO consultar(String cod) 
	{
		CursosTO to  = new CursosTO();
		String query = "select codigo, nome, data_inicio, data_termino, horario, vagas, valor, numero_laboratorio, registro_software, material, livros from curso where codigo = ?";
		try(Connection conn = AcessoDB.openConnection();PreparedStatement stmt = conn.prepareStatement(query);) 
		{
			stmt.setString(1, cod);
			try(ResultSet rs = stmt.executeQuery();)
			{
				if (rs.next()) 
				{
					to.setCod(rs.getString("codigo"));
					to.setNome(rs.getString("nome"));
					to.setDataIni(rs.getString("data_inicio"));
					to.setDataTer(rs.getString("data_termino"));
					to.setHorario(rs.getString("horario"));
					to.setVagas(rs.getInt("vagas"));
					to.setValor(rs.getDouble("valor"));
					to.setNumLab(rs.getString("numero_laboratorio"));
					to.setRegSoft(rs.getString("registro_software"));
					to.setMaterial(rs.getString("material"));
					to.setLivro(rs.getString("livros"));
				}
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	    return to;

		/*dados = "########## Dados Do Curso ##########" + "\n\nCodigo: " + cod
				+ "\nCurso: " + nome + "\nData Inicial: " + dataIni
				+ "\nData Termino: " + dataTer + "\nHorario: " + horario
				+ "\nVagas: " + vagas + "\nValor: " + valor
				+ "\nNumero de Laboratorio: " + numLab
				+ "\nRegistro de Software: " + regSoft + "\nMaterial: "
				+ material + "\nLivro: " + livro;*/
	}

	public void alterar(CursosTO to) 
	{
		String query = "update curso set nome = ?, data_inicio = ?, data_termino =? , horario = ?, vagas = ?, valor = ?, numero_laboratorio = ?, registro_software = ?, material = ?, livros = ? where codigo = ?";
		try(Connection conn = AcessoDB.openConnection();PreparedStatement stmt = conn.prepareStatement(query);) 
		{
			stmt.setString(1,to.getNome());
			stmt.setString(2,to.getDataIni());
			stmt.setString(3,to.getDataTer());
			stmt.setString(4,to.getHorario());
			stmt.setInt(5,to.getVagas());
			stmt.setDouble(6,to.getValor());
			stmt.setString(7,to.getNumLab());
			stmt.setString(8,to.getRegSoft());
			stmt.setString(9,to.getMaterial());
			stmt.setString(10,to.getLivro());
			stmt.setString(11,to.getCod());
			stmt.execute();
			//stmt.close();

		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	public void deletar(CursosTO to) 
	{
		String query = "delete from curso where codigo = ?";
		try(Connection conn = AcessoDB.openConnection();PreparedStatement stmt = conn.prepareStatement(query);) 
		{
			stmt.setString(1,to.getCod());
			stmt.execute();
			//stmt.close();

		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
