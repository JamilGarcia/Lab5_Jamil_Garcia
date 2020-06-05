package lab5_jamilgarcia;

import java.util.ArrayList;

public class Escuadron {
    private String nombreEs; 
    private String lugar; 
    private SuperHSuperV lider; 
    private String tipo; 
    private ArrayList <SuperHSuperV> lista = new ArrayList(); 

    public Escuadron() {
    }

    public Escuadron(String nombreEs, String lugar, SuperHSuperV lider, String tipo) {
        this.nombreEs = nombreEs;
        this.lugar = lugar;
        this.lider = lider;
        this.tipo = tipo;
    }

    public String getNombreEs() {
        return nombreEs;
    }

    public void setNombreEs(String nombreEs) {
        this.nombreEs = nombreEs;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public SuperHSuperV getLider() {
        return lider;
    }

    public void setLider(SuperHSuperV lider) {
        this.lider = lider;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<SuperHSuperV> getLista() {
        return lista;
    }

    public void setLista(ArrayList<SuperHSuperV> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return nombreEs + " " + lugar;
    }
    
    
    
}
