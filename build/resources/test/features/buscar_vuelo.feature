# Autor:Leidy Vanesa Fernandez

@stories
Feature: Busqueda de Vuelos en Latam Airlines
  Yo como usuario del sitio web Latam Airlines
  Quiero realizar busquedas de vuelos
  Para conocer las opciones disponibles y sus precios.

  /*Background:
    Given Vanesa esta en la pagina de inicio de vuelos Latam
*/
  @scenario1
  Scenario: Automatizacion de busqueda de vuelos en Latam Airlines
    Given Vanesa esta en la pagina de inicio de Latam Airlines
    When Ella ingresa los siguientes detalles de la reserva

      | atrOrigen               | atrDestino | atrFechaIda    | atrFechaVuelta     | atrPasajero |
      | Alfonso Bonilla Aragon  |El dorado   | 22 junio 2024  | 30 junio 2024    | 1           |
    Then deberia ver una lista de vuelos disponibles para el destino y las fechas especificadas
