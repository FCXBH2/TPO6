/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete_Utilidad_Propia.Clases_Utilidad;

import java.util.Comparator;
import java.util.Objects;

/**
 *
 * @author DANIELALEJANDROMIRAN
 */
public class Producto implements Comparable<Producto> {
    protected int Codigo;
    protected String Descripcion;
    protected double Precio;
    protected int Stock;
    protected String Rubro;

    public Producto(int Codigo, String Descripcion, double Precio, int Stock, String Rubro) {
        this.Codigo = Codigo;
        this.Descripcion = Descripcion;
        this.Precio = Precio;
        this.Stock = Stock;
        this.Rubro = Rubro;
    }
    public int getCodigo() {
        return Codigo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public double getPrecio() {
        return Precio;
    }

    public int getStock() {
        return Stock;
    }

    public String getRubro() {
        return Rubro;
    }
    @Override
    public int compareTo(Producto P1) {
         if(P1.getCodigo()==Codigo) return 0;
         if(P1.getCodigo()>Codigo) return 1;
         if(P1.getCodigo()<Codigo) return -1;
        return -1;
         
    }
    
}
