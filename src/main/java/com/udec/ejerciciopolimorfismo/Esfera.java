/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.ejerciciopolimorfismo;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

/**
 * Esta clase halla el volumen y area de la figura
 * @author Corin Viracacha
 */
public class Esfera extends Figuras3D implements Figura{
    private double radio;

    /**
     * Constructor de la clase
     * @param radio dimension
     */
    public Esfera(double radio) {
        this.radio = radio;
    }
    /**
     * Metodo que retorna el radio
     * @return radio
     */
    public double getRadio() {
        return radio;
    }
    /**
     * Asigna el valor del radio
     * @param radio dimension
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }
    /**
     * Metodo que se encarga de hallar el volumen de la esfera
     * @return el volumen calculado
     */
    @Override
    public double hallarVolumen() {
        return (4/3)*PI*pow(radio,3);
    }
     /**
     * Metodo abstracto de la interface Figura que se encarga de hallar el area de la esfera
     * @return el area de la esfera
     */
    @Override
    public double hallarArea() {
        return 4*PI*pow(radio,2);
    }
    /**
     * Metodo abstracto de la interface Figura que imprime los resultados encontrados
     */
    @Override
    public void imprimirResultados() {
        System.out.println("El area de la Esfera es: "+hallarArea());
        System.out.println("El volumen de la Esfera es: "+hallarVolumen());
    }
    

  
    
}
