/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab01;

import java.util.Date;

/**
 *
 * @author julian
 */
public class Vertices {
    Object dato;
    int duracion;
    Double costo;
    boolean visitado;
    ListaG dependencia;
    Vertices linkG;

    public Vertices(Object dato, int duracion, Double costo) {
        this.dato = dato;
        this.duracion = duracion;
        this.costo = costo;
        this.dependencia = new ListaG();
    }
}
