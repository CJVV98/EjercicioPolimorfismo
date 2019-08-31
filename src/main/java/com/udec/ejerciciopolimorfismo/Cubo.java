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
public class Cubo extends Figuras3D implements Figura{
    private final int largo;
    private final int ancho;
    private final int altura;
    private final String tipo;
    
    public Cubo(int largo, int ancho, int altura) {
        this.largo = largo;
        this.ancho = ancho;
        this.altura = altura;
        tipo=validarFigura(largo,ancho,altura);
    }
    
    @Override
    public double hallarVolumen() {
        return largo*ancho*altura;
        
    }

    @Override
    public double hallarArea() {
        return 2*(largo*altura+largo*ancho+ancho*altura);
   }
    @Override    
    public void imprimirResultados() {
        System.out.println("El area del "+tipo+" es: "+hallarArea());
        System.out.println("El volumen del "+tipo+" es: "+hallarVolumen());
    }

    private String validarFigura(int longitud, int profundidad, int altura) {
        if(longitud==profundidad & profundidad==altura){
            return "Cubo";
        }else{
            return "Prisma";
        }
    
    }
    
}
