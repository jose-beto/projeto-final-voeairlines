package br.com.voeairlines.controller;

import br.com.voeairlines.model.AeronaveTipo;
import br.com.voeairlines.model.Usuario;

public class AeronaveTipoController {

public boolean validarAeronaveTipo(String aeronave ){
		
		
	AeronaveTipo  val = new  AeronaveTipo(aeronave);
		
		val.validarAeronaveTipo(val);
		
		return true;
		
	}
  
public boolean inserirAeronaveTipo(String aeronave) {
		
		
	AeronaveTipo  val = new  AeronaveTipo(aeronave);
		
		val.inserirAeronaveTipo(val);
		
		return true;
		
	}
	
}

