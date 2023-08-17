package crud.springboot.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import crud.springboot.demo.entidad.Estudiante;

@Repository
public interface EstudianteRepositorio extends JpaRepository<Estudiante, Long>{


    
}
