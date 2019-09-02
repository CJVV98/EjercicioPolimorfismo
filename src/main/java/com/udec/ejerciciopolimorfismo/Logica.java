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
            System.out.println("3. Rectangulo");
            System.out.println("4. Circulo");
            System.out.println("5. Piramide");
            System.out.println("6. Cubo");
            System.out.println("7. Prisma");
            System.out.println("8. Esfera");   
            System.out.print("Seleccione "); 
            seleccion=ingreso.nextShort();
            validarSeleccion(seleccion,posicion++);
            System.out.println("Desea Continuar s/n"); 
        }while(Character.toLowerCase(ingreso.next().charAt(0))=='s');
        calculos();
    }
    /**
     * Metodo que valida el tipo de figura si es 2D o 3D
     * @param seleccion segun lo escogido por el usuario
     * @param posicion del vector figura
     */
    private void validarSeleccion(short seleccion,int posicion) {
        if(seleccion<=4){
            llenarFiguras2D(seleccion,posicion);
        }else{
            llenarFiguras3D(seleccion,posicion);
        }
    
    }
    /**
     * En este metodo se solicitan los datos al usuario con respecto a las Figuras 2D y se llena el vector figura
     * @param seleccion segun lo escogido por el usuario
     * @param posicion del vector
     */
    private void llenarFiguras2D(short seleccion,int posicion) {   
        switch(seleccion){
                case 1:{                
                    System.out.println("Inserte los tres lados del triangulo:");
                    figura[posicion]=new Triangulo(ingreso.nextInt(),ingreso.nextInt(),ingreso.nextInt());
                    break;
                }
                case 2:
                case 3:{
                    System.out.println("Inserte los dos lados del cuadrado:");
                    figura[posicion]=new Cuadrado(ingreso.nextInt(),ingreso.nextInt());                
                    break;
                }
                case 4:{
                    System.out.println("Inserte el radio:");
                    figura[posicion]=new Circulo(ingreso.nextDouble());                
                    break;
                }
            }   
    
    }
    /**
     * En este metodo se solicitan los datos al usuario con respecto a las figuras 3D y se llena el vector figura
     * @param seleccion segun lo escogido por el usuario
     * @param posicion del vector
     */
    private void llenarFiguras3D(short seleccion, int posicion) {
        switch(seleccion){
                case 5:{                
                    System.out.println("Inserte area de la base, altura, area lateral:");
                    figura[posicion]=new Piramide(ingreso.nextDouble(),ingreso.nextInt(),ingreso.nextDouble());
                    break;
                }
                case 6:
                case 7:{
                    System.out.println("Inserte largo, ancho, altura :");                    
                    figura[posicion]=new Cubo(ingreso.nextInt(),ingreso.nextInt(),ingreso.nextInt());                
                    break;
                }
                case 8:{
                    System.out.println("Inserte el radio:");
                    figura[posicion]=new Esfera(ingreso.nextDouble());                
                    break;
                }
            } 
    
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
