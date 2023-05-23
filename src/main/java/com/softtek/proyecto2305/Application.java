package com.softtek.proyecto2305;

import com.softtek.proyecto2305.servicio.ClienteServicio;
import com.softtek.proyecto2305.servicio.OrdenServicio;
import com.softtek.proyecto2305.servicio.ProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private ProductoServicio productoServicio;

    @Autowired
    private ClienteServicio clienteServicio;

    @Autowired
    private OrdenServicio ordenServicio;
    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Select * from productos ");
        productoServicio.obtenerTodosLosProductos().forEach(System.out::println);

        System.out.println("Select * from clientes ");
        clienteServicio.obtenerClientes().forEach(System.out::println);

        System.out.println("Select * from ordenes ");
        ordenServicio.obtenerOrdenes().forEach(System.out::println);
    }
}
