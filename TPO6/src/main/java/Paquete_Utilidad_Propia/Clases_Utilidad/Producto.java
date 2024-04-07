/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete_Utilidad_Propia.Clases_Utilidad;

/**
 *
 * @author DANIELALEJANDROMIRAN
 */
public class Producto {
    private int Codigo;
    private String Descripcion;
    private double Precio;
    private int Stock;
    private String Rubro;

    public Producto(int Codigo, String Descripcion, double Precio, int Stock, String Rubro) {
        this.Codigo = Codigo;
        this.Descripcion = Descripcion;
        this.Precio = Precio;
        this.Stock = Stock;
        this.Rubro = Rubro;
    }

    public Producto() {
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
    
}
