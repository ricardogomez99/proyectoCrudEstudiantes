package crud.springboot.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import crud.springboot.demo.entidad.Estudiante;
import crud.springboot.demo.repositorio.EstudianteRepositorio;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	private EstudianteRepositorio repositorio;

	@Override
	public void run(String... args) throws Exception {
		/*Estudiante estudiante1 = new Estudiante("Ricardo", "Gomez", "ricardo@gmail.com");
		repositorio.save(estudiante1);

		Estudiante estudiante2 = new Estudiante("Julian", "Peña", "julian@gmail.com");
		repositorio.save(estudiante2);*/

	}

}
