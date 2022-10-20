package br.com.voeairlines.dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import br.com.voeairlines.model.Aeronave;
import br.com.voeairlines.model.Usuario;

public class AeronaveDAO {

	public void inserirAeronave(Aeronave aeronave) {

		String sql = "INSERT INTO AERONAVE (fabricante, modelo, codigo)VALUES(?, ?, ?)";

		Connection con = new Conexao().conexao();
		try {

			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, aeronave.getFabricante());
			stm.setString(2, aeronave.getModelo());
			stm.setString(3, aeronave.getCodigo());

			stm.execute();

			JOptionPane.showMessageDialog(null, "Aeronave foi cadastrada");

			stm.close();
			con.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public void atualizarAeronave(Aeronave aeronave) {

	}

	public void deletarAeronave(Aeronave aeronave) {

	}

	public void selecionarAeronave(Aeronave aeronave) {
	}

}
