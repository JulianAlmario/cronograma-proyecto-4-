/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab01;

/**
 *
 * @author julian
 */
public class ListaG {
    NodoListaG ptr;
    int tam=0;
    public ListaG() {
        this.ptr = null;
    }
    public void insertar(Vertices n){
        if(ptr==null){
            ptr= new NodoListaG(n);
            tam++;
        } else {
            NodoListaG p = ptr;
            while(p.link!=null){
                p=p.link;
            }
            p.link = new NodoListaG(n);
        }
        tam++;
    } 
}
