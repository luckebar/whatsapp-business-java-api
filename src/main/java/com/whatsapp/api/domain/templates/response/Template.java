package com.whatsapp.api.domain.templates.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.whatsapp.api.domain.templates.Component;
import com.whatsapp.api.domain.templates.type.Category;

import java.util.List;

/**
 * The type Data item.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Template {

    @JsonProperty("components")
    List<Component<?>> components;

    @JsonProperty("name")
    String name;

    @JsonProperty("language")
    String language;

    @JsonProperty("id")
    String id;

    @JsonProperty("category")
    Category category;
    @JsonProperty("previous_category")
    Category previousCategory;
    @JsonProperty("status")
    String status;

    public Template(List<Component<?>> components, String name, String language, String id, Category category, Category previousCategory, String status) {
        this.components = components;
        this.name = name;
        this.language = language;
        this.id = id;
        this.category = category;
        this.previousCategory = previousCategory;
        this.status = status;
    }

    public List<Component<?>> components() {
        return components;
    }

    public void components(List<Component<?>> components) {
        this.components = components;
    }

    public String name() {
        return name;
    }

    public void name(String name) {
        this.name = name;
    }

    public String language() {
        return language;
    }

    public void language(String language) {
        this.language = language;
    }

    public String id() {
        return id;
    }

    public void id(String id) {
        this.id = id;
    }

    public Category category() {
        return category;
    }

    public void category(Category category) {
        this.category = category;
    }

    public Category previousCategory() {
        return previousCategory;
    }

    public void previousCategory(Category previousCategory) {
        this.previousCategory = previousCategory;
    }

    public String status() {
        return status;
    }

    public void status(String status) {
        this.status = status;
    }

}
