/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucenfotec.bl.entidades;

import java.time.LocalDate;
import java.util.Vector;

public class Factura {

    private String numero;
    private Cliente cliente;
    private final LocalDate fecha;
    private Vector detalle;

    private double calcularSubtotal() {
        Linea lineaDetalle;
        double subtotal;
        subtotal = 0;
        for (int i = 0; i < detalle.size(); i++) {
            lineaDetalle = (Linea) detalle.get(i);
            subtotal = subtotal + lineaDetalle.calcularCosto();
        }
        return subtotal;
    }

    private double calcularImpuesto() {
        double impuesto;
        impuesto = calcularSubtotal() * 13 / 100;
        return impuesto;
    }

    public double calcularTotal() {
        double total;
        total = calcularSubtotal() + calcularImpuesto();
        return total;
    }

    public void agregarLinea(Producto producto, int cantidad) {
        detalle.add(new Linea(producto, cantidad));
    }

    public Factura(String numero, Cliente cliente) {
        this.numero = numero;
        fecha = LocalDate.now();
        detalle = new Vector();
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the fecha
     */
    public LocalDate getFecha() {
        return fecha;
    }

    /**
     * @return the detalle
     */
    public Vector getDetalle() {
        return detalle;
    }

    /**
     * @param detalle the detalle to set
     */
    public void setDetalle(Vector detalle) {
        this.detalle = detalle;
    }
    @Override
    public String toString() {
        String msg;
        Linea lineaD;
        msg = "================================" + "\n";
        msg = msg + "Soda Joe";
        msg = msg + "\t\t" + "No. " + numero + "\n";
        msg = msg + "cliente: " + cliente + " ";
        msg = msg + "\t" + fecha.toString() + "\n";
        msg = msg + "------------------------------------------" + "\n";
        msg = msg + "cant" + "\t" + "codigo" + "\t" + "descrip"
                + "\t" + "precio" + "\t" + "costo" + "\n";
        for (int i = 0; i < detalle.size(); i++) {
            lineaD = (Linea) detalle.get(i);
            msg = msg + lineaD.toString() + "\n";
        }
        msg = msg + "\t\t\t\t" + "----------" + "\n";
        msg = msg + "\t\t\t" + "subtotal:" + this.calcularSubtotal() + "\n";
        msg = msg + "\t\t\t" + "impuesto:" + this.calcularImpuesto() + "\n";
        msg = msg + "\t\t\t" + "total :" + this.calcularTotal() + "\n";
        msg = msg + "========================" + "\n";
        return msg;
    }

}
