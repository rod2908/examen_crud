package com.examen.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.examen.crud.model.Ciudadano;
//import com.examen.crud.model.Domicilio;
import com.examen.crud.service.CiudadanoService;
//import com.examen.crud.service.DomicilioService;

@Controller
public class CiudadanoController {

	@Autowired
    private CiudadanoService ciudadanoService;
	//@Autowired
    //private DomicilioService domicilioService;

    @GetMapping("/")
    public String MainPage(Model model) {
    	
    	Ciudadano ciudadano = new Ciudadano();
    	//Domicilio domicilio = new Domicilio();
    	
    	model.addAttribute("ciudadano", ciudadano);
        model.addAttribute("listaCiudadanos", ciudadanoService.getAllCiudadanos());

    	//model.addAttribute("domicilio", domicilio);
        //model.addAttribute("listaDomicilios", domicilioService.getAllDomicilios());  
               
        return "index";
    }
	
    
    @PostMapping("/save")
    public String saveCiudadano(@ModelAttribute("ciudadano") Ciudadano ciudadano) {
    	     	  
    	ciudadanoService.saveCiudadano(ciudadano);
    	
        return "redirect:/";
    }
    
    @GetMapping("/delete/{id}")
    public String deleteCiudadano(@PathVariable(value = "id") long id) {

        this.ciudadanoService.deleteCiudadanoById(id);
        //this.domicilioService.deleteDomicilioById(id);

        return "redirect:/";
        
    }
    
    @GetMapping("/update/{id}")
    public String updateCiudadano(@PathVariable(value = "id") long id, Model model) {
    	
    	Ciudadano ciudadano = ciudadanoService.getCiudadanoById(id);
        model.addAttribute("ciudadano", ciudadano);
        
        return "update";
    }

}
