package com.portfoliorobles.amr.Security.Controller;
/**
 * @author Matias Robles
 */
public class Mensaje {
    private String mensaje;
    
    //Constructores

    public Mensaje() {
    }

    public Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    //Getters and setters

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
}
