/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package razas;

/**
 *
 * @author Diego Polanco
 */
public class razas {
    private int vida =0;
    private String fortaleza ="";
    private int velconstruccion =0;
  // private int fuerzamilicia=0;
    private String Nombre = "";

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setFortaleza(String fortaleza) {
        this.fortaleza = fortaleza;
    }

    public void setVelconstruccion(int velconstruccion) {
        this.velconstruccion = velconstruccion;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getFortaleza() {
        return fortaleza;
    }

    public String getNombre() {
        return Nombre;
    }
    
}
