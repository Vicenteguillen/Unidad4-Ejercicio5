package com.programacion4.unidad4ej5.feature.socio.dtos.request;

import jakarta.validation.constraints.*;
import java.util.List;

public class PlanCreateDTO {

    @NotBlank
    @Size(min = 10, max = 200)
    private String objetivo;

    @NotNull
    @Min(1)
    @Max(7)
    private Integer frecuenciaSemanal;

    @NotNull
    @DecimalMin(value = "30.0")
    @DecimalMax(value = "250.0")
    private Double pesoInicial;

    @NotNull
    @DecimalMin(value = "1.0")
    @DecimalMax(value = "2.5")
    private Double altura;

    @NotEmpty
    @Size(min = 3)
    private List<String> ejercicios;
}