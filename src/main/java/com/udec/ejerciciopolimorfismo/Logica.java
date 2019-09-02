/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.ejerciciopolimorfismo;
import java.util.Scanner;
/**
 *
 * @author Corin Viracacha
 * En esta clase se solicita la informacion y se hace el llamado a los calculos geometricos
 */
public class Logica {
    /**
     * posicion, determina la posicion dentro del vector de Figura
     * figura, almacena las figuras seleccionadas por el usuario
     * ingreso, para determinar lo digitado por el usuario
     */
    private int posicion;
    private Figura[] figura;
    private Scanner ingreso;
    /**
     * En este metodo se visualiza las figuras a seleccionar.
     */
    public void solicitarDato(){
        figura=new Figura[10];
        short seleccion;
        ingreso=new Scanner(System.in);
        do{
            System.out.println("Escoja una figura");
            System.out.println("1. Triangulo ");
            System.out.println("2. Cuadrado");
            System.out.println("3. Circulo");
            System.out.println("4. Piramide");
            System.out.println("5. Cubo");
            System.out.println("6. Esfera");   
            System.out.print("Seleccione "); 
            seleccion=ingreso.nextShort();
            System.out.println("");
            validarSeleccion(seleccion,posicion++);
            System.out.println("Desea Continuar s/n"); 
        }while(Character.toLowerCase(ingreso.next().charAt(0))=='s');
        calculos();
    }
    /**
     * Metodo que valida la selección
     * @param seleccion segun lo escogido por el usuario
     * @param posicion del vector figura
     */
    private void validarSeleccion(short seleccion,int posicion) {
       switch(seleccion){
           case 1:
               llenarTriangulo(posicion);
               break;
           case 2:
               llenarCuadrado(posicion);
               break;
           case 3: 
               llenarCirucloEclipse(posicion, "Circulo");
               break;
           case 4:
               llenarPiramide(posicion);
               break;
           case 5:
               llenarCubo(posicion);
               break;
           case 6:
               llenarCirucloEclipse(posicion,"Elipse");
               break;
       }   
    }
    /**
     * Metodo para solicitar los datos del triangulo
     * @param posicion del vector figura
     */
    private void llenarTriangulo(int posicion){
        System.out.print("Inserte lado 1: ");
        int lado1=ingreso.nextInt();
        System.out.print("Inserte lado 2: ");
        int lado2=ingreso.nextInt();
        System.out.print("Inserte lado 3: ");
        int lado3=ingreso.nextInt();
        figura[posicion]=new Triangulo(lado1,lado2,lado3);
    }
    /**
     * Metodo para solicitar datos del cuadrado o rectangulo
     * @param posicion del vector
     */
    private void llenarCuadrado(int posicion){
        System.out.print("Inserte largo: ");
        int largo=ingreso.nextInt();
        System.out.print("Inserte ancho: ");
        int ancho=ingreso.nextInt();
        figura[posicion]=new Cuadrado(largo,ancho);  
              
    }
    /**
     * Metodo para llenar datos de la figura circulo o elipse
     * @param posicion del vector
     * @param tipo de figura
     */
    private void llenarCirucloEclipse(int posicion, String tipo){
        System.out.print("Inserte Radio: ");
        int radio=ingreso.nextInt();
        if("Circulo".equals(tipo))
            figura[posicion]=new Circulo(radio);   
        else
            figura[posicion]=new Esfera(radio);  
    }
    /**
     * Metodo para solicitar datos de la figura piramide
     * @param posicion del vector
     */
    private void llenarPiramide(int posicion){
        System.out.print("Inserte Area de la base: ");
        double areaBase=ingreso.nextDouble();
        System.out.print("Inserte altura: ");
        int altura=ingreso.nextInt();
        System.out.print("Inserte Area lateral: ");
        double areaLateral=ingreso.nextDouble();
        figura[posicion]=new Piramide(areaBase,altura,areaLateral);
    }
    /**
     * Metodo para solicitar datos de la figura cubo
     * @param posicion del vector
     */
    private void llenarCubo(int posicion){
        System.out.print("Inserte largo: ");
        int largo=ingreso.nextInt();
        System.out.print("Inserte ancho: ");
        int ancho=ingreso.nextInt();
        System.out.print("Inserte altura: ");
        int alto=ingreso.nextInt();
        figura[posicion]=new Cubo(largo,ancho,alto);  
    }
    /**
     * Metodo encargado de llamar a los metodos para los calculos geometricos
     */
    private void calculos() {
        for (Figura figur : figura) {
            System.out.println();
            if(figur instanceof Circulo)
                ((Circulo) figur).imprimirResultados();
            if(figur instanceof Cuadrado)
                ((Cuadrado) figur).imprimirResultados();
            if(figur instanceof Triangulo)
                ((Triangulo) figur).imprimirResultados();
            if(figur instanceof Cubo)
                ((Cubo) figur).imprimirResultados();
            if(figur instanceof Esfera)
                ((Esfera)figur).imprimirResultados();
            if(figur instanceof Piramide)
                ((Piramide) figur).imprimirResultados();                      
        }
 
   
    }

    
}