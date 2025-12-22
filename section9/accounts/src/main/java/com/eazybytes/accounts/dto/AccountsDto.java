package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Schema(
        name = "Accounts",
        description = "Schema to hold Account information"
)
@Data
public class AccountsDto {

    @Schema(
            description = "Account Number of Eazy Bank account", example = "3454433243"
    )
    @NotEmpty(message = "Account Number cannot be null or empty")
    @Pattern(regexp = "^[0-9]{10}$", message = "Account Number must be 10 digits")
    private Long accountNumber;

    @Schema(
            description = "Account type of Eazy Bank account", example = "Savings"
    )
    @NotEmpty(message = "Account Type cannot be null or empty")
    private String accountType;

    @Schema(
            description = "Branch Address of Eazy Bank account", example = "123, Main Street, NY"
    )
    @NotEmpty(message = "Branch Address cannot be null or empty")
    private String branchAddress;
}
