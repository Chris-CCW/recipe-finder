package com.qa.hawkins.chris.recipefinder.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "recipes")
@EntityListeners(AuditingEntityListener.class)
public class DataModel implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long recipe_id;

	@NotBlank
	private String name;

	// @NotBlank
	private String serves;

	@NotBlank
	private String ingredients;

	@NotBlank
	private String method;

	// @NotBlank
	private String kcals;

	// @NotBlank
	private String fat;

	// @NotBlank
	private String saturates;

	// @NotBlank
	private String carbs;

	// @NotBlank
	private String sugars;

	// @NotBlank
	private String fibre;

	// @NotBlank
	private String protein;

	// @NotBlank
	private String salt;

	// @NotBlank
	private String time;

	// @NotBlank
	private String difficulty;

	public Long getRecipe_id() {
		return recipe_id;
	}

	public void setRecipe_id(Long recipe_id) {
		this.recipe_id = recipe_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getServes() {
		return serves;
	}

	public void setServes(String serves) {
		this.serves = serves;
	}

	public String getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getKcals() {
		return kcals;
	}

	public void setKcals(String kcals) {
		this.kcals = kcals;
	}

	public String getFat() {
		return fat;
	}

	public void setFat(String fat) {
		this.fat = fat;
	}

	public String getSaturates() {
		return saturates;
	}

	public void setSaturates(String saturates) {
		this.saturates = saturates;
	}

	public String getCarbs() {
		return carbs;
	}

	public void setCarbs(String carbs) {
		this.carbs = carbs;
	}

	public String getSugars() {
		return sugars;
	}

	public void setSugars(String sugars) {
		this.sugars = sugars;
	}

	public String getFibre() {
		return fibre;
	}

	public void setFibre(String fibre) {
		this.fibre = fibre;
	}

	public String getProtein() {
		return protein;
	}

	public void setProtein(String protein) {
		this.protein = protein;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}

}
