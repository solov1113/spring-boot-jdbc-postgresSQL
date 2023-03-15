package com.eric.spring.jdbc.postgresql.repository;

import java.util.List;

import com.eric.spring.jdbc.postgresql.model.Tutorial;

public interface TutorialRepository {
  int save(Tutorial book);

  int update(Tutorial book);

  Tutorial findById(Long id);

  int deleteById(Long id);

  List<Tutorial> findAll();

  List<Tutorial> findByPublished(boolean published);

  List<Tutorial> findByTitleContaining(String title);

  int deleteAll();
}
