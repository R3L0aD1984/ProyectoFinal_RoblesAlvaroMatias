package com.portfoliorobles.amr.Repository;

import com.portfoliorobles.amr.Entity.Experiencia;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Matias Robles
 */
@Repository
public interface RExperiencia extends JpaRepository<Experiencia, Integer> {
    public Optional<Experiencia> findByNombreE(String nombreE);
    public boolean existsByNombreE(String nombreE);
}
