import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conversor conversor = new Conversor();
        int opcion;

        do {
            System.out.println("""
                    1. Dólar a Euro
                    2. Euro a Dólar
                    3. Dólar a Peso Colombiano
                    4. Peso Colombiano a Dólar
                    5. Dólar a Real Brasileño
                    6. Real Brasileño a Dólar
                    7. Salir
                    """);
            System.out.println("Indique el numero del tipo de cambio desea realizar: ");

            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 6) {
                System.out.print("Ingrese la cantidad a convertir: ");
                double cantidad = scanner.nextDouble();

                String base = "";
                String destino = "";

                switch (opcion) {
                    case 1 -> {
                        base = "USD";
                        destino = "EUR";
                    }
                    case 2 -> {
                        base = "EUR";
                        destino = "USD";
                    }
                    case 3 -> {
                        base = "USD";
                        destino = "COP";
                    }
                    case 4 -> {
                        base = "COP";
                        destino = "USD";
                    }
                    case 5 -> {
                        base = "USD";
                        destino = "BRL";
                    }
                    case 6 -> {
                        base = "BRL";
                        destino = "USD";
                    }
                }

                double tasa = conversor.obtenerTasaCambio(base, destino);
                double resultado = cantidad * tasa;
                System.out.printf("Resultado: %.2f %s%n%n", resultado, destino);
            } else if (opcion != 7) {
                System.out.println("Opción no válida. Por favor, intente de nuevo.\n");
            }
        } while (opcion != 7);
        System.out.println("Gracias por usar nuestro servicio.");
        scanner.close();
    }
}