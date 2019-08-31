/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.ejerciciopolimorfismo;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

/**
 *
 * @author Corin V
 */
public class Esfera extends Figuras3D implements Figura{
    private double radio;

    public Esfera(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double hallarVolumen() {
        return (4/3)*PI*pow(radio,3);
    }

    @Override
    public double hallarArea() {
        return 4*PI*pow(radio,2);
    }

    @Override
    public void imprimirResultados() {
        System.out.println("El area de la Esfera es: "+hallarArea());
        System.out.println("El volumen de la Esfera es: "+hallarVolumen());
    }
    

  
    
}
