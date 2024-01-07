package com.whatsapp.api.domain.phone;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.whatsapp.api.domain.phone.type.NameStatusType;
import com.whatsapp.api.domain.phone.type.QualityRatingType;

/**
 * The type Phone number.
 *
 * @param id The ID associated with the phone number.
 * @param displayPhoneNumber The string representation of the phone number.
 * @param nameStatus The current status of the review of your business name.
 * @param codeVerificationStatus Code Verification Status
 * @param qualityRating The quality rating of the phone number based on how
 * messages have been received by recipients in recent days. Valid values are:
 * <ul>
 * <li>Green: High Quality</li>
 * <li>Yellow: Medium Quality</li>
 * <li> Red: Low Quality</li>
 * <li>NA: Quality has not been determined</li>
 * </ul>
 * @param verifiedName the verified name
 * @see <a href="https://www.facebook.com/business/help/896873687365001">About
 * WhatsApp Business Account Message Quality Rating</a>
 */
@JsonInclude(value = Include.NON_NULL)
public class PhoneNumber {

    @JsonProperty("display_phone_number")
    String displayPhoneNumber;

    @JsonProperty("quality_rating")
    QualityRatingType qualityRating;

    @JsonProperty("verified_name")
    String verifiedName;

    @JsonProperty("id")
    String id;

    @JsonProperty("code_verification_status")
    String codeVerificationStatus;

    @JsonProperty("name_status")
    NameStatusType nameStatus;

    public PhoneNumber(String displayPhoneNumber, QualityRatingType qualityRating, String verifiedName, String id, String codeVerificationStatus, NameStatusType nameStatus) {
        this.displayPhoneNumber = displayPhoneNumber;
        this.qualityRating = qualityRating;
        this.verifiedName = verifiedName;
        this.id = id;
        this.codeVerificationStatus = codeVerificationStatus;
        this.nameStatus = nameStatus;
    }

    public String displayPhoneNumber() {
        return displayPhoneNumber;
    }

    public void displayPhoneNumber(String displayPhoneNumber) {
        this.displayPhoneNumber = displayPhoneNumber;
    }

    public QualityRatingType qualityRating() {
        return qualityRating;
    }

    public void qualityRating(QualityRatingType qualityRating) {
        this.qualityRating = qualityRating;
    }

    public String verifiedName() {
        return verifiedName;
    }

    public void verifiedName(String verifiedName) {
        this.verifiedName = verifiedName;
    }

    public String id() {
        return id;
    }

    public void id(String id) {
        this.id = id;
    }

    public String codeVerificationStatus() {
        return codeVerificationStatus;
    }

    public void codeVerificationStatus(String codeVerificationStatus) {
        this.codeVerificationStatus = codeVerificationStatus;
    }

    public NameStatusType nameStatus() {
        return nameStatus;
    }

    public void nameStatus(NameStatusType nameStatus) {
        this.nameStatus = nameStatus;
    }

}
