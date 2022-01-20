package com.javacode.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javacode.model.CrudModel;
import com.javacode.repository.ModelRepository;

@Service
public class ModelService {
	@Autowired
	ModelRepository modelRepository;

	public CrudModel addCrud(CrudModel cd) {
		return modelRepository.save(cd);

	}

}
