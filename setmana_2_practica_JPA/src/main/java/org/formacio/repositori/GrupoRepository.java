/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.formacio.repositori;

import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Sergi
 */
public interface GrupoRepository extends CrudRepository<Grupo, Integer> {

    public Grupo findByNombre(String nombre);
    
    

}
