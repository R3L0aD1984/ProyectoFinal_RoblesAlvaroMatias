package com.portfoliorobles.amr.Repository;

import com.portfoliorobles.amr.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 * @author Matias Robles
 */
@Repository
public interface IntPersona extends JpaRepository<Persona, Long>{
    
}
