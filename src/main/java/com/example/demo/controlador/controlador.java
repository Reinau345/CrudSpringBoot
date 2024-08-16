package com.example.demo.controlador;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.interfaceService.IproductoService;
import com.example.demo.modelo.producto;

@Controller
@RequestMapping
public class controlador {
	
	@Autowired
	private IproductoService service;
	@RequestMapping("/login")
	@GetMapping("/listar")
	public String listar(Model model) {
		List<producto>producto=service.Listar();
		model.addAttribute("producto", producto);
		return "index";
	}
}
