package com.curso.v2;

public class Empleado {
	
	String nombre;
	double sueldo;
	
	public Empleado(String nombre, double sueldo) {
		this.nombre = nombre;
		this.sueldo = sueldo;
	}
	
	static void addSueldo(Empleado e){
		e.sueldo = e.sueldo * 1.10;
	}
	

}
