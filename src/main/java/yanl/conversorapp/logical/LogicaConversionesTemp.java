package yanl.conversorapp.logical;

import java.text.DecimalFormat;

public class LogicaConversionesTemp implements OperacionConversion{

    @Override
    public String conversion(String tipoDeConversion, double valor) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        double resultado;
        switch (tipoDeConversion){
            
            case "De Celsius a Kelvin" -> {
                resultado = 273.15 + valor;
                return valor + " Grados Celsius son " + decimalFormat.format(resultado)+ " grados Kelvin";
            }
            case "De Celsius a Fahrenheit" ->{
                resultado = (valor * 9/5) + 32;
                return valor + " Grados Celsius son " + decimalFormat.format(resultado)+ " grados Fahrenheit";
            }
            case "De Kelvin a Celsius" ->{
                resultado = valor - 273.15;
                return valor + " Grados Kelvin son " + decimalFormat.format(resultado)+ " grados Celsius";
            }
            case "De Kelvin a Fahrenheit" ->{
                resultado = (valor - 273.15) * 9/5 + 32;
                return valor + " Grados Kelvin son " + decimalFormat.format(resultado)+ " grados Fahrenheit";
            }
            case "De Fahrenheit a Celsius" ->{
                resultado = (valor - 32) * 5/9;
                return valor + " Grados Kelvin son " + decimalFormat.format(resultado)+ " grados Celsius";
            }
            case "De Fahrenheit a Kelvin" ->{
                resultado = (valor - 32) * 5/9 + 273.15;
                return valor + " Grados Kelvin son " + decimalFormat.format(resultado)+ " grados Fahrenheit";
            }
            default -> {
                return "Tipo de conversión no soportado";
            }

        }
        
    }
    
}
