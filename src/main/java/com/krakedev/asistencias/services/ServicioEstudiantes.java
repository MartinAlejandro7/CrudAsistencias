package com.krakedev.asistencias.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.krakedev.asistencias.entidades.Estudiante;

@Service
public class ServicioEstudiantes {
	
	private ArrayList<Estudiante> estudiantes = new ArrayList<>();
	
	 public void agregar(Estudiante estudiante) {
		 for(Estudiante a : estudiantes) {
			 
			 if(a.getCedula().equals(estudiante.getCedula())) {
				 return;
			 }
		 }
		 estudiantes.add(estudiante);
	 }
	 
	 public Estudiante buscarPorCedula(String cedula) {
		 for(Estudiante e : estudiantes) {
			 
			 if(e.getCedula().equals(cedula)) {
				 return e;
			 }
		 }
		 return null;
	 
	 }
	 public void eliminar(String cedula) {
		 
		 Estudiante eliminar = buscarPorCedula(cedula);
		 
		 if(eliminar != null) {
			 estudiantes.remove(eliminar);
		 }
	 }
	 
	 public void actualizar(String cedula, Estudiante nuevo) {
		 Estudiante actualizar = buscarPorCedula(cedula);
		 
		 if(actualizar != null) {
			actualizar.setNombre(nuevo.getNombre());
			actualizar.setApellido(nuevo.getApellido());
		 }
	 }
	 
	 public ArrayList<Estudiante> listar() {
		 return estudiantes;
	 }

}
