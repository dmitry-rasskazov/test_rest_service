package rasskazov.laba.Model;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@Builder
public class Response {
    @NotBlank
    @Size(max = 32)
    private String uid;

    @NotBlank
    @Size(max = 32)
    private String operationUid;

    @NotBlank
    private String systemTime;

    @NotBlank
    private String code;

    @NotBlank
    private String errorCode;

    @NotBlank
    private String errorMessage;
}
