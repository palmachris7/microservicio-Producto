package com.idat.microservicioprod.controller;


import com.idat.microservicioprod.model.Producto;

import com.idat.microservicioprod.service.PrductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/producto")
public class ProductoController {
    @Autowired
    private PrductoService service;

    @GetMapping(path= "/listar")
    public @ResponseBody
    List<Producto> listar(){
        return service.listar();
    }


}
