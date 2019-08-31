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
public class Cuadrado extends Figuras2D implements Figura{
    private String tipo;
    private int lado1;
    private int lado2;

    public Cuadrado(int lado1, int lado2) {       
        this.lado1 = lado1;
        this.lado2 = lado2;
        if(lado1==lado2){
            this.tipo = "Cuadrado";
        }else{
            this.tipo = "Rectangulo";
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    @Override
    public double hallarPerimetro() {
        return (2*lado1+2*lado2);
    }

    @Override
    public double hallarArea() {
         return lado1*lado2;
    }

    @Override
    public void imprimirResultados() {
        System.out.println("El area del "+tipo+" es: "+hallarArea());
        System.out.println("El perimetro del "+tipo+" es: "+hallarPerimetro());
    }
    
}
