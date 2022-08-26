package com.example.controller;

//import java.util.Optional;

//import java.util.ArrayList;
//import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aulas.repository.ContatoRepositorio;
import com.example.entidade.Contatos;



@Controller
@RequestMapping("/")


public class ContatoContoller {
//	private List<Contatos>contatos=new ArrayList<>();
	
	@Autowired
	
	private ContatoRepositorio repo;
	
	@GetMapping
	public String index() {
	 return "index"; 
	} 
	
	@GetMapping("/cadastro")
	public String formCadastro() {
	 return "cadastro"; 
	} 
	

	@GetMapping("/consulta")
	public String formConsulta(Model model) {
		
	Iterable<Contatos>contatos  =  repo.findAll();	
	model.addAttribute("contatos",contatos);
	
		
		return "consulta"; 
	} 
	
	
	@GetMapping("/consulta/{idcontato}")
	public String formEditar(@PathVariable("idcontato") int id,Model model) {
		Contatos contato=repo.findById(id).get();
		System.out.println(contato.getNome());
		model.addAttribute("contato",contato);
		
		
	    
		return "edicao";
		
	}
	@PostMapping("/cadastro")
	public String salvar(Contatos contato) {
	 //System.out.printf("Nome:%s   \nFone:%s  \nEmail:%s",contato.getNome(),contato.getFone(),contato.getEmail());	
		
		//contato.setId(contatos.size()+1);
		
	   //contatos.add(contato);
		
		repo.save(contato);
		 return  "redirect:/consulta";
	}
	
	
	@GetMapping("/delete/{idcontato}")
	public String delete(@PathVariable("idcontato")int id) {
	     repo.deleteAll();
		return  "redirect:/consulta";
		
	}
	
	
}
;