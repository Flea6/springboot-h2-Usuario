package com.testeUsuario.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.testeUsuario.entity.Cliente;
import com.testeUsuario.service.ClienteService;
@RestController
@RequestMapping(path = "/clt")
public class ClienteController {
    @Autowired
    ClienteService clienteService;
    @GetMapping("/clientes")
    public List<Cliente> getAllClientes(){
        return clienteService.getAllClientes();
    }
    @GetMapping("/cliente/{id}")
    public Cliente getCliente(@PathVariable("id") int id) {
        return clienteService.getClienteById(id);
    }
    @DeleteMapping("/cliente/{id}")
    public void deleteCliente(@PathVariable("id") int id) {
    }
    @PostMapping("/cliente")
    public void addCliente(@RequestBody Cliente cliente) {
        clienteService.saveOrUpdate(cliente);
    }
    @PutMapping("/cliente")
    public void updateCliente(@RequestBody Cliente cliente) {
    }
}