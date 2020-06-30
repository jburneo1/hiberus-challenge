package com.hiberu.service.impl;

import com.hiberu.model.Details;
import com.hiberu.repository.IDetailsRepository;
import com.hiberu.service.IDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetailsServiceImpl implements IDetailsService {

    @Autowired
    private IDetailsRepository repo;

    @Override
    public Details register(Details obj) {
        return repo.save(obj);    }

    @Override
    public Details update(Details obj) {
        return repo.save(obj);
    }

    @Override
    public List<Details> list() {
        return repo.findAll();
    }
}
