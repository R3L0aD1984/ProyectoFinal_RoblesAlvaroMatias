package com.portfoliorobles.amr.Security.Repository;

import com.portfoliorobles.amr.Security.Entity.Rol;
import com.portfoliorobles.amr.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Matias Robles
 */
@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
