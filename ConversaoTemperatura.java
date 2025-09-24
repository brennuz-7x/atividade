import java.util.Scanner;

public class ConversaoTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Conversão de Temperatura ===");
        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = sc.nextDouble();

        // Conversão para Fahrenheit
        double fahrenheit = (celsius * 9/5) + 32;

        // Conversão para Kelvin
        double kelvin = celsius + 273.15;

        // Exibindo resultados
        System.out.println("\n--- Resultado da Conversão ---");
        System.out.printf("Temperatura em Celsius: %.2f °C\n", celsius);
        System.out.printf("Temperatura em Fahrenheit: %.2f °F\n", fahrenheit);
        System.out.printf("Temperatura em Kelvin: %.2f K\n", kelvin);

        sc.close();
    }
}
