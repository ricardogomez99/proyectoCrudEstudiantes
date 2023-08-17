package crud.springboot.demo.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import crud.springboot.demo.entidad.Estudiante;
import crud.springboot.demo.repositorio.EstudianteRepositorio;

@Service
public class EstudianteServicioImpl implements EstudianteServicio{

    @Autowired
    private EstudianteRepositorio repositorio;

    @Override
    public List<Estudiante> listarTodosLosEstudiantes() {
   
        return repositorio.findAll();
    }

    @Override
    public Estudiante guardarEstudiante(Estudiante estudiante) {
        return repositorio.save(estudiante);
    }

    @Override
    public Estudiante obtenerEstudiantePorId(Long Id) {
        return repositorio.findById(Id).get();
    }

    @Override
    public Estudiante actualizarEstudiante(Estudiante estudiante) {
        return repositorio.save(estudiante);
    }

    @Override
    public void eliminarEstudiante(Long Id) {
        repositorio.deleteById(Id);
    }
    
}
