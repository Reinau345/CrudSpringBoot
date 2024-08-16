package com.example.demo.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "producto")
public class producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String nombreproducto;
private int precio;

public producto(int id, String nombreproducto, int precio) {
	this.id = id;
	this.nombreproducto = nombreproducto;
	this.precio = precio;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getNombreproducto() {
	return nombreproducto;
}

public void setNombreproducto(String nombreproducto) {
	this.nombreproducto = nombreproducto;
}

public int getPrecio() {
	return precio;
}

public void setPrecio(int precio) {
	this.precio = precio;
}
}
