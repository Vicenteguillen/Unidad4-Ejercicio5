package com.programacion4.unidad4ej5.feature.socio.dtos.request;

import jakarta.validation.constraints.*;
import java.time.LocalDate;

public class SocioCreateDTO {

    @NotBlank
private String nombre;

@NotBlank(message = "Apellido obligatorio")
private String apellido;

    @NotBlank(message = "El email es obligatorio")
    @Email(message = "Email inválido")
    private String email;

    @NotBlank(message = "El DNI es obligatorio")
    @Pattern(regexp = "\\d{8}", message = "Debe tener 8 números")
    private String dni;

    @NotNull(message = "Fecha obligatoria")
    @Past(message = "Debe ser una fecha pasada")
    private LocalDate fechaNacimiento;

    @NotBlank(message = "Teléfono obligatorio")
    @Pattern(regexp = "^\\+\\d{10,15}$", message = "Formato +549...")
    private String telefono;
}