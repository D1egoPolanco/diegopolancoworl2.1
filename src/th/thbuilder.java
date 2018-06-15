/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th;

/**
 *
 * @author Diego Polanco
 */
public abstract class thbuilder {
    protected th TH;
    public th getth (){
       return TH; 
}
    public void crearnuevoth(){
        TH= new th ();
    }
    public abstract void buildVida();
    public abstract void buildAlmacenoro();
    public abstract void buildAlmacenelixir();
    public abstract void buildAlmacendar();
    public abstract void buildVelConstruc();
    public abstract void buildNombre();
    public abstract void buildoro();
    public abstract void buildelixir();
    public abstract void builddark();
}
