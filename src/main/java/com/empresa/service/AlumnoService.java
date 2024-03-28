package com.empresa.service;

import java.util.List;

import com.empresa.entity.Alumno;

public interface AlumnoService {

	public abstract List<Alumno> listaAlumno();
	public abstract List<Alumno> listaAlumnoPorDni(String dni);
	public abstract List<Alumno> listaAlumnoPorNombreLike(String nombre);
	public List<Alumno> listaAlumnoPorID(int idAlumno);
	public abstract List<Alumno> listaAlumnoPorMedicamento(String medicamento);
	

}
