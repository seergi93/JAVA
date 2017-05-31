/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.formacio.repositori;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Sergi
 */
@Service
public class GrupoService {
    
    @Autowired
    private GrupoRepository grupoRepository;
    
    public long tamany() {
        return grupoRepository.count();
    }
    
    public void crear(String nombre) {
        grupoRepository.save(new Grupo(nombre));
    }
    
    public Grupo getGrupo(String nombre) {
        return grupoRepository.findByNombre(nombre);
    }
    
    public Iterator<Grupo> getGrupos() {
        
        return grupoRepository.findAll().iterator();
    }
    
    public Boolean siExisteix(String nombre) {
        
        return grupoRepository.exists(grupoRepository.findByNombre(nombre).getId());
        
    }

    public void eliminarGrups() {
        grupoRepository.deleteAll();
    }
    
    public void eliminarGrup(String nombre) {
        grupoRepository.delete(grupoRepository.findByNombre(nombre));
        
    }
}
