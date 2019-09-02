/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.ejerciciopolimorfismo;

/**
 * En esta clase se determina el area y volumen de la piramide
 * @author Corin V
 */
public class Piramide extends Figuras3D implements Figura{
    private double areaBase,areaLateral;
    private int altura;
    /**
     * Constructor de la clase piramide
     * @param areaBase dimension
     * @param altura dimension
     * @param areaLateral dimension
     */
    public Piramide(double areaBase, int altura,double areaLateral) {
        this.areaBase = areaBase;
        this.areaLateral = areaLateral;
        this.altura = altura;
    }
    /**
     * Metodo que obtiene el area de la Base
     * @return el area de la base
     */
    public double getAreaBase() {
        return areaBase;
    }
    /**
     * Metodo que asigna el area de la base
     * @param areaBase dimension
     */
    public void setAreaBase(double areaBase) {
        this.areaBase = areaBase;
    }
    /**
     * Metodo que obtiene el valor del area lateral
     * @return area lateral
     */
    public double getAreaLateral() {
        return areaLateral;
    }
    /**
     * Metodo que asigna el valor del area lateral
     * @param areaLateral dimension
     */
    public void setAreaLateral(double areaLateral) {
        this.areaLateral = areaLateral;
    }
    /**
     * Obtiene el valor de la altura de la piramide
     * @return altura
     */
    public int getAltura() {
        return altura;
    }
    /**
     * Metodo que asigna el valor de la altura
     * @param altura dimension
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }
    /**
     * Metodo especializado de la clase Figuras3D que halla el volumen de la piramide
     * @return volumen calculado
     */
    @Override
    public double hallarVolumen() {
        return (areaBase*altura)/3;
    }
    /**
     * Metodo especializado de la interface Figura que halla el area
     * @return area
     */
    @Override
    public double hallarArea() {
        return areaBase+areaLateral;
    }
    /**
     * Metodo especializado de la interface Figura imprime los resultados
     */
    @Override
    public void imprimirResultados() {
        System.out.println("El area de la piramide  es: "+hallarArea());
        System.out.println("El volumen de la piramide es: "+hallarVolumen());
    
    }
    
    
    
    
    
}
