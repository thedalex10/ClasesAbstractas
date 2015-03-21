package clasesabstractas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MiPc
 */
public abstract class Figura {
    
    protected double area;
    protected double volumen;
    
    abstract public void calcularArea();
    abstract public void calcularVolumen();
}
