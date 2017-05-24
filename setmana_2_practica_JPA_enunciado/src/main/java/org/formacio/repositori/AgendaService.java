package org.formacio.repositori;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class AgendaService {
    
        @Autowired
        private PersonaRepositori personaRepo;

	// private Map<String, Persona> bbdd = new LinkedHashMap<>();
	
	@PostConstruct
	public void init() {
		// bbdd.put("ant", new Persona("ant","Antoni","971-555123"));
		// bbdd.put("joa", new Persona("joa","Joana","971-555555"));
		// bbdd.put("lin", new Persona("lin","Lina","971-555888"));
                
                personaRepo.save(new Persona("ant","Antoni","971-555123"));
                personaRepo.save(new Persona("joa","Joana","971-555555"));
                personaRepo.save(new Persona("lin","Lina","971-555888"));
	}
        
        
	
	public void inserta (String id, String nom, String telefon) {
		 // bbdd.put(id, new Persona(id, nom, telefon));        
                 personaRepo.save(new Persona(id, nom, telefon));
        }
	
	public Persona recupera (String id) {
		// return bbdd.get(id);
                return personaRepo.findOne(id);
	}
	
	public long nombreContactes() {
		// return bbdd.size();
                return personaRepo.count();
	}
}
