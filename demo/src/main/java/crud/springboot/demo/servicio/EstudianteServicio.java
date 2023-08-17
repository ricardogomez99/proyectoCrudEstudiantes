package crud.springboot.demo.servicio;

import java.util.List;

import crud.springboot.demo.entidad.Estudiante;

public interface EstudianteServicio {

    public List<Estudiante> listarTodosLosEstudiantes();

    public Estudiante guardarEstudiante(Estudiante estudiante);

    public Estudiante obtenerEstudiantePorId(Long Id);

    public Estudiante actualizarEstudiante(Estudiante estudiante);

    public void eliminarEstudiante(Long Id);
    
}
