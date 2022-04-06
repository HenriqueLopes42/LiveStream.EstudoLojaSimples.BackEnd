package com.EstudoDeCasa.Estudo.controllers;


import com.EstudoDeCasa.Estudo.Message;
import com.EstudoDeCasa.Estudo.entities.Cliente;
import com.EstudoDeCasa.Estudo.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cliente")
@CrossOrigin
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;


    @GetMapping()
    public List<Cliente> listar(){
        List<Cliente> listaCliente = clienteRepository.findByAtivo(true);
        return listaCliente;
    }

    @GetMapping("{id}")
    public Cliente buscar(@PathVariable Integer id){
        Cliente cliente = clienteRepository.findById(id).get();
        return cliente;
    }

    @PostMapping()
    public Message incluir(@RequestBody Cliente cliente){
        Message msg = new Message();

        try{
            cliente.setId(0);
            clienteRepository.save(cliente);
            clienteRepository.flush();
            msg.setMsg("Cliente inserido!!");
        }catch (Exception e){
            msg.setMsg("Cliente não foi inserido!");
        }

        return msg;
    }

    @PutMapping()
    public Message alterar(@RequestBody Cliente cliente){
        Message msg = new Message();
        try{
            clienteRepository.save(cliente);
            clienteRepository.flush();
            msg.setMsg("Cliente alterado!!");
        }catch (Exception e){
            msg.setMsg("Cliente não foi alterado!");
        }

        return msg;
    }

}
