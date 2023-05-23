package com.example.demo.interfaceService;

public interface iEmpleadoServicie {
	public List<empleado>listar();
	public Optional<empleado>listarId(int id);
	public int saved(empleado p);
	public void delete(int id );
	 
	
}
