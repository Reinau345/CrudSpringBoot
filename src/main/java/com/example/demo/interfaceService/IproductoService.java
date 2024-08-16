package com.example.demo.interfaceService;

import java.util.List;
import java.util.Optional;
import com.example.demo.modelo.producto;

public interface IproductoService {
	public List<producto>Listar();
	public Optional<producto>Listar(int id);
	public int save(producto p);
	public void delete(int id);
}
