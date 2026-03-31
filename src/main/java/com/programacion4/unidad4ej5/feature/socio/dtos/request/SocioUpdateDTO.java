package com.programacion4.unidad4ej5.feature.socio.dtos.request;

import jakarta.validation.constraints.*;

public class SocioUpdateDTO {

    @NotNull(groups = ValidationGroups.OnUpdate.class)
    @Null(groups = ValidationGroups.OnCreate.class)
    private Long id;

    @Pattern(
        regexp = "^(https?:\\/\\/.*)$",
        message = "Debe ser una URL válida"
    )
    private String urlFoto;

    @Size(min = 3, max = 15)
    @Pattern(regexp = "^\\S+$", message = "No debe contener espacios")
    private String alias;
}