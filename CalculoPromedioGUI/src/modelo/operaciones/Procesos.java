package modelo.operaciones;

import java.awt.Color;
import java.util.ArrayList;

import modelo.vo.EstudianteVO;

public class Procesos {


	
	public double calcularPromedio(double n1,double n2,double n3) {
		
		if (n1 < 0 || n1 > 5 || n2 < 0 || n2 > 5 || n3 < 0 || n3 > 5) {
	        return -1; 
	        
	        return (n1 + n2 + n3) / 3;
		}
		
		
		return 0;
		
	}

	public String calcularDefinitiva(double promedio) {
		
		if (promedio >= 3.0) {
	        return "Aprobado";
	    } else {
	        return "Reprobado";
	    }
	}
		
	public double calcularPromedio(EstudianteVO est) {
		
		return (est.getNota1() + est.getNota2() + est.getNota3()) / 3;

	
		return 0;
	}

	public void registrarEnBD(EstudianteVO estudiante) {
		
		System.out.println("Estudiante registrado: " + estudiante.getNombre());
	}
	}
		 listaEstudiantes.add(estudiante);
		    System.out.println("Estudiante registrado con éxito.");
		}

	public void imprimirListaEstudiantes() {
		
		ArrayList<EstudianteVO> lista = getListaPersonas();
	    for (EstudianteVO estudiante : lista) {
	        System.out.println(estudiante);

	}
	
	public ArrayList<EstudianteVO> getListaPersonas(){
		return null listaPersonas;
	}

	public EstudianteVO obtenerEstudiante(String doc) {
		EstudianteVO p=null;
		for (EstudianteVO estudiante : listaPersonas) {
	        if (estudiante.getDocumento().equals(doc)) {
	            return estudiante;
	        }
	    }

		return null;
		
	}
	

