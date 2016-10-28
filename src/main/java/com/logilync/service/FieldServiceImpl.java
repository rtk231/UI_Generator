package com.logilync.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.logilync.domain.Field;
import com.logilync.repo.FieldRepository;

@Service
public class FieldServiceImpl implements FieldService {
	@Autowired
	FieldRepository fieldRepository;

	@Override
	public Field save(Field field) {
		return fieldRepository.save(field);
	}

	@Override
	public Field getFieldById(Long id) {
		return fieldRepository.findOne(id);
	}

	@Override
	public List<Field> getFieldBySectionId(Long sectionId) {
		return fieldRepository
				.findAllBySectionIdOrderByFieldOrderAsc(sectionId);
	}

	

}
