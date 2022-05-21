package com.idat.microservicioprod.repository;


import com.idat.microservicioprod.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductoRepository extends JpaRepository<Producto,Integer> {
}
