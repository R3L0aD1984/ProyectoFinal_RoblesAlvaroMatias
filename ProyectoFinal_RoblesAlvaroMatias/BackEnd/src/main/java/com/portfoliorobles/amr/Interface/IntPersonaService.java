
package com.portfoliorobles.amr.Interface;

import com.portfoliorobles.amr.Entity.Persona;
import java.util.List;
/**
 *
 * @author Matias Robles
 */
public interface IntPersonaService {
    public List<Persona> getPersona();   //Trae una lista de Persona
    
    public void savePersona(Persona persona);    //Guarda una Persona
      
    public void deletePersona(Long id);         //Busca por id para eliminar una persona
    
    public Persona findPersona(Long id);           //Busca por id una Persona
}
