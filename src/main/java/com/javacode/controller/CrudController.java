package com.javacode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javacode.model.CrudModel;
import com.javacode.service.ModelService;

@RestController
public class CrudController {

	@Autowired
	ModelService modelService;

	@PostMapping("/crudpost")
	private CrudModel addModel(@RequestBody CrudModel cd) {
		return modelService.addCrud(cd);

	}

}
