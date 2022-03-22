package ec.edu.uce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import ec.edu.uce.repository.modelo.Paciente;
import ec.edu.uce.service.IPacienteService;

@Controller
// se deberia poner en plural
@RequestMapping("/pacientes")
public class PacienteController {
	
	@Autowired
	private IPacienteService paciService;
	
	@RequestMapping("/buscar/{idPaciente}")
	public String obtenerUsuario(@PathVariable("idPaciente") Integer idPaciente, Model modelo ) {
		
		Paciente paci =  this.paciService.buscar(idPaciente);
		
		modelo.addAttribute("paci" , paci);
		return "paciente";
	}
	
}
