# Conversor de Monedas en Java

Este es un programa de consola en Java que permite convertir entre diferentes monedas utilizando una API de tasas de cambio en tiempo real.

## 💡 Funcionalidades

- Conversión entre las siguientes monedas:
  - Dólar ↔ Euro
  - Dólar ↔ Peso Colombiano
  - Dólar ↔ Real Brasileño
- Consulta de tasas de cambio en tiempo real a través de la API de ExchangeRate.
- Interfaz por consola fácil de usar.
- Permite repetir conversiones hasta que el usuario elija salir.

## 🚀 Cómo ejecutar

1. Asegúrate de tener Java 17 o superior instalado.
2. Agrega la librería **Gson** al proyecto (por ejemplo, mediante Maven, Gradle o añadiendo el `.jar` manualmente).
3. Ejecuta el programa desde tu IDE o línea de comandos:

```bash
javac Main.java Conversor.java TasaCambio.java
java Main
