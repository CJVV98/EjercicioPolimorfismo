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
public class Circulo extends Figuras2D implements Figura{
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double hallarPerimetro() {
        return 2*PI*radio;    
    }

    @Override
    public double hallarArea() {
          return PI*(pow(radio,2));
    }

    @Override
    public void imprimirResultados() {
        System.out.println("El area del circulo es "+hallarArea());
        System.out.println("El perimetro del circulo es "+hallarPerimetro());
    }
    
}
