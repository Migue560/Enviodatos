package Clases;

import java.io.Serializable;

public class hamburguesa implements Serializable {
    private String Tipo;
    private boolean cebolla;

    public hamburguesa(String tipo,boolean cebolla){

       this.Tipo = tipo;
        this.cebolla=cebolla;

    }
    public String getTipo() {return Tipo;}
    public boolean getCebolla() {return cebolla;}
}
