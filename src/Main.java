import java.util.Scanner;

public class Main {
    public static void main ( String[] args){
        System.out.println("####### Calculadora de Divisas #######");

        Scanner entrada = new Scanner(System.in);

        // pedimos los datos
        System.out.print("Introduce la moneda de origen: ");
        String monedaOrigen = entrada.nextLine();

        System.out.print("Introduce la moneda destino: ");
        String monedaDestino = entrada.nextLine();

        System.out.print("Introduce la cantidad a cambiar: ");
        double cantidad = entrada.nextDouble();

        System.out.print("Introduce la tasa de conversión: ");
        double tasa = entrada.nextDouble();

        // creamos el objeto
        CalculadoraDivisas calculadoraDivisas = new CalculadoraDivisas();

        // realizamos el cálculo
        double resultado = calculadoraDivisas.convertir(cantidad, tasa);

        // mostramos el resultado
        System.out.printf("%.2f %s equivalen a %.2f %s%n", cantidad, monedaOrigen,
                resultado, monedaDestino);

    }
}
