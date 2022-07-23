package com.portfoliorobles.amr.Controller;

import com.portfoliorobles.amr.Entity.Persona;
import com.portfoliorobles.amr.Interface.IntPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Matias Robles
 */
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {
    @Autowired IntPersonaService intPersonaService;
    
    @GetMapping("/personas/traer")
    public List<Persona> getPersona(){
        return intPersonaService.getPersona();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/personas/crear")
    public String createPersona(@RequestBody Persona persona){
        intPersonaService.savePersona(persona);
        return "La persona fue creado con exito";
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/personas/borrar/(id)")
    public String deletePersona (@PathVariable Long id){
        intPersonaService.deletePersona(id);
        return "La persona fue eliminada con exito";
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/personas/editar/(id)")
    public Persona editPersona(@PathVariable Long id,
            @RequestParam("apellido") String nuevoApellido,
            @RequestParam("nombre") String nuevoNombre,
            @RequestParam("img") String nuevaImg){
        Persona persona = intPersonaService.findPersona(id);
        
        persona.setApellido(nuevoApellido);
        persona.setNombre(nuevoNombre);
        persona.setImg(nuevaImg);
        
        intPersonaService.savePersona(persona);
        return persona;
    }
    
}
