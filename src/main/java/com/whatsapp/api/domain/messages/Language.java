package com.whatsapp.api.domain.messages;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.whatsapp.api.domain.templates.type.LanguageType;

/**
 * @param code Language code. See {@link LanguageType}
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Language {

    @JsonProperty("code")
    LanguageType code;

    public Language() {
    }

    public Language(LanguageType code) {
        this.code = code;
    }

    public LanguageType code() {
        return code;
    }

    public void code(LanguageType code) {
        this.code = code;
    }

}
