package com.portfoliorobles.amr.Security.Service;

import com.portfoliorobles.amr.Security.Entity.Rol;
import com.portfoliorobles.amr.Security.Enums.RolNombre;
import com.portfoliorobles.amr.Security.Repository.IRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Matias Robles
 */
@Service
@Transactional
public class RolService {
    @Autowired
    IRolRepository irolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return irolRepository.findByRolNombre(rolNombre);
    }
    
    public void save(Rol rol){
        irolRepository.save(rol);
    }
}
