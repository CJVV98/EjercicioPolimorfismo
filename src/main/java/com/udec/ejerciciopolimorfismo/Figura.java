/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.ejerciciopolimorfismo;

/**
 * Interface Figura aqui se declaran los metodos de area e impresion para posteriormente ser adecuados
 * @author Corin V
 */
public interface Figura {
    /**
     * Halla el area de las figuras
     * @return area
     */
    public double hallarArea();
    /**
     * Imprime los resultados obtenidos por figura
     */
    public void imprimirResultados();
}
