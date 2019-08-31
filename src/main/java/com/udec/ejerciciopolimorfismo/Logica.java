/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.ejerciciopolimorfismo;
import java.util.Scanner;
/**
 *
 * @author Corin V
 */
public class Logica {
    private int posicion;
    private Figura[] figura;
    private Scanner ingreso;
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

    private void validarSeleccion(short seleccion,int posicion) {
        if(seleccion<=4){
            llenarFiguras2D(seleccion,posicion);
        }else{
            llenarFiguras3D(seleccion,posicion);
        }
    
    }

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
