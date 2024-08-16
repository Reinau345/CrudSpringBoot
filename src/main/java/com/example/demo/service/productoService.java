package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.interfaceService.IproductoService;
import com.example.demo.interfaces.IProducto;
import com.example.demo.modelo.producto;

@Service
public class productoService implements IproductoService{
	
	@Autowired
	private IProducto data;
	@Override
	public List<producto> Listar() {
		// TODO Auto-generated method stub
		return (List<producto>)data.findAll();
	}

	@Override
	public Optional<producto> Listar(int id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public int save(producto p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}
	
}
