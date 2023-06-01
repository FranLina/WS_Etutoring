package com.flb.ws_etutoring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.flb.ws_etutoring.models.Ccaa;
import com.flb.ws_etutoring.services.CcaaService;

@RestController
public class CcaaController {
    @Autowired
    CcaaService ccaaService;

    @GetMapping("/ccaa")
    List<Ccaa> findByAll() {
        return ccaaService.findAll();
    }

    @GetMapping("ccaa/{id}")
    Ccaa find(@PathVariable int id) {
        Ccaa ccaa = ccaaService.findById(id);
        return ccaa;
    }

}
