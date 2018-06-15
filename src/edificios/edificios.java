/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edificios;

/**
 *
 * @author Diego Polanco
 */
public class edificios {
    private int vida =0;
  private String nombre =("");
    private String razaconstructora =("");
    private int oro=0;
     private int elixir =0;
    private int dark =0;
    private int generador=0;
    public int getVida() {
        return vida;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRazaconstructora() {
        return razaconstructora;
    }

    public int getOro() {
        return oro;
    }

    public int getElixir() {
        return elixir;
    }

    public int getDark() {
        return dark;
    }
  

    public int getGenerador() {
        return generador;
    }

    public void setGenerador(int generador) {
        this.generador = generador;
    }

   
    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRazaconstructora(String razaconstructora) {
        this.razaconstructora = razaconstructora;
    }
     public void setOro(int oro) {
        this.oro = oro;
    }

    public void setElixir(int elixir) {
        this.elixir = elixir;
    }

    public void setDark(int dark) {
        this.dark = dark;
    }
   

}
