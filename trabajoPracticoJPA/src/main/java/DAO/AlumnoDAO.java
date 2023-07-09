package DAO;

import connections.Conexion;
import models.Alumno;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class AlumnoDAO {
    EntityManager entity = Conexion.getEntityManager();

    public AlumnoDAO() {
    }
    public void guardar(Alumno alumno){
        entity.getTransaction().begin();
        entity.persist(alumno);
        entity.getTransaction().commit();
    }

    public Alumno buscarPorId(Integer id){
        Alumno alumno = new Alumno();
        alumno = entity.find(Alumno.class, id);
        return alumno;
    }

    public List<Alumno> obtenerAlumnos(){
        List<Alumno> alumnoList = new ArrayList<>();
        Query sql = entity.createQuery("SELECT a FROM Alumno a");
        return alumnoList = sql.getResultList();
    }
    public void cerrarConexion(){
        Conexion.closeEntityManagerFactory();
    }
}
