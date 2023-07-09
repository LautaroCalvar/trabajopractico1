package root;

import DAO.AlumnoDAO;
import connections.Conexion;
import models.Alumno;

import javax.persistence.EntityManager;
import java.util.Date;
import java.util.List;

public class Main {

	public static void main(String[] args) {


		AlumnoDAO alumnoDAO = new AlumnoDAO();

		//Date fecha = new Date();
		//Alumno alumno = new Alumno("Lautaro","lautaro@gmail.com",fecha);
		//alumnoDAO.guardar(alumno);
		//Alumno alumno2 = new Alumno("Tati","tati@gmail.com",fecha);
		//alumnoDAO.guardar(alumno2);

		//Alumno alumnoBuscado = alumnoDAO.buscarPorId(1);
		//System.out.println(alumnoBuscado.toString());

		List<Alumno> alumnoList = alumnoDAO.obtenerAlumnos();
		for (Alumno a : alumnoList) {
			System.out.println(a.toString());
		}

		/*EntityManager em;
       try {
		   em = Conexion.getEntityManager();
		   System.out.println("Conexion exitosa");
	   }catch (Exception e){
		   System.out.println("Algo salio mal");
	   }finally{
		   Conexion.closeEntityManagerFactory();
	   }*/


	}

}
