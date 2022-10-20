package br.com.voeairlines.model;

import br.com.voeairlines.dao.AeronaveDAO;
import br.com.voeairlines.dao.UsuarioDAO;


/**
 * classe que representa aeronave dentro do  projeto
 * @author Humberto
 *@category
 *
 *
 */

public class Aeronave {
	
	private Integer id;
	private String fabricante;
	private String modelo;
	private  String codigo;
	
	public Aeronave(Integer id) {
		super();
		this.id = id;
		
	}
	
	public Aeronave( String fabricante, String modelo, String codigo) {
		super();
		
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.codigo = codigo;
	}
	public Aeronave(Integer id, String fabricante, String modelo, String codigo) {
		super();
		this.id = id;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.codigo = codigo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public void inserirAeronave(Aeronave aeronave) {

		new AeronaveDAO().inserirAeronave(aeronave);
	}

	public void atualizarUsuario(Aeronave aeronave) {

		new AeronaveDAO().atualizarAeronave(aeronave);

	}

	public void deletarUsuario(Aeronave aeronave) {

		new AeronaveDAO().deletarAeronave(aeronave);

	}

	public void selecionarUsuario(Aeronave aeronave) {

		new AeronaveDAO().selecionarAeronave(aeronave);

	}
	

}
