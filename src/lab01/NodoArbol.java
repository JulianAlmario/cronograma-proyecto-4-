/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01;

/**
 *
 * @author daolivares
 */
public class NodoArbol {
    Object dato;
    Object tipo;
    Lista hijos;

    public NodoArbol(Object dato, Object tipo) {
        this.dato = dato;
        this.tipo = tipo;
        this.hijos = new Lista();
    }
    public int cantidadDeNodos(NodoLista n) {
        int c=0;
        if (n.nArbol.hijos.ptr != null) {
            c = cantidadDeNodos(n.nArbol.hijos.ptr) + cantidadDeNodos(n.link) + 1;
            return cantidadDeNodos(n.nArbol.hijos.ptr) + cantidadDeNodos(n.link);
        }
        return c;
    }  
}
