/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author 09
 */
public class ListaLibros {
    private ArrayList<Libro> listadoLibros;
    
    public ListaLibros(){
        listadoLibros = new ArrayList();
    }
    public ListaLibros(ArrayList<Libro> lista){
        this.listadoLibros = lista;
    } 

    /**
     * @return the listadoLibros
     */
    public ArrayList<Libro> getListadoLibros() {
        return listadoLibros;
    }

    /**
     * @param listadoLibros the listadoLibros to set
     */
    public void setListadoLibros(ArrayList<Libro> listadoLibros) {
        this.listadoLibros = listadoLibros;
    }
}
