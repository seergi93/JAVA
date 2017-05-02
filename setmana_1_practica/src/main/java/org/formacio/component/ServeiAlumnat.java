package org.formacio.component;

import org.springframework.stereotype.Component;

@Component
public class ServeiAlumnat {

    RepositoriAlumnesMemoria memoria = new RepositoriAlumnesMemoria();

    /**
     * ha de donar d'alta a la base de dades d'alumnes l'alumne indicat amb el
     * corresponent codi. Si el nom de l'alumne es null, no l'ha de donar d'alta
     * Retorna true si l'alumne s'ha inserit, false si no.
     */
    public boolean matricula(int id, String alumne) {
        if (alumne != null) {
            memoria.altaAlumne(id, alumne);
            return true;
        } else {
            return false;
        }

    }

}
