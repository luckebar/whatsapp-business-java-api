package com.whatsapp.api.domain.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Org.
 */
public class Org {

    @JsonProperty("company")
    String company;

    @JsonProperty("department")
    String department;

    @JsonProperty("title")
    String title;

    public Org() {
    }

    public Org(String company, String department, String title) {
        this.company = company;
        this.department = department;
        this.title = title;
    }

    public String company() {
        return company;
    }

    public void company(String company) {
        this.company = company;
    }

    public String department() {
        return department;
    }

    public void department(String department) {
        this.department = department;
    }

    public String title() {
        return title;
    }

    public void title(String title) {
        this.title = title;
    }

}
