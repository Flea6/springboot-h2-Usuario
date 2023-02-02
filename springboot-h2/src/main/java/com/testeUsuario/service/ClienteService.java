package com.testeUsuario.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.testeUsuario.entity.Cliente;
import com.testeUsuario.repository.ClienteRepository;
@Service
public class ClienteService {
    @Autowired
    ClienteRepository repository;
    public Cliente getClienteById(int id) {
        return repository.findById(id).get();
    }
    public List<Cliente> getAllClientes(){
        List<Cliente> clientes = new ArrayList <Cliente>();
        repository.findAll().forEach(cliente -> clientes.add(cliente));
        return clientes;
    }
    public void saveOrUpdate(Cliente cliente) {
        repository.save(cliente);
    }
    public void deleteClienteById(int id) {
    }
}
