/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author daolivares
 */
public class LAB01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Arbol b = new Arbol();
        String raiz="";
       try{
        do{
         raiz = JOptionPane.showInputDialog("Escriba el nombre de su proyecto");
         if(raiz.equals("")){
            JOptionPane.showMessageDialog(null, "Este proyecto no tiene nombre. Por favor coloque un nombre a su proyecto", "Error", JOptionPane.ERROR_MESSAGE);  
         }
        }while(raiz.equals(""));
       
        NodoArbol nodo = new NodoArbol(raiz, 1);
        
        //creacion del archivo
        crearArchivo(raiz+".txt");
        escribirArchivo(raiz+".txt", raiz);
        
        
        Interfaz I = new Interfaz(nodo);
        I.setVisible(true);
        I.setResizable(false);
        I.setLocationRelativeTo(null);
      }catch(Exception e){
           
       }
    }
    public static void crearArchivo(String raiz){
        File archivo = new File(raiz);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }
    public static void escribirArchivo(String raiz, String contenido){
        File archivo = new File(raiz);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            salida.println(contenido);
            salida.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
    public static String leerArchivo(String raiz){
        File archivo = new File(raiz);
        try {
            BufferedReader entrada = new BufferedReader(new FileReader (archivo));
            String lectura = entrada.readLine();
            entrada.close();
            return lectura;
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        return null;
    }
    
}
