package com.hiberu.controller;

import com.hiberu.model.Details;
import com.hiberu.service.IDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/details")
public class DetailsController {

    @Autowired
    private IDetailsService clientService;

    @GetMapping("list")
    public ResponseEntity<List<Details>> list() {
        List<Details> list = clientService.list();
        return new ResponseEntity<List<Details>>(list, HttpStatus.OK);
    }

}
