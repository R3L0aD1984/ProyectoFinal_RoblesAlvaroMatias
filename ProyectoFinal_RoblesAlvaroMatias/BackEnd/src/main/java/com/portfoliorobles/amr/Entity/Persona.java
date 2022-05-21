package com.portfoliorobles.amr.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
/**
 * @author Matias Robles
 */
@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min = 2, max = 50, message = "Ingrese 2 caracteres minimo y como maximo 50 caracteres")
    private String apellido;
    
    @NotNull
    @Size(min = 2, max = 50, message = "Ingrese 2 caracteres minimo y como maximo 50 caracteres")
    private String nombre;
    
    @Size(min = 2, max = 50, message = "Ingrese 2 caracteres minimo y como maximo 50 caracteres")
    private String img;
}
