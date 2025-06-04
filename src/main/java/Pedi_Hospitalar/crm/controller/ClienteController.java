package Pedi_Hospitalar.crm.controller;

import Pedi_Hospitalar.crm.model.Cliente;
import Pedi_Hospitalar.crm.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    // POST para cadastrar um cliente
    @PostMapping
    public Cliente salvarCliente(@RequestBody Cliente cliente) {
        return clienteService.salvar(cliente);
    }

    // ✅ GET para listar todos os clientes (isso resolve seu problema!)
    @GetMapping
    public List<Cliente> listarClientes() {
        return clienteService.listarTodos();
    }
}
