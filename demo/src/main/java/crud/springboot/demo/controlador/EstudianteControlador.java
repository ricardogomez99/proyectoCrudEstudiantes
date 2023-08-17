package crud.springboot.demo.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import crud.springboot.demo.entidad.Estudiante;
import crud.springboot.demo.servicio.EstudianteServicio;

@Controller
public class EstudianteControlador {

    @Autowired
    private EstudianteServicio servicio;

    @GetMapping({"/estudiantes","/"})
    public String listarEstudiantes(Model modelo){
        modelo.addAttribute("estudiantes", servicio.listarTodosLosEstudiantes());
        return "estudiantes"; //Retorna al archivo estudiantes
    }

    @GetMapping("/estudiantes/nuevo")
    public String mostrarFormularioDeRegistrarEstudiante(Model modelo){
        Estudiante estudiante = new Estudiante();

        modelo.addAttribute("estudiante", estudiante);
        return "crear_estudiante";

    }

    @PostMapping("/estudiantes")
    public String guardarEstudiante(@ModelAttribute("estudiante") Estudiante estudiante, Errors errores){
        if(errores.hasErrors()){
            return "crear_estudiante";
        }
        servicio.guardarEstudiante(estudiante);
        return "redirect:/estudiantes";
    }

     @GetMapping("/estudiantes/editar/{Id}")
     public String mostrarFormularioDeEditar(@PathVariable Long Id, Model modelo){
        modelo.addAttribute("estudiant", servicio.obtenerEstudiantePorId(Id));
        return "editar_estudiante";
     }

     @PostMapping("/estudiantes/{Id}")
     public String actualizarEstudiante(@PathVariable Long Id,@ModelAttribute("estudiante") Estudiante estudiante, Model modelo){
        Estudiante estudianteExistente = servicio.obtenerEstudiantePorId(Id);
        estudianteExistente.setId(Id);
        estudianteExistente.setNombre(estudiante.getNombre());
        estudianteExistente.setApellido(estudiante.getApellido());
        estudianteExistente.setEmail(estudiante.getEmail());
        servicio.actualizarEstudiante(estudianteExistente);
        return "redirect:/estudiantes";

     }

     @GetMapping("/estudiantes/{Id}")
     public String eliminarEstudiantes(@PathVariable Long Id){

        servicio.eliminarEstudiante(Id);
        return "redirect:/estudiantes";

     }

    
    
}
