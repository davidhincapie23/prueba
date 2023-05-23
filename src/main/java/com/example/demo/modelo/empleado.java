package com.example.demo.modelo;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.id;


@Entity
@table(name = "empleado")


public class empleado {
	@id
	@GenerarValeu(strategy = GenerationType = IDENTITY)
	private int id;
	private String Nombres;
	private String Apellidos;
	private String Tipo_De_Documento;
	private int Numero_De_Documento;
	private int Fecha_De_Vinculacion_a_la_Compañia;
	private String Cargo;
	private Double Salario;
public empleado() {
	// TODO Auto-generated constructor stub
}
public empleado(int id, String nombres, String apellidos, String tipo_De_Documento, int numero_De_Documento,
		int fecha_De_Vinculacion_a_la_Compañia, String cargo, Double salario) {
	super();
	this.id = id;
	Nombres = nombres;
	Apellidos = apellidos;
	Tipo_De_Documento = tipo_De_Documento;
	Numero_De_Documento = numero_De_Documento;
	Fecha_De_Vinculacion_a_la_Compañia = fecha_De_Vinculacion_a_la_Compañia;
	Cargo = cargo;
	Salario = salario;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNombres() {
	return Nombres;
}
public void setNombres(String nombres) {
	Nombres = nombres;
}
public String getApellidos() {
	return Apellidos;
}
public void setApellidos(String apellidos) {
	Apellidos = apellidos;
}
public String getTipo_De_Documento() {
	return Tipo_De_Documento;
}
public void setTipo_De_Documento(String tipo_De_Documento) {
	Tipo_De_Documento = tipo_De_Documento;
}
public int getNumero_De_Documento() {
	return Numero_De_Documento;
}
public void setNumero_De_Documento(int numero_De_Documento) {
	Numero_De_Documento = numero_De_Documento;
}
public int getFecha_De_Vinculacion_a_la_Compañia() {
	return Fecha_De_Vinculacion_a_la_Compañia;
}
public void setFecha_De_Vinculacion_a_la_Compañia(int fecha_De_Vinculacion_a_la_Compañia) {
	Fecha_De_Vinculacion_a_la_Compañia = fecha_De_Vinculacion_a_la_Compañia;
}
public String getCargo() {
	return Cargo;
}
public void setCargo(String cargo) {
	Cargo = cargo;
}
public Double getSalario() {
	return Salario;
}
public void setSalario(Double salario) {
	Salario = salario;
}

	
	
	
	
}

