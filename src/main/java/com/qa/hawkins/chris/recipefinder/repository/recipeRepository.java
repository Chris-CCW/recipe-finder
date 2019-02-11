package com.qa.hawkins.chris.recipefinder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.hawkins.chris.recipefinder.model.DataModel;

@Repository
public interface recipeRepository extends JpaRepository<DataModel, Long> {

}
