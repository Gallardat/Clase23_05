package com.softtek.proyecto2305.servicio;

import com.softtek.proyecto2305.modelo.Orden;
import com.softtek.proyecto2305.repositorio.IOrdenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrdenServicio implements IOrderServicio{

    @Autowired
    IOrdenRepo repo;
    @Override
    public List<Orden> obtenerOrdenes() {
        return repo.findAll();
    }
}
