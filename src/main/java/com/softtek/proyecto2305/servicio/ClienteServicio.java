package com.softtek.proyecto2305.servicio;

import com.softtek.proyecto2305.modelo.Cliente;
import com.softtek.proyecto2305.repositorio.IClienteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClienteServicio implements IClienteServicio {

    @Autowired
    IClienteRepo clienteRepo;

    @Override
    public List<Cliente> obtenerClientes() {
        return clienteRepo.findAll();
    }
}
