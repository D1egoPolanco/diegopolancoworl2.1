/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuartel;

/**
 *
 * @author Diego Polanco
 */
public class cuartel {
  private int vida =0;
    private String nombre =("");
    private int tropasxturno =0;
    private int oro =0;
    private int elixir =0;
    private int dark =0;
    private String nombretropa =("");

    public String getNombretropa() {
        return nombretropa;
    }

    public void setNombretropa(String nombretropa) {
        this.nombretropa = nombretropa;
    }

    public int getVida() {
        return vida;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTropasxturno() {
        return tropasxturno;
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

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTropasxturno(int tropasxturno) {
        this.tropasxturno = tropasxturno;
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
