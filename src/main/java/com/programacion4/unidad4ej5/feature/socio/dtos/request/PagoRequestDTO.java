package com.programacion4.unidad4ej5.feature.socio.dtos.request;

import jakarta.validation.constraints.*;
import java.math.BigDecimal;
import java.time.LocalDate;

public class PagoRequestDTO {

    @NotNull
    @DecimalMin(value = "1000.00")
    @Digits(integer = 10, fraction = 2)
    private BigDecimal monto;

    @NotBlank
    @Pattern(regexp = "PAY-[A-Z0-9]{4}-[A-Z0-9]{4}")
    private String codigoTransaccion;

    @NotNull
    @Future
    private LocalDate fechaVencimiento;

    @NotBlank
    @Pattern(regexp = "EFECTIVO|DEBITO|CREDITO|TRANSFERENCIA")
    private String tipoPago;
}