package com.logilync.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.logilync.domain.Field;
import com.logilync.service.FieldService;

@Controller
@RequestMapping("/field")
public class FieldController {
	@Autowired
	FieldService fieldService;
	
	@Value("${fieldTypes}")
	String fieldTypes;
	
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String show(Model model) {
		model.addAttribute("field", new Field());
		model.addAttribute("fieldTypes",
				Arrays.asList(fieldTypes.split(",")));
		return "createfield";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(Field field, Model model) {
		model.addAttribute("field", fieldService.save(field));		
		return "showfield";
	}
	
	@RequestMapping(value = "/view/{id}", method = RequestMethod.GET)
	public String view(@PathVariable("id") Long id, Model model) {
		model.addAttribute("field", fieldService.getFieldById(id));		
		return "showfield";
	}
}
