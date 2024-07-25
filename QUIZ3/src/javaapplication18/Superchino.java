/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication18;

/**
 *
 * @author Usuario
 */
public class Superchino {
    public int codigoProducto;
    public String nombreProducto;
    public String nombreEmpleado;
    public int cedulaEmpleado;
    public int cantProductos;
    public int precioBaseProducto;
    public String tipodeProducto;
    public int precioBrutoProducto;

    public Superchino(int codigoProducto, String nombreProducto, String nombreEmpleado, int cedulaEmpleado, int cantProductos, int precioBaseProducto, String tipodeProducto, int precioBrutoProducto) {
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.nombreEmpleado = nombreEmpleado;
        this.cedulaEmpleado = cedulaEmpleado;
        this.cantProductos = cantProductos;
        this.precioBaseProducto = precioBaseProducto;
        this.tipodeProducto = tipodeProducto;
        this.precioBrutoProducto = precioBrutoProducto;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public int getCedulaEmpleado() {
        return cedulaEmpleado;
    }

    public void setCedulaEmpleado(int cedulaEmpleado) {
        this.cedulaEmpleado = cedulaEmpleado;
    }

    public int getCantProductos() {
        return cantProductos;
    }

    public void setCantProductos(int cantProductos) {
        this.cantProductos = cantProductos;
    }

    public int getPrecioBaseProducto() {
        return precioBaseProducto;
    }

    public void setPrecioBaseProducto(int precioBaseProducto) {
        this.precioBaseProducto = precioBaseProducto;
    }

    public String getTipodeProducto() {
        return tipodeProducto;
    }

    public void setTipodeProducto(String tipodeProducto) {
        this.tipodeProducto = tipodeProducto;
    }

    public int getPrecioBrutoProducto() {
        return precioBrutoProducto;
    }

    public void setPrecioBrutoProducto(int precioBrutoProducto) {
        this.precioBrutoProducto = precioBrutoProducto;
    }
    
    
}
