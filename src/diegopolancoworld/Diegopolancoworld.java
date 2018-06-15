/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diegopolancoworld;

import edificios.directoredificio;
import edificios.edificios;
import edificios.elixir2edificiobuilder;
import java.util.Random;
import java.util.Scanner;

import razas.*;
import edificios.*;
import cuartel.*;
import th.*;
import vehiculos.*;
import cuartel.*;
/**
 *
 * @author Diego Polanco
 */
public class Diegopolancoworld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre1,nombre2;                   
         int opc = 0,turno = 0,raza1 ,raza2,perdedor=0,orot=0,orot1=0,elixirt=0,elixirt1=0,darkt=0,darkt1=0,costO=0,costoE=0,costoD=0;
         
         edificios [] creaciones;//ceacion arreglo para gujardar las edificaciones creadas
         creaciones =new edificios[6];//x2
         cuartel [] cuartel1=new cuartel[1];
         edificios [] creaciones2;//ceacion arreglo para gujardar las edificaciones creadas
         creaciones2 =new edificios[6];//x2
         cuartel [] cuartel2=new cuartel[1];
              directorth th1 = new directorth();
th1thbuilder thh=new th1thbuilder();
th1.setthBuilder(thh);
th1.crearth();
th TH1= th1.getTh();
th1.crearth();
th TH2= th1.getTh();

directorcuartel cartel = new directorcuartel();
nivel1cuartelbuilder cuart = new nivel1cuartelbuilder();
cartel.setCuartelBuilder(cuart);
cartel.crearcuartel();
cuartel CUARTEL11 = cartel.getCuartel();
cuartel CUARTEL12 = cartel.getCuartel();

//nivel1cuartelbuilder cuartellv1= nivel1cuartelbuilder();
directoredificio EDIF=new directoredificio();
oroedificiobuilder oro=new oroedificiobuilder();
EDIF.setEdificioBuilder(oro);
EDIF.crearedificio();
edificios ORO11 = EDIF.getEdificios();
edificios ORO12 = EDIF.getEdificios();

elixiredificiobuilder elix = new elixiredificiobuilder();
EDIF.setEdificioBuilder(elix);
EDIF.crearedificio();
edificios ELIXIR11= EDIF.getEdificios();
edificios ELIXIR12= EDIF.getEdificios();//aSI CADA EDIFICIO

darkelixiredificiobuilder darks = new darkelixiredificiobuilder();
EDIF.setEdificioBuilder(darks);
EDIF.crearedificio();
edificios DARK11= EDIF.getEdificios();
edificios DARK12= EDIF.getEdificios();//aSI CADA EDIFICIO

oro2edificioBuilder ORO2 = new oro2edificioBuilder();
EDIF.setEdificioBuilder(ORO2);
EDIF.crearedificio();
edificios ORO21= EDIF.getEdificios();
edificios ORO22= EDIF.getEdificios();//aSI CADA EDIFICIO

elixir2edificiobuilder elix2 = new elixir2edificiobuilder();
EDIF.setEdificioBuilder(elix2);
EDIF.crearedificio();
edificios ELIXIR21= EDIF.getEdificios();
edificios ELIXIR22= EDIF.getEdificios();//aSI CADA EDIFICIO

darkelixir2edificiobuilder darks2 = new darkelixir2edificiobuilder();
EDIF.setEdificioBuilder(darks2);
EDIF.crearedificio();
edificios DARK21= EDIF.getEdificios();
edificios DARK22= EDIF.getEdificios();//aSI CADA EDIFICIO

oro3edificioBuilder oro3 = new oro3edificioBuilder();
EDIF.setEdificioBuilder(oro3);
EDIF.crearedificio();
edificios ORO31= EDIF.getEdificios();
edificios ORO32= EDIF.getEdificios();//aSI CADA EDIFICIO

elixir3edificiobuilder elix3 = new elixir3edificiobuilder();
EDIF.setEdificioBuilder(elix3);
EDIF.crearedificio();
edificios ELIXIR31= EDIF.getEdificios();
edificios ELIXIR32= EDIF.getEdificios();//aSI CADA EDIFICIO

darkelixir3edificiobuilder darks3 = new darkelixir3edificiobuilder();
EDIF.setEdificioBuilder(darks3);
EDIF.crearedificio();
edificios DARK31= EDIF.getEdificios();
edificios DARK32= EDIF.getEdificios();//aSI CADA EDIFICIO
//creacion de cuarteles

                                   
         
        Scanner teclado=new Scanner(System.in);
       System.out.println("Bienvenido a DiegoPolanco World");
       System.out.println("Historia del juego");
       System.out.println("A lo largo de la historia las tres razas del Diego´s world habian estado en paz, todo cambio cuando decidieron buscar la supremacia del mundo, los gigantes de las montañas empezaron a prepararse para la llegada de sayayis del espacio y para espartanos encabezados por kratos estas razas lucharan entre sei para buscar el dominio ");
       System.out.println("Ingrese nombre jugador 1");
       nombre1=teclado.next();
       System.out.println(" Selecciona turaza "+nombre1+" y preparate para la batalla!!!!!!!");
      
      raza1=0;
        while(raza1 >=0 ){
              elegirraza();
              raza1 = teclado.nextInt();
               //Creacion de las razas
            switch (raza1) {
                case 1:
                    directorraza sayayin1=new directorraza();
                    sayayingrazabuilder saya=new sayayingrazabuilder();
                    sayayin1.setRazaBuilder(saya);
                    raza1 = -1;
                    break;
                case 2:
                    directorraza gigant1 = new directorraza();
                    gigantesrazabuilder giga=new gigantesrazabuilder();
                    gigant1.setRazaBuilder(giga);
                    raza1 = -1;
                    break;
                case 3:
                    directorraza espartan1 = new directorraza();
                    espartanorazabuilder esparta = new espartanorazabuilder();
                    espartan1.setRazaBuilder(esparta);
                    raza1 = -1;
                    break;
                default:
                    System.out.println("Ingresa una opcion valida plox\n");
                    break;
            }
          }
                  
             
       System.out.println("Ingrese nombre jugador 2");
              nombre2=teclado.next();
              System.out.println(" Selecciona tu raza "+nombre2+" y preparate para la batalla!!!!");
                            raza2 = 0;
          while(raza2 >=0 ){
              elegirraza();
              raza2 = teclado.nextInt();
              
            switch (raza2) {
                case 1:
                    directorraza sayayin1=new directorraza();
                    sayayingrazabuilder saya=new sayayingrazabuilder();
                    sayayin1.setRazaBuilder(saya);
                    raza2 = -1;
                    break;
                case 2:
                    directorraza gigant1 = new directorraza();
                    gigantesrazabuilder giga=new gigantesrazabuilder();
                    gigant1.setRazaBuilder(giga);
                    raza2 = -1;
                    break;
                case 3:
                    directorraza espartan1 = new directorraza();
                    espartanorazabuilder esparta = new espartanorazabuilder();
                    espartan1.setRazaBuilder(esparta);
                    raza2 = -1;
                    break;
                default:
                    System.out.println("Ingresa una opcion valida plox\n");
                    break;
            }
       
          }
         Random aleatorio = new Random(System.currentTimeMillis());//funcion para hacerlo aleatorio 
int intAletorio = aleatorio.nextInt(2);
if     (intAletorio==0 ){
    turno=1;
    
    } else {turno=2;
        }    
System.out.println("el jugador que iniciara es el numero "+turno);
 while (turno!=0){
  while (turno==1){
      orot=0;elixirt=0;darkt=0;
           System.out.println("__________________________________");
      System.out.println("turno de jugador "+nombre1);
      
          
 opc = 0;
          while(opc >=0 ){
             orot= TH1.getOro();
      elixirt = TH1.getElixir();
      darkt = TH1.getDark();
      
      
System.out.println("ORO Disponible:" +orot + "  Elixir Disponible:" +elixirt+  " DARK Disponible: "+ darkt);    
              menu();
              
              opc = teclado.nextInt();
              int opc1=0;
            switch (opc) {
                case 1:
                           
                           //System.out.println(creaciones[0].getNombre());
                          while(opc1 >=0){
                              menu1();
                           opc1=teclado.nextInt();
                           switch(opc1){
                               case 0:
                                  // menu();
                                   opc1=-1;
                                   break;
                               case 1://Creacion del recolector de oro
                                   costO= ORO11.getOro();costoE=ORO11.getElixir();costoD=ORO11.getDark();
                                   
                                   
                                   if ( (orot >= costO)&& (elixirt >= costoE) && (darkt >= costoD))
                                   {//comparacion de recursos existententes en el centro de mando
                                       orot=orot-costO;
                                       elixirt=elixirt-costoE;
                                       darkt=darkt-costoD;
                                       TH1.setOro(orot);
                                   TH1.setElixir(elixirt);
                                  TH1.setDark(darkt);
                                   orot= TH1.getOro();
                                   elixirt = TH1.getElixir();
                                   darkt = TH1.getDark();
                                   //mnsj creado
                                   creaciones[0]=ORO11;
                                   System.out.println("Usted ha creado satisfactoriamente el edificio");
                                  System.out.println("-2500 oro");
                                  System.out.println("-1000 Elixir");
                                  System.out.println("-0 Elixir oscuro (Dark)");
                                   }
                                   else {
                                       System.out.println("USTED NO TIENE SUFICIENTES RECURSOS PARA CONSTRUIR ");
                                       
                                   }
                                  
                                   
                                   
                                   break;
                               case 2://Creacion de recolector de elixir nivel2
                                    costO= ELIXIR11.getOro();costoE=ELIXIR11.getElixir();costoD=ELIXIR11.getDark();
                                   
                                   
                                   if ( (orot >= costO)&& (elixirt >= costoE) && (darkt >= costoD))
                                   {
                                       orot=orot-costO;
                                       elixirt=elixirt-costoE;
                                       darkt=darkt-costoD;
                                       TH1.setOro(orot);
                                   TH1.setElixir(elixirt);
                                  TH1.setDark(darkt);
                                   orot= TH1.getOro();
                                   elixirt = TH1.getElixir();
                                   darkt = TH1.getDark();
                                   //mnsj creado
                                   creaciones[1]=ELIXIR11;//MODIFICADO
                                   System.out.println("Usted ha creado satisfactoriamente el edificio");
                                  System.out.println("-2500 oro");
                                  System.out.println("-1000 Elixir");
                                  System.out.println("-0 Elixir oscuro (Dark)");
                                   }
                                   else {
                                       System.out.println("USTED NO TIENE SUFICIENTES RECURSOS PARA CONSTRUIR ");
                                       
                                   }
                                  
                           
                           
                                   break;
                               case 3://Creacion de recolector de dark
                                    costO= DARK11.getOro();costoE=DARK11.getElixir();costoD=DARK11.getDark();
                                   
                                   
                                   if ( (orot >= costO)&& (elixirt >= costoE) && (darkt >= costoD))
                                   {
                                       orot=orot-costO;
                                       elixirt=elixirt-costoE;
                                       darkt=darkt-costoD;
                                       TH1.setOro(orot);
                                   TH1.setElixir(elixirt);
                                  TH1.setDark(darkt);
                                   orot= TH1.getOro();
                                   elixirt = TH1.getElixir();
                                   darkt = TH1.getDark();
                                   //mnsj creado
                                   creaciones[2]=DARK11;//MODIFICADO
                                   System.out.println("Usted ha creado satisfactoriamente el edificio");
                                  System.out.println("-1200 oro");
                                  System.out.println("-1200 Elixir");
                                  System.out.println("-900 Elixir oscuro (Dark)");
                                   }
                                   else {
                                       System.out.println("USTED NO TIENE SUFICIENTES RECURSOS PARA CONSTRUIR ");
                                       
                                   }
                                  
                           
                           
                                   break;
                               case 4://Creacion de cuartel
                                   costO= CUARTEL11.getOro();costoE=CUARTEL11.getElixir();costoD=CUARTEL11.getDark();
                                   
                                   
                                   if ( (orot >= costO)&& (elixirt >= costoE) && (darkt >= costoD))
                                   {
                                       orot=orot-costO;
                                       elixirt=elixirt-costoE;
                                       darkt=darkt-costoD;
                                       TH1.setOro(orot);
                                   TH1.setElixir(elixirt);
                                  TH1.setDark(darkt);
                                   orot= TH1.getOro();
                                   elixirt = TH1.getElixir();
                                   darkt = TH1.getDark();
                                   //mnsj creado
                                   cuartel1[0]=CUARTEL11;//MODIFICADO
                                   System.out.println("Usted ha creado satisfactoriamente el edificio");
                                   System.out.println("-1000 oro");
                                  System.out.println("-1000 Elixir");
                                  System.out.println("-0 Elixir oscuro (Dark)");
                                   }
                                   else {
                                       System.out.println("USTED NO TIENE SUFICIENTES RECURSOS PARA CONSTRUIR ");
                                       
                                   }
                                   break;
                           }
                           }
                    opc = -1;
                    break;
                case 2:
                System.out.println("Que edificacion desea atacar ?");
//Aqui se pueden ver los edificios creados por el rival para atacarlos
                int x=0;
                    for(int i = 0;i<4;i=i+1 )
                    {
                        if (creaciones2[i]!=null)
                        {
                            System.out.println((i+1)+". "+creaciones2[i].getNombre());
                            
                            }
                        else 
                            x++;
                        }
                    if(cuartel2[0]!=null)
                        System.out.println((4-x)+". "+cuartel2[0].getNombre());
                    else
                        x++;
                    
                    if (x==4)
                        System.out.println("1. "+TH2.getNombre());
                    
                    int ataque = 0;
                            ataque=teclado.nextInt();
                            switch (ataque){
                                case 1:
                                    //ESPACIO PARA LA PROXIMA ACTUALIZACION DEL JUEGO
                                    System.out.println("DEBES COMPRAR EL JUEGO COMPLETO PARA SEGUIR JUGANDO");
                                    break;
                                case 2:
                                    break;
                    }
                    opc = -1;
                    break;
                 
                   
                case 3:
                    //ESPACIO PARA LA PROXIMA ACTUALIZACION DEL JUEGO
                                    System.out.println("DEBES COMPRAR EL JUEGO COMPLETO PARA SEGUIR JUGANDO");
                   System.out.println("ATACAR A estos guerreros enemigos...............");
                    break;
                case 4:
                    turno=2;
                    
                        if (creaciones2[0]!=null)
                        {
                           TH2.setOro((TH2.getOro())+creaciones2[0].getGenerador());
                            
                            }
                        if (creaciones2[1]!=null)
                        {
                           TH2.setElixir((TH2.getElixir())+creaciones2[1].getGenerador());
                            
                            }
                        if (creaciones2[2]!=null)
                        {
                           TH2.setDark((TH2.getDark())+creaciones2[2].getGenerador());
                            
                            }
                        if (cuartel2[0]!=null)
                        {
                           CUARTEL12.setTropasxturno((CUARTEL12.getTropasxturno())+1000);
                            
                            }
                        
                        
                    opc=-1;
                    break;
                case 5:
                    perdedor = 1;
                    opc=-1;
                    turno =0;
                    break;
                default:
                    System.out.println("Ingresa una opcion valida plox\n");
                    break;
            }
  }
      

          }
     while(turno==2){
         orot=0;elixirt=0;darkt=0;
         System.out.println("__________________________________");
      System.out.println("Turno del jugador "+nombre2);
     
            

     
 opc = 0;
          while(opc >=0 ){
             orot= TH2.getOro();
      elixirt = TH2.getElixir();
      darkt = TH2.getDark();
      System.out.println("ORO Disponible:" +orot + "  Elixir Disponible:" +elixirt+  " DARK Disponible:"+ darkt);
              menu();
              
              opc = teclado.nextInt();
              int opc1=0;
            switch (opc) {
                case 1:
                    //Aqui SE CONSTRUYEN LOS EDIFICIOS                                   
                           
                          while(opc1 >=0){
                              menu1();
                           opc1=teclado.nextInt();
                           switch(opc1){
                               case 0:
                                   opc1= -1;
                                   
                                   break;
                               case 1:
                                    costO= ORO12.getOro();costoE=ORO12.getElixir();costoD=ORO12.getDark();
                                   
                                   
                                   if ( (orot >= costO)&& (elixirt >= costoE) && (darkt >= costoD))
                                   {
                                       orot=orot-costO;
                                       elixirt=elixirt-costoE;
                                       darkt=darkt-costoD;
                                       TH2.setOro(orot);
                                   TH2.setElixir(elixirt);
                                  TH2.setDark(darkt);
                                   orot= TH2.getOro();
                                   elixirt = TH2.getElixir();
                                   darkt = TH2.getDark();
                                   //mnsj creado
                                   creaciones2[0]=ORO12;//modificacion
                                   System.out.println("Usted ha creado satisfactoriamente el edificio");
                                  
                                   }
                                   else {
                                       System.out.println("USTED NO TIENE SUFICIENTES RECURSOS PARA CONSTRUIR ");
                                       
                                   }
                                  
                                   
                                   
                                   break;
                                  
                                   
                                  
                               case 2:
                                   
                                           costO= ELIXIR12.getOro();costoE=ELIXIR12.getElixir();costoD=ELIXIR12.getDark();
                                   
                                   
                                   if ( (orot >= costO)&& (elixirt >= costoE) && (darkt >= costoD))
                                   {
                                       orot=orot-costO;
                                       elixirt=elixirt-costoE;
                                       darkt=darkt-costoD;
                                       TH2.setOro(orot);
                                   TH2.setElixir(elixirt);
                                  TH2.setDark(darkt);
                                   orot= TH2.getOro();
                                   elixirt = TH2.getElixir();
                                   darkt = TH2.getDark();
                                   //mnsj creado
                                   creaciones2[1]=ELIXIR12;//modificacion
                                   System.out.println("Usted ha creado satisfactoriamente el edificio");
                                  
                                   }
                                   else {
                                       System.out.println("USTED NO TIENE SUFICIENTES RECURSOS PARA CONSTRUIR ");
                                       
                                   }                                                                                                       
                                   break;
                               case 3:
                                             costO= DARK12.getOro();costoE=DARK12.getElixir();costoD=DARK12.getDark();
                                   
                                   
                                   if ( (orot >= costO)&& (elixirt >= costoE) && (darkt >= costoD))
                                   {
                                       orot=orot-costO;
                                       elixirt=elixirt-costoE;
                                       darkt=darkt-costoD;
                                       TH2.setOro(orot);
                                   TH2.setElixir(elixirt);
                                  TH2.setDark(darkt);
                                   orot= TH2.getOro();
                                   elixirt = TH2.getElixir();
                                   darkt = TH2.getDark();
                                   //mnsj creado
                                   creaciones2[2]=DARK12;//modificacion
                                   System.out.println("Usted ha creado satisfactoriamente el edificio");
                                  
                                   }
                                   else {
                                       System.out.println("USTED NO TIENE SUFICIENTES RECURSOS PARA CONSTRUIR ");
                                       
                                   }                                                                                                       
                                   break; 
                                  
                               case 4:
                                    costO= CUARTEL12.getOro();costoE=CUARTEL12.getElixir();costoD=CUARTEL12.getDark();
                                   
                                   
                                   if ( (orot >= costO)&& (elixirt >= costoE) && (darkt >= costoD))
                                   {
                                       orot=orot-costO;
                                       elixirt=elixirt-costoE;
                                       darkt=darkt-costoD;
                                       TH2.setOro(orot);
                                   TH2.setElixir(elixirt);
                                  TH2.setDark(darkt);
                                   orot= TH2.getOro();
                                   elixirt = TH2.getElixir();
                                   darkt = TH2.getDark();
                                   //mnsj creado
                                   cuartel2[0]=CUARTEL12;//MODIFICADO
                                   System.out.println("Usted ha creado satisfactoriamente el edificio");
                                   System.out.println("-1000 oro");
                                  System.out.println("-1000 Elixir");
                                  System.out.println("-0 Elixir oscuro (Dark)");
                                   }
                                   else {
                                       System.out.println("USTED NO TIENE SUFICIENTES RECURSOS PARA CONSTRUIR ");
                                       
                                   }
                                   
                                  break;
                           }
                           }
                    opc = -1;                                 
                                 
                                 
                                       break;
                case 2:
                    System.out.println("Que edificacion desea atacar ?");
//Aqui se pueden ver los edificios creados por el rival para atacarlos
                    int x=0;
                    for(int i = 0;i<4;i=i+1 )
                    {
                        if (creaciones[i]!=null)
                        {
                            System.out.println((i+1)+". "+creaciones[i].getNombre());
                            
                            }
                        else
                            x++;
                        }
                    if(cuartel1[0]!=null)
                        System.out.println(("1. "+TH1.getNombre()));
                    else
                        x++;
                    if (x==4)
                        System.out.println((4-x)+". "+cuartel1[0].getNombre());
                        System.out.println();
                    int ataque = 0;
                            ataque=teclado.nextInt();
                            switch (ataque){
                                case 1:
                                    System.out.println("ATACANDO!!!  ");
                                    break;
                                case 2:
                                    System.out.println ("ATACANDO!!!!");
                                    break;
                    }
                    opc = -1;
                    break;
                case 3:
                     System.out.println("ATAcando!!!!!!!");
             
                    opc = -1;
                    break;
                case 4:
                    turno=1;
                    
                        if (creaciones[0]!=null)
                        {
                           TH1.setOro((TH1.getOro())+creaciones[0].getGenerador());
                            
                            }
                        if (creaciones[1]!=null)
                        {
                           TH1.setElixir((TH1.getElixir())+creaciones[1].getGenerador());
                            
                            }
                        if (creaciones[2]!=null)
                        {
                           TH1.setDark((TH1.getDark())+creaciones[2].getGenerador());
                            
                            }
                        if (cuartel1[0]!=null)
                        {
                           CUARTEL11.setTropasxturno((CUARTEL11.getTropasxturno())+1000);
                            
                            }
                        
                        
                    opc=-1;
                    break;
                case 5:
                    perdedor = 2;
                    opc=-1;
                    turno =0;
                default:
                    System.out.println("Ingresa una opcion valida plox\n");
                    break;
                
            }
  }
    }
       
               
 } 
 if (perdedor==1)
 {
 System.out.println("El ganador es " + nombre2);
 }
 else
 {
      System.out.println("El ganador es " + nombre1);

 }
    }
 public static  void elegirraza(){
 
  System.out.println("Elije una: ");
   System.out.println("________________________________ ");
       System.out.println("|1-espartanos");
       System.out.println("|2-gigantes");
       System.out.println("|3-Sayayins");
  
   
 }
   public static void menu(){
       System.out.println("Elige un a opcion ");
        System.out.println("1-CONSTRUIR EDIFICACION");
       System.out.println("2-ATACAR de tropas enemigas");
       System.out.println("3-Defenderse de tropas enemigas");
        System.out.println("4-Terminar turno");
       System.out.println("5-RENDIRSE");
   } 
   public static void menu1(){
    System.out.println("Elige un a opcion ");
       System.out.println("1-CONSTRUIR Recolector de oro lvl 1");     
       System.out.println("2-CONSTRUIR Recolector de elixir lvl 1");       
       System.out.println("3-CONSTRUIR Recolector de elixir oscuro lvl 1");      
       System.out.println("4-CONSTRUIR Cuartel lvl 1");       
       System.out.println("0- REGRESAR AL MENÚ");
}
}
