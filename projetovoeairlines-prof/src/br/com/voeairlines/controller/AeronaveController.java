package br.com.voeairlines.controller;

import br.com.voeairlines.model.Aeronave;
import br.com.voeairlines.model.Usuario;

public class AeronaveController {

public boolean inserirAeronave(String fabricante, String modelo,  String codigo) {
		
		
		Aeronave  aeronave= new  Aeronave(fabricante, modelo, codigo);
		
		aeronave.inserirAeronave(aeronave);
		
		return true;
		
	}
	
}
