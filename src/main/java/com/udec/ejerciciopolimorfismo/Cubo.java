/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.ejerciciopolimorfismo;

/**
 * Esta clase es hija de la clase Figuras3D, aqui se halla el volumen y area
 * @author Corin Viracacha 
 */
public class Cubo extends Figuras3D implements Figura{
    /**
     * largo, ancho, altura son dimensiones del cubo 
     * el tipo define si es un prisma o cubo
     */
    private final int largo;
    private final int ancho;
    private final int altura;
    private final String tipo;
    /**
     * Constructor de la clase
     * @param largo dimension 
     * @param ancho dimension
     * @param altura dimension
     */
    public Cubo(int largo, int ancho, int altura) {
        this.largo = largo;
        this.ancho = ancho;
        this.altura = altura;
        tipo=validarFigura(largo,ancho,altura);
    }
    /**
     * metodo que retorna el largo del cubo
     * @return el largo del cubo
     */
    public int getLargo() {
        return largo;
    }
    /**
     * metodo que retorna el ancho del cubo
     * @return ancho del cubo
     */
    public int getAncho() {
        return ancho;
    }
    /**
     * metodo que retorna la altura del cubo
     * @return la altura del cubo
     */
    public int getAltura() {
        return altura;
    }
    /**
     * metodo que retorna el tipo del cubo
     * @return el tipo del cubo
     */
    public String getTipo() {
        return tipo;
    }
    
    /**
     * Metodo que se encarga de hallar el volumen del cubo
     * @return el volumen calculado
     */
    @Override
    public double hallarVolumen() {
        return largo*ancho*altura;
        
    }
    /**
     * Metodo abstracto de la interface Figura que se encarga de hallar el area del cubo
     * @return el area del cubo
     */
    @Override
    public double hallarArea() {
        return 2*(largo*altura+largo*ancho+ancho*altura);
   }
    /**
     * Metodo abstracto de la interface Figura, que se encarga de imprimir los resultados
     */
    @Override    
    public void imprimirResultados() {
        System.out.println("El area del "+tipo+" es: "+hallarArea());
        System.out.println("El volumen del "+tipo+" es: "+hallarVolumen());
    }
    /**
     * Metodo que valida el tipo de figura
     * @param longitud dimension del cubo o prisma
     * @param profundidad dimension del cubo o prisma
     * @param altura dimension del cubo o prisma
     * @return el tipo de figura
     */
    private String validarFigura(int longitud, int profundidad, int altura) {
        if(longitud==profundidad & profundidad==altura){
            return "Cubo";
        }else{
            return "Prisma";
        }
    
    }
    
}
