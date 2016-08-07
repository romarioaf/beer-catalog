package com.romasdev.beercatalog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.romasdev.beercatalog.CervejaRepository;

@Controller
@RequestMapping("/cervejas")
public class CervejaController {

	@Autowired
	private CervejaRepository cervejaRepository;
	
	@RequestMapping("/novo")
	public ModelAndView novo() {
		ModelAndView mv = new ModelAndView("/cerveja/CadastroCerveja");
		mv.addObject("cervejas", cervejaRepository.findAll());
		return mv;
	}
	
	@RequestMapping
	public String pesquisa() {
		return "/cerveja/PesquisaCervejas";
	}
	
}
