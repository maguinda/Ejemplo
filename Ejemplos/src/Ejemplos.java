
import javax.swing.JOptionPane;
import java.util.Scanner;
/*
 * Ejemplos a probar
 */
public class Ejemplos {
  public static void main(String[] argumentos) {
        float celsius;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa los grados celsius: ");
        celsius = sc.nextFloat();
        // Calcular
        float fahrenheit = celsiusAFahrenheit(celsius);
        System.out.printf("%f grados celsius son %f grados fahrenheit", celsius, fahrenheit);
    }

    public static float celsiusAFahrenheit(float celsius) {
        return (celsius * 1.8f) + 32;
    }

    public static float fahrenheitACelsius(float fahrenheit) {
        return (fahrenheit - 32) / 1.8f;
    }
        
}
