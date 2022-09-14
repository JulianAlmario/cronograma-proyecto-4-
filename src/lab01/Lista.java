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
public class Lista {
    NodoLista ptr;

    public Lista() {
        this.ptr = null;
    }
    public void insertar(NodoArbol n){
        if(ptr==null){
            ptr= new NodoLista(n);
        } else {
            NodoLista p = ptr;
            while(p.link!=null){
                p=p.link;
            }
            p.link = new NodoLista(n);
        }
    }
}
