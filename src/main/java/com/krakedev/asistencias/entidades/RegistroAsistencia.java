package com.krakedev.asistencias.entidades;

public class RegistroAsistencia {
	
	private Estudiante estudiante;
	 private Asistencia a;
	 
	 public RegistroAsistencia() {
		 
	 }
	 
	 public RegistroAsistencia(Estudiante estudiante, Asistencia a) {
		super();
		this.estudiante = estudiante;
		this.a = a;
	}
	 @Override
	public String toString() {
		return "RegistroAsistencia [estudiante=" + estudiante + ", a=" + a + "]";
	}
	 public Estudiante getEstudiante() {
		 return estudiante;
	 }
	 public void setEstudiante(Estudiante estudiante) {
		 this.estudiante = estudiante;
	 }
	 public Asistencia getA() {
		 return a;
	 }
	 public void setA(Asistencia a) {
		 this.a = a;
	 }
	 
	 
}
