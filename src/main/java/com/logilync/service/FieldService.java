package com.logilync.service;

import java.util.List;

import com.logilync.domain.Field;

public interface FieldService {

	Field save(Field field);

	Field getFieldById(Long id);

	List<Field> getFieldBySectionId(Long sectionId);

}
