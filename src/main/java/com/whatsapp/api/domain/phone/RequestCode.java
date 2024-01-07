package com.whatsapp.api.domain.phone;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.whatsapp.api.domain.phone.type.CodeMethodType;
import com.whatsapp.api.domain.templates.type.LanguageType;

/**
 * The type Request code.
 *
 * @param codeMethod Required. Specifies the method for verification. Supported
 * options are: SMS or VOICE.
 * @param language Required. Specifies your locale.
 */
public class RequestCode {

    @JsonProperty("code_method")
    CodeMethodType codeMethod;

    @JsonProperty("language")
    LanguageType language;

    public RequestCode(CodeMethodType codeMethod, LanguageType language) {
        this.codeMethod = codeMethod;
        this.language = language;
    }

    public CodeMethodType codeMethod() {
        return codeMethod;
    }

    public void codeMethod(CodeMethodType codeMethod) {
        this.codeMethod = codeMethod;
    }

    public LanguageType language() {
        return language;
    }

    public void language(LanguageType language) {
        this.language = language;
    }

}
