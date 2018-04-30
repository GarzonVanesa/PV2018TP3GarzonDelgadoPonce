/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webapp.controller;

import webapp.model.Libro;
import webapp.model.ListaLibros;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author 09
 */
@ManagedBean
@ViewScoped
public class LibroFormBean implements Serializable{
    private Libro libro;
    private ListaLibros listaLibros;
    public LibroFormBean(){
        libro = new Libro();
        listaLibros = new ListaLibros();
    }
    public void guardarLibro(){
        setLibro(libro);
        getListaLibros().getListadoLibros().add(libro);
        System.out.println("ingreso ....");
        //this.getListaLibros().Agragar(this.getLibro());
    }
    public Libro getLibro() {
        return libro;
    }
    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    
    public ListaLibros getListaLibros() {
        return listaLibros;
    }

    
    public void setListaLibros(ListaLibros listaLibros) {
        this.listaLibros = listaLibros;
    }
    
}