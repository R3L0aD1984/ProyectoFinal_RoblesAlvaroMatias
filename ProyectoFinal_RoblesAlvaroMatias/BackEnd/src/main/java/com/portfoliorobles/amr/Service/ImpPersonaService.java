package com.portfoliorobles.amr.Service;

import com.portfoliorobles.amr.Entity.Persona;
import com.portfoliorobles.amr.Interface.IntPersonaService;
import com.portfoliorobles.amr.Repository.IntPersona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author Matias Robles
 */
@Service
public class ImpPersonaService implements IntPersonaService{
    @Autowired IntPersona intPersona;

    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = intPersona.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        intPersona.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        intPersona.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona = intPersona.findById(id).orElse(null);
        return persona;
    }
    
}
