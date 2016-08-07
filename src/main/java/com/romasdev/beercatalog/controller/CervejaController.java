package com.romasdev.beercatalog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cervejas")
public class CervejaController {

	@RequestMapping("/novo")
	public String novo() {
		return "/cerveja/CadastroCerveja";
	}
	
	@RequestMapping
	public String pesquisa() {
		return "/cerveja/PesquisaCervejas";
	}
	
}
