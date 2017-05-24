package org.formacio.repositori;


import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgendaService {
	
	// inyectar la dependencia de la BBDD
	@Autowired
	private PersonaRepository personaRepo;

	// private Map<String, Persona> bbdd = new LinkedHashMap<>();
	
	@PostConstruct
	public void init() {
		// bbdd.put("ant", new Persona("ant","Antoni","971-555123"));
		// bbdd.put("joa", new Persona("joa","Joana","971-555555"));
		// bbdd.put("lin", new Persona("lin","Lina","971-555888"));
		// el metodo save() de la BBDD escribe la persona
		// si no existe. Si existe, pasa.
		personaRepo.save(new Persona("ant","Antoni","971-555123"));
		personaRepo.save(new Persona("joa","Joana","971-555555"));
		personaRepo.save(new Persona("lin","Lina","971-555888"));
	}
	
	public void inserta(String id, String nom, String telefon) {
		// bbdd.put(id, new Persona(id, nom, telefon));
		personaRepo.save(new Persona(id, nom, telefon));
	}
	
	public Persona recupera(String id) {
		// bbdd.get(id);
		return personaRepo.findOne(id);
	}
	
	public Long nombreContactes() {
		// bbdd.size();
		return personaRepo.count();
	}
	
	public void update(String id, String nom, String telefon){
		personaRepo.save(new Persona(id, nom, telefon));
	}
	
	public String listadoPersonas(){
		List<String> listaPersonas = new ArrayList<String>();
		for(Persona persona : personaRepo.findAll()){
			listaPersonas.add(persona.getNom());
		}
		return String.join(" ", listaPersonas);
	}
}
