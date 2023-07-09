package models;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_alumno;
    private String nombre;
    private String mail;
    @Temporal(value = TemporalType.DATE)
    private Date fecha_nacimiento;


    public Alumno() {
        super();
    }

    public Alumno(String nombre, String mail, Date fecha_nacimiento) {
        super();
        this.nombre = nombre;
        this.mail = mail;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Integer getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(Integer id_alumno) {
        this.id_alumno = id_alumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    @Override
    public String toString() {
        return "Alumno [id_alumno=" + id_alumno + ", nombre=" + nombre + ", mail=" + mail + ", fecha_nacimiento="
                + fecha_nacimiento + "]";
    }


}
