/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Temperaturas;

/**
 * @author kathp
 */

public class ConversorTemperatura {

    public double convertir(double temperatura, String tipoConversion) {

        if (tipoConversion.equals("CelsiusFahrenheit")) {
            return (temperatura * 9 / 5) + 32;
        }

        if (tipoConversion.equals("FahrenheitCelsius")) {
            return (temperatura - 32) * 5 / 9;
        }

        if (tipoConversion.equals("CelsiusKelvin")) {
            return temperatura + 273.15;
        }

        if (tipoConversion.equals("KelvinCelsius")) {
            return temperatura - 273.15;
        }

        return 0;
    }
}
