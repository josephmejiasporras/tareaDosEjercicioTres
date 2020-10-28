

package cr.ac.ucenfotec.bl.entidades;

import java.util.Objects;


public class Linea {
    
   private int cantidad;
   private Producto producto;

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the producto
     */
    public Producto getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.cantidad;
        hash = 97 * hash + Objects.hashCode(this.producto);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Linea other = (Linea) obj;
        return true;
    }

    public Linea(Producto producto, int cantidad) {
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public Linea() {
    }

    public double calcularCosto() {
        
    return (cantidad * producto.getPrecio());
    
    }
    @Override
    public String toString( ){
String msg;
msg = cantidad + "\t";
msg = msg + producto.getCodigo() + "\t";
msg = msg + producto.getDescripcion() + "\t";
msg = msg + producto.getPrecio() + "\t";
msg = msg + calcularCosto();
return msg;
}
    

}
