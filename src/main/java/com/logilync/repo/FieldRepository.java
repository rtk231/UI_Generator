package com.logilync.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.logilync.domain.Field;

public interface FieldRepository extends CrudRepository<Field, Long> {
 List<Field> findAllBySectionIdOrderByFieldOrderAsc(Long sectionId);
}
