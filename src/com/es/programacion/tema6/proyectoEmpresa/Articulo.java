package com.es.programacion.tema6.proyectoEmpresa;

public class Articulo {

    private String id;
    private String nombre;
    private Proveedor proveedor;
    private double precioSinIva;
    private double precioConIva;
    private int stock;

    // Constructores
    public Articulo(String id, String nombre, Proveedor p, double precioSinIva, int stock) {
        this.id = id;
        setNombre(nombre);
        setProveedor(p);
        setPrecioSinIva(precioSinIva);
        setPrecioConIva();
        setStock(stock);
    }

    // Metodos
    @Override
    public String toString() {
        String cadenaAMostrar = "";

        cadenaAMostrar += "Articulo con id: "+this.id+"\n";
        cadenaAMostrar += "Nombre: "+this.nombre+ " precio: "+this.precioConIva+"€\n";
        cadenaAMostrar += "StocK: "+this.stock;

        return cadenaAMostrar;
    }

    @Override
    public boolean equals(Object art) {

        if(art instanceof Articulo) {
            Articulo articulo = (Articulo) art;

            if(this.id.equalsIgnoreCase(articulo.id)) {
                return true;
            } else {
                return false;
            }

        } else {
            return false;
        }
    }


    // GETTERS AND SETTERS
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public double getPrecioSinIva() {
        return precioSinIva;
    }

    public void setPrecioSinIva(double precioSinIva) {
        if(precioSinIva >= 0) {
            this.precioSinIva = precioSinIva;
        }
    }

    public double getPrecioConIva() {
        return precioConIva;
    }

    public void setPrecioConIva() {
        this.precioConIva = this.precioSinIva * 1.21;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = this.stock + stock;
    }
}
