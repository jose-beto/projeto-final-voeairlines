package br.com.voeairlines.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.voeairlines.model.Aeronave;

public class AeronaveTipoDAO {

	public void save(AeronaveTipoDAO aeronave) {

		String sql = "INSERT INTO tipoaeronave(descricao)VALUES(?)";

		Connection con = new Conexao().conexao();
		try {

			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, aeronave.getAeronave());

			stm.execute();

			JOptionPane.showMessageDialog(null, "Aeronave foi cadastrada");

			stm.close();
			con.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	

	private String getAeronave() {
		
		return null;
	}



	public void atualizarAeronave(Aeronave aeronave) {

	}

	public void deletarAeronave(Aeronave aeronave) {

	}

	public void selecionarAeronave(Aeronave aeronave) {
	}

}
