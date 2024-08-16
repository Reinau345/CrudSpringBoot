package com.example.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modelo.producto;

@Repository
public interface IProducto extends CrudRepository<producto, Integer>{
}
