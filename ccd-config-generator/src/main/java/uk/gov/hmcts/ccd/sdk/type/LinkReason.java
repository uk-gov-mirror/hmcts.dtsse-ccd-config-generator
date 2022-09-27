package uk.gov.hmcts.ccd.sdk.type;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
// TODO: Revisit this enum as this data needs to taken from Reference data
public enum LinkReason {
    REASON_1("Reason 1", "Reason desc");

    private final String reason;
    private final String otherDescription;
}
