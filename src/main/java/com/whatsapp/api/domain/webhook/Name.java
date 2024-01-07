package com.whatsapp.api.domain.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Name.
 */
public class Name {

    @JsonProperty("prefix")
    String prefix;

    @JsonProperty("last_name")
    String lastName;

    @JsonProperty("middle_name")
    String middleName;

    @JsonProperty("suffix")
    String suffix;

    @JsonProperty("first_name")
    String firstName;

    @JsonProperty("formatted_name")
    String formattedName;

    public Name(String prefix, String lastName, String middleName, String suffix, String firstName, String formattedName) {
        this.prefix = prefix;
        this.lastName = lastName;
        this.middleName = middleName;
        this.suffix = suffix;
        this.firstName = firstName;
        this.formattedName = formattedName;
    }

    public String prefix() {
        return prefix;
    }

    public void prefix(String prefix) {
        this.prefix = prefix;
    }

    public String lastName() {
        return lastName;
    }

    public void lastName(String lastName) {
        this.lastName = lastName;
    }

    public String middleName() {
        return middleName;
    }

    public void middleName(String middleName) {
        this.middleName = middleName;
    }

    public String suffix() {
        return suffix;
    }

    public void suffix(String suffix) {
        this.suffix = suffix;
    }

    public String firstName() {
        return firstName;
    }

    public void firstName(String firstName) {
        this.firstName = firstName;
    }

    public String formattedName() {
        return formattedName;
    }

    public void formattedName(String formattedName) {
        this.formattedName = formattedName;
    }

}
