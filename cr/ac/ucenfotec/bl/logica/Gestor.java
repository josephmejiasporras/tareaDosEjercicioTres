/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cr.ac.ucenfotec.bl.logica;

import cr.ac.ucenfotec.bl.entidades.*;
import java.time.LocalDate;
import java.util.ArrayList;


public class Gestor {
    
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Factura> facturas = new ArrayList<>();
    private ArrayList<Producto> productos = new ArrayList<>();
    
    public Gestor (){
        
    }
    
    public Cliente registrarCliente (String nombre, String ID, String genero, int anio, int mes, int dia){
        Cliente cliente = new Cliente (nombre, ID, genero, anio, mes, dia);
        if (getClientes().contains(cliente)) {

            System.out.println("\nRegistro fallido. El cliente ya existe!");
        } else {
            getClientes().add(cliente);
            System.out.println("\n" + nombre + " ha sido registrado con éxito");
        }
        return cliente;
    }
    
    public void registrarFactura (){
        
    }
    
    public Producto registrarProducto (String codigo, String descripcion, double precio){
        Producto producto = new Producto(codigo, descripcion, precio);
        if (getProductos().contains(producto)) {

            System.out.println("\nRegistro fallido. El producto ya existe!");
        } else {
            getProductos().contains(producto);
            System.out.println("\n El producto código" + codigo + " ha sido registrado con éxito");
        }
        return producto;
    }
    
    public void listarClientes (){
        System.out.println("Lista de clientes:\n");
        int contador = 1;
        
        for (Cliente cliente : getClientes()) {
            System.out.println(contador + "-" + cliente.toString() + "\n");
            contador++;
        }
    }
    
    public void listarFacturas (){
        System.out.println("Lista de facturas:\n");
        int contador = 1;
        
        for (Factura factura : getFacturas()) {
            System.out.println(contador + "-" + factura.toString() + "\n");
            contador++;
        }
    }
    
    public void listarProductos (){
        System.out.println("Lista de productos:\n");
        int contador = 1;
        
        for (Producto producto : getProductos()) {
            System.out.println(contador + "-" + producto.toString() + "\n");
            contador++;
        }
    }

    /**
     * @return the clientes
     */
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    /**
     * @return the facturas
     */
    public ArrayList<Factura> getFacturas() {
        return facturas;
    }

    /**
     * @return the productos
     */
    public ArrayList<Producto> getProductos() {
        return productos;
    }
    
    

}
