package crud.springboot.demo.entidad;


import org.hibernate.annotations.NotFound;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "estudiantes")
public class Estudiante{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @Column(name = "nombre",nullable = false,length = 50)
    @NotFound
    private String nombre;

    @Column(name = "apellido",nullable = false,length = 50)
    private String apellido;

    @Column(name = "email",nullable = false,length = 50, unique = true)
    @NotFound
    private String email;

    public Estudiante(){

    }

    public Estudiante(long id, String nombre, String apellido, String email) {
        super();
        Id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }

    public Estudiante(String nombre, String apellido, String email) {
        super();
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }


    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Estudiante [Id=" + Id + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + "]";
    }
    
}
