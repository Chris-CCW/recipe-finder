package com.qa.hawkins.chris.recipefinder.controller;

import java.util.List;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.hawkins.chris.recipefinder.exception.ResourceNotFoundException;
import com.qa.hawkins.chris.recipefinder.model.DataModel;
import com.qa.hawkins.chris.recipefinder.repository.recipeRepository;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class Controller {

	@Autowired
	recipeRepository myRepository;

	/* Method to get a recipe */
	@GetMapping("/recipes/{recipe_id}")
	public DataModel getRecipeByID(@PathVariable(value = "recipe_id") Long recipe_id) {
		return myRepository.findById(recipe_id)
				.orElseThrow(() -> new ResourceNotFoundException("DataModel", "recipe_id", recipe_id));
	}

	/* Method to get all recipes */
	@GetMapping("/recipes")
	public List<DataModel> getAllRecipes() {
		return myRepository.findAll();
	}

	/* Method to create a recipe */
	@CrossOrigin
	@PostMapping("/recipes")
	public DataModel createRecipe(@Valid @RequestBody DataModel mSDM) {
		return myRepository.save(mSDM);
	}	

	/* Method to update a recipe */
	@PutMapping("/recipes/{recipe_id}")
	public DataModel updateRecipe(@PathVariable(value = "recipe_id") Long recipe_id,
			@Valid @RequestBody DataModel recipeDetails) {
		DataModel mSDM = myRepository.findById(recipe_id)
				.orElseThrow(() -> new ResourceNotFoundException("recipes", "recipe_id", recipe_id));
		mSDM.setName(recipeDetails.getName());
		mSDM.setIngredients(recipeDetails.getIngredients());
		mSDM.setMethod(recipeDetails.getMethod());
		mSDM.setKcals(recipeDetails.getKcals());
		mSDM.setTime(recipeDetails.getTime());
		mSDM.setFat(recipeDetails.getFat());
		mSDM.setSaturates(recipeDetails.getSaturates());
		mSDM.setCarbs(recipeDetails.getCarbs());
		mSDM.setSugars(recipeDetails.getSugars());
		mSDM.setFibre(recipeDetails.getFibre());
		mSDM.setProtein(recipeDetails.getProtein());
		mSDM.setSalt(recipeDetails.getSalt());
		mSDM.setDifficulty(recipeDetails.getDifficulty());
		DataModel updateData = myRepository.save(mSDM);
		return updateData;
	}

	/* Method to remove a recipe */
	@DeleteMapping("/recipes/{recipe_id}")
	public ResponseEntity<?> deleteRecipe(@PathVariable(value = "recipe_id") Long recipe_id) {
		DataModel mSDM = myRepository.findById(recipe_id)
				.orElseThrow(() -> new ResourceNotFoundException("recipes", "recipe_id", recipe_id));
		myRepository.delete(mSDM);
		return ResponseEntity.ok().build();
	}
}
