package com.hiberu.service.impl;

import com.hiberu.model.Client;
import com.hiberu.repository.IClientRepository;
import com.hiberu.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements IClientService {

    @Autowired
    private IClientRepository repo;


    @Override
    public Client register(Client obj) {
        return repo.save(obj);
    }

    @Override
    public Client update(Client obj) {
        return repo.save(obj);
    }

    @Override
    public List<Client> list() {
        return repo.findAll();
    }

}
