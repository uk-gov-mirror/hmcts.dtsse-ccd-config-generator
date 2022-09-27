package uk.gov.hmcts.ccd.sdk.type;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uk.gov.hmcts.ccd.sdk.api.ComplexType;

@NoArgsConstructor
@Builder
@Data
@ComplexType(name = "CaseLink", generate = false)
public class CaseLink {

  @JsonProperty("CaseReference")
  private String caseReference;

  @JsonProperty("ReasonForLink")
  private LinkReason[] reasonForLink;

  @JsonProperty("CreatedDateTime")
  private LocalDateTime createdDateTime;

  @JsonProperty("CaseType")
  private String caseType;

  @JsonCreator
  public CaseLink(@JsonProperty("CaseReference") String caseReference,
                  @JsonProperty("ReasonForLink") LinkReason[] reasonForLink,
                  @JsonProperty("CreatedDateTime") LocalDateTime createdDateTime,
                  @JsonProperty("CaseType") String caseType) {
    this.caseReference = caseReference;
    this.reasonForLink = reasonForLink;
    this.createdDateTime = createdDateTime;
    this.caseType = caseType;
  }
}
