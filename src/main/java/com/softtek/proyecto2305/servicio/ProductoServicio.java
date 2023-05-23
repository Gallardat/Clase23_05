package com.softtek.proyecto2305.servicio;

import com.softtek.proyecto2305.modelo.Producto;
import com.softtek.proyecto2305.repositorio.IProductoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductoServicio implements IProductoServicio {

    @Autowired
    private  IProductoRepo productoRepo;

    public List<Producto> obtenerTodosLosProductos() {
        return productoRepo.findAll();
    }
}
