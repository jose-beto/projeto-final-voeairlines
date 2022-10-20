package br.com.voeairlines.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Conexão com o banco de dados
 * 
 * @author Humberto
 * @version 1.1
 */

public class Conexao {

	/**
	 * Método responsavel pela conexão com o banco
	 * 
	 * @return conexão
	 */

	public Connection conexao() {

		Connection con = null;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

		} catch (ClassNotFoundException e) {

			e.printStackTrace();

		}
		try {

			con = DriverManager.getConnection(
					"jdbc:mysql://localhost/lojavoeairlines?useTimezone=true&serverTimezone=UTC", "root", "root");

		} catch (SQLException e) {

			e.printStackTrace();

		}

		return con;
	}

}
