package com.example.demo.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
public class Controlador {
	
		private iEmpleadoServicie Service;

		public String Listar(Model model ) {
			list <empleado>empleados = service.listar();
			model.addAttribute("empleado", empleados)
			 return "index";
		}
}
