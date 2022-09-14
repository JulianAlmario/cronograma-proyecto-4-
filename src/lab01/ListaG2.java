/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab01;

/**
 *
 * @author julian
 */
public class ListaG2 {
    Vertices ptr;

    public ListaG2() {
        this.ptr = null;
    }
    public void insertar(Object dato, int d, double cos){
        if(ptr==null){
            ptr= new Vertices(dato,d,cos);
        } else {
            Vertices p = ptr;
            while(p.linkG!=null){
                p=p.linkG;
            }
            p.linkG = new Vertices(dato,d,cos);
        }
    }   
}
