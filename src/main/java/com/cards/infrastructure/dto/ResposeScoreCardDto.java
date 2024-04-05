package com.cards.infrastructure.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;

@Schema(
        name = "Response",
        description = "Schema to hold successful response information"
)
@Data
@AllArgsConstructor
public class ResposeScoreCardDto {

    @NotEmpty(message = "Type can not be a null or empty")
    @Schema(
            description = "Type of card", example = ""
    )
    private String typeCard;


    @NotEmpty(message = "Franchice can not be a null or empty")
    @Schema(
            description = "Franchice card", example = ""
    )
    private String franchiceCard;



    @NotEmpty(message = "points can not be empty, null or cero")
    @Schema(
            description = "Points", example = "34"
    )
    private int points;


}
