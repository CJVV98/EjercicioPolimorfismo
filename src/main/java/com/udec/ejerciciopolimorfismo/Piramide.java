/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.ejerciciopolimorfismo;

/**
 *
 * @author Corin V
 */
public class Piramide extends Figuras3D implements Figura{
    private double areaBase,areaLateral;
    private int altura;

    public Piramide(double areaBase, int altura,double areaLateral) {
        this.areaBase = areaBase;
        this.areaLateral = areaLateral;
        this.altura = altura;
    }

    public double getAreaBase() {
        return areaBase;
    }

    public void setAreaBase(double areaBase) {
        this.areaBase = areaBase;
    }

    public double getAreaLateral() {
        return areaLateral;
    }

    public void setAreaLateral(double areaLateral) {
        this.areaLateral = areaLateral;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public double hallarVolumen() {
        return (areaBase*altura)/3;
    }

    @Override
    public double hallarArea() {
        return areaBase+areaLateral;
    }

    @Override
    public void imprimirResultados() {
        System.out.println("El area de la piramide  es: "+hallarArea());
        System.out.println("El volumen de la piramide es: "+hallarVolumen());
    
    }
    
    
    
    
    
}
