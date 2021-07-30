Feature:  Se debe ingresar a la pagina empleos choucair y seleccionar un empleo disponible

@scenario
Scenario: ingresar a la de empleos luego seleccionar un empleo
    Given Harold nuevo aspirante ingresa usuario y clave
    When consulta la vacantes disponible y aplica
    Then puede ver la oferta aplicada