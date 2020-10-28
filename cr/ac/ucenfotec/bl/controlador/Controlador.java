/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucenfotec.bl.controlador;

import cr.ac.ucenfotec.bl.entidades.*;
import cr.ac.ucenfotec.bl.iu.IU;
import cr.ac.ucenfotec.bl.logica.Gestor;

public class Controlador {

    IU iu = new IU();
    Gestor gestor = new Gestor();

    public void ejecutar() {

        iu.imprimir("Registremos una factura!\n"
                + "Ingrese el nombre del Cliente");
        String nombreCliente = iu.readString();
        iu.imprimir("\nIngrese el ID del Cliente\n");
        String idCliente = iu.readString();
        iu.imprimir("Ingrese el genero del Cliente");
        String generoCliente = iu.readString();
        iu.imprimir("Ingrese el mes de nacimiento del Cliente");
        int mesCliente = iu.readInt();
        iu.imprimir("Ingrese el año de nacimiento del Cliente");
        int anioCliente = iu.readInt();
        iu.imprimir("Ingrese el dia de nacimiento del Cliente");
        int diaCliente = iu.readInt();
        Cliente cliente = gestor.registrarCliente(nombreCliente, idCliente, generoCliente, anioCliente, mesCliente, diaCliente);
        iu.imprimir("La edad de " + cliente.getNombre() + " es " + cliente.getEdad());
        iu.imprimir("Ingrese el codigo del producto");
        String codigoProducto = iu.readString();
        iu.imprimir("Ingrese la descripcion del producto");
        String descProducto = iu.readString();
        iu.imprimir("Ingrese el precio del producto");
        String precioProducto = iu.readString();
        Producto producto = gestor.registrarProducto(codigoProducto, descProducto, Double.parseDouble(precioProducto));
        iu.imprimir("Ingrese la cantidad de productos");
        String cantProducto = iu.readString();
        iu.imprimir("Ingrese la numeracion de la factura");
        String numFactura = iu.readString();
        Factura factura = new Factura(numFactura, cliente);
        factura.agregarLinea(producto, Integer.parseInt(cantProducto));
        factura.setCliente(cliente);
        System.out.println(factura);
    }

}
