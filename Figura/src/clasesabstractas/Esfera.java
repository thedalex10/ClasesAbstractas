package clasesabstractas;


import clasesabstractas.Figura;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MiPc
 */
public class Esfera extends Figura {
    private double radio;
    private static double PI=3.1416;
    
    public Esfera (double radio){
        this.radio=radio;
    }
    
   
    public void calcularArea(){
        this.area=4*PI*radio*radio;
    }

    @Override
    public void calcularVolumen() {
        this.volumen= (4/3)*PI*radio*radio*radio;
    }
}
