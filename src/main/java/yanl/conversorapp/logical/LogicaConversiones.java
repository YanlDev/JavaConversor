package yanl.conversorapp.logical;
import java.text.DecimalFormat;

public class LogicaConversiones implements OperacionConversion {
    
    private static final double TIPO_CAMBIO_DOLARES = 3.72;
    private static final double TIPO_CAMBIO_EUROS = 4.04;
    private static final double TIPO_CAMBIO_LIBRAS = 4.73;
    private static final double TIPO_CAMBIO_YEN = 0.025;
    private static final double TIPO_CAMBIO_WON = 0.0028;
    
    @Override
    public String conversion(String tipoDeConversion, double valor) {
       DecimalFormat decimalFormat = new DecimalFormat("#.##");
       double resultado;
        switch (tipoDeConversion) {
            case "De Soles a Dólares" -> {
                resultado = valor / TIPO_CAMBIO_DOLARES;
                return decimalFormat.format(resultado)+ " Dólares";
            }
            case "De Soles a Euros" -> {
                resultado = valor / TIPO_CAMBIO_EUROS;
                return decimalFormat.format(resultado)+ " Euros";
            }
            case "De soles a Libras Esterlinas" -> {
                resultado = valor / TIPO_CAMBIO_LIBRAS;
                return decimalFormat.format(resultado) + "Libras Esterlinas";
            }
            case "De Soles a Yen Japonés" -> {
                resultado = valor / TIPO_CAMBIO_YEN;
                return decimalFormat.format(resultado) + " Yen Japonés";
            }
            case "De Soles a Won Surcoreano" -> {
                resultado = valor / TIPO_CAMBIO_WON;
                return decimalFormat.format(resultado) + " Won Surcoreano";
            }
            case "De Dólares a Soles" -> {
                resultado = valor * TIPO_CAMBIO_DOLARES;
                return decimalFormat.format(resultado) + " Soles";
            }
            case "De Euros a Soles" -> {
                resultado = valor * TIPO_CAMBIO_EUROS;
                return decimalFormat.format(resultado) + " Soles";
            }
            case "De Libras Esterlinas a Soles" -> {
                resultado = valor * TIPO_CAMBIO_LIBRAS;
                return decimalFormat.format(resultado) + " Soles";
            }
            case "De Yen Japonés a Soles" -> {
                resultado = valor * TIPO_CAMBIO_YEN;
                return decimalFormat.format(resultado) + " Soles";
            }
            case "De Won Surcoreano a Soles" -> {
                resultado = valor * TIPO_CAMBIO_WON;
                return decimalFormat.format(resultado) + " Soles";
            }
            default -> {
                return "Tipo de conversión no soportado";
            }
            
        }
        
    }
    
}
