/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.ejerciciopolimorfismo;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 *
 * @author Corin V
 */
public final class Triangulo extends Figuras2D implements Figura{
    private final int lado1;
    private final int lado2;
    private final int lado3;
    private final String tipo;

    public Triangulo(int lado1, int lado2, int lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.tipo=tipoTriangulo(lado1, lado2, lado3);
    }

  
    public String tipoTriangulo(int lado1, int lado2, int lado3){
       if(lado1==lado2 & lado1==lado3 & lado2==lado3){
           return "Equilatero";
       }else if(lado1== lado2 || lado2==lado3 || lado1==lado3){
           return "Isosceles";
       }else{
           return "Escaleno";
       }

    }
    @Override
    public double hallarPerimetro() {
        return lado1+lado2+lado3;
    }

    @Override
    public double hallarArea() {
        double semiPerimetro,aux;
        if(null != tipo)switch (tipo) {
            case "Equilatero":
                return sqrt(3)*pow(lado1,2)/4;
            case "Isosceles":
                if(lado1==lado2)
                    aux=lado3;
                else if(lado2==lado3)
                    aux=lado1;
                else
                    aux=lado2;
                return sqrt(3)*pow(aux,2)/4;
            default:
                semiPerimetro=(lado1+lado2+lado3)/2;
                aux=semiPerimetro*(semiPerimetro-lado1)*(semiPerimetro-lado2)*(semiPerimetro-lado3);
                return sqrt(aux);
        }
        return 0;
    }

    @Override
    public void imprimirResultados() {
        System.out.println("El tipo de triangulo es "+tipo);
        System.out.println("El area del triangulo "+tipo+" es "+hallarArea());
        System.out.println("El perimetro del triangulo "+tipo+" es "+hallarPerimetro());
    }
    
}
