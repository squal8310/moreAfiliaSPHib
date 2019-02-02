package org.moreafilia.app.rest;

import org.moreafilia.app.model.Afiliacion;
import org.moreafilia.app.service.IAfiliacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AfiliacionRestController {
	
	@Autowired
	private IAfiliacionService afiliaService;
	
	@PostMapping(value="/afiliacion")
	public ResponseEntity<String> afiliacion(@RequestBody Afiliacion afiliacion){
		afiliaService.afiliacion(afiliacion);
		return new ResponseEntity<String>(new String("Se agrego la afiliación"), HttpStatus.OK);
	} 

	@GetMapping(value="/sirve")
	public  ResponseEntity<String> funciona(){
		return new ResponseEntity<String>(new String("Hola, si sirve caon"), HttpStatus.OK);
	}
}
