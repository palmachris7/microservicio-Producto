package com.idat.microservicioprod.service;

import com.idat.microservicioprod.model.Producto;
import com.idat.microservicioprod.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PrductoServiceImpl implements PrductoService {
    @Autowired
    private ProductoRepository repository;
    @Override
    public List<Producto> listar() {
        return repository.findAll();
    }

}
