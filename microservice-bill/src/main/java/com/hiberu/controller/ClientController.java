package com.hiberu.controller;

import com.hiberu.model.Client;
import com.hiberu.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private IClientService clientService;

    @GetMapping("list")
    public ResponseEntity<List<Client>> list() {
        List<Client> list = clientService.list();
        return new ResponseEntity<List<Client>>(list, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Client> create(@RequestBody Client client) {
        Client obj = clientService.register(client);
        return new ResponseEntity<Client>(obj, HttpStatus.OK);
    }
}
