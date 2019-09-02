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
 * @author Corin Viracacha
 * Clase Circulo hija de Figuras 2D 
 */
public class Circulo extends Figuras2D implements Figura{
    /**
     * el atributo radio es usado para determinar el area y perimetro del circulo
     */
    private double radio;
    /**
     * Constructor de la clase
     * @param radio se asigna el parametro a la variable radio
     */
    public Circulo(double radio) {
        this.radio = radio;
    }
    /**
     * Metodo que devuelve el valor del radio
     * @return radio
     */
    
    public double getRadio() {
        return radio;
    }
    /**
     * Metodo para aignar el radio
     * @param radio 
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }
    /**
     * Metodo abstracto de la clase figuras2D, en este se halla el perimetro
     * @return el perimetro
     */
    @Override
    public double hallarPerimetro() {
        return 2*PI*radio;    
    }
    /**
     * Metodo abstracto de la interface figura, en este se halla el area
     * @return el area
     */
    @Override
    public double hallarArea() {
          return PI*(pow(radio,2));
    }
    /**
     * Metodo abstracto de la clase figura, en este se imprime los resultados
     */
    @Override
    public void imprimirResultados() {
        System.out.println("El area del circulo es "+hallarArea());
        System.out.println("El perimetro del circulo es "+hallarPerimetro());
    }
    
}
