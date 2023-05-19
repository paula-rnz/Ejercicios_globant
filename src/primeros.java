import java.util.Arrays;
import java.util.Scanner;

public class primeros {


    public static void main(String[] args) {

        ejercicio16();

    }


    public void ejercicio1(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        int suma = num1 + num2;
        System.out.println("La suma es: " + suma);
    }


    public void ejercicio2(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Hola, " + nombre);
    }


    public void ejercicio3(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();

        String enMayusculas = frase.toUpperCase();
        String enMinusculas = frase.toLowerCase();

        System.out.println("En mayúsculas: " + enMayusculas);
        System.out.println("En minúsculas: " + enMinusculas);
    }


    public void ejercicio4(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = 32 + (9 * celsius / 5);

        System.out.println("La temperatura en grados Fahrenheit es: " + fahrenheit);
    }


    public void ejercicio5(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        int doble = numero * 2;
        int triple = numero * 3;
        double raizCuadrada = Math.sqrt(numero);

        System.out.println("El doble del número es: " + doble);
        System.out.println("El triple del número es: " + triple);
        System.out.println("La raíz cuadrada del número es: " + raizCuadrada);
    }



    public void ejercicio6(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }
    }


    public void ejercicio7(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();

        if (frase.equals("eureka")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }


    public void ejercicio8(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una frase o palabra: ");
        String texto = scanner.nextLine();

        if (texto.length() == 8) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }


    public void ejercicio9(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una frase o palabra: ");
        String texto = scanner.nextLine();

        if (texto.substring(0, 1).equalsIgnoreCase("A")) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }


    public void ejercicio10(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor límite positivo: ");
        int limite = scanner.nextInt();

        int suma = 0;
        int numero;

        do {
            System.out.print("Ingrese un número: ");
            numero = scanner.nextInt();
            suma += numero;
        } while (suma <= limite);

        System.out.println("La suma de los números superó el límite inicial.");

    }

    public void ejercicio11(){
        Scanner scanner = new Scanner(System.in);

        int opcion;
        int num1, num2;
        double resultado;
        char confirmacion;

        do {
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();

            System.out.print("Ingrese el primer número: ");
            num1 = scanner.nextInt();
            System.out.print("Ingrese el segundo número: ");
            num2 = scanner.nextInt();

            switch (opcion) {
                case 1:
                    resultado = num1 + num2;
                    System.out.println("El resultado de la suma es: " + resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.println("El resultado de la resta es: " + resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.println("El resultado de la multiplicación es: " + resultado);
                    break;
                case 4:
                    if (num2 != 0) {
                        resultado = (double) num1 / num2;
                        System.out.println("El resultado de la división es: " + resultado);
                    } else {
                        System.out.println("No se puede dividir entre cero.");
                    }
                    break;
                case 5:
                    System.out.print("¿Está seguro que desea salir del programa (S/N)? ");
                    confirmacion = scanner.next().charAt(0);
                    if (Character.toUpperCase(confirmacion) == 'S') {
                        System.out.println("Saliendo del programa...");
                        return;
                    }
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, elija una opción válida.");
                    break;
            }
        } while (opcion != 5);
    }


    public void ejercicio12(){
        Scanner scanner = new Scanner(System.in);

        int lecturasCorrectas = 0;
        int lecturasIncorrectas = 0;

        String secuencia;

        do {
            System.out.print("Ingrese una secuencia: ");
            secuencia = scanner.nextLine();

            if (secuencia.equals("&&&&&")) {
                break;
            }

            if (secuencia.length() == 5 && secuencia.charAt(0) == 'X' && secuencia.charAt(4) == 'O') {
                lecturasCorrectas++;
            } else {
                lecturasIncorrectas++;
            }
        } while (true);

        System.out.println("Lecturas correctas: " + lecturasCorrectas);
        System.out.println("Lecturas incorrectas: " + lecturasIncorrectas);
    }

    public void ejercicio13(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del cuadrado: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }


    public void ejercicio14(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de euros: ");
        double euros = scanner.nextDouble();

        System.out.print("Ingrese la moneda a convertir (libras/dólares/yenes): ");
        String moneda = scanner.next();

        convertirMoneda(euros, moneda);
    }


    public void convertirMoneda(double euros, String moneda) {
        double conversion = 0;

        switch (moneda.toLowerCase()) {
            case "libras":
                conversion = euros * 0.86;
                System.out.println(euros + " euros equivalen a " + conversion + " libras.");
                break;
            case "dólares":
                conversion = euros * 1.28611;
                System.out.println(euros + " euros equivalen a " + conversion + " dólares.");
                break;
            case "yenes":
                conversion = euros * 129.852;
                System.out.println(euros + " euros equivalen a " + conversion + " yenes.");
                break;
            default:
                System.out.println("Moneda no válida. Por favor, ingrese una moneda válida (libras/dólares/yenes).");
                break;
        }
    }

    public void ejercicio15(){

        int[] vector = new int[100];

        for (int i = 0; i < 100; i++) {
            vector[i] = 100 - i;
        }

        // Mostrar los números por pantalla
        for (int i = 0; i < 100; i++) {
            System.out.println(vector[i]);
        }
    }


    public static void ejercicio16(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del vector: ");
        int n = scanner.nextInt();

        int[] vector = new int[n];

        // Rellenar el vector con valores aleatorios
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 100); // Números aleatorios entre 0 y 99
        }

        System.out.print("Ingrese un número a buscar: ");
        int numeroBuscado = scanner.nextInt();

        // Buscar el número en el vector
        boolean encontrado = false;
        int repeticiones = 0;
        int[] posicion = new int[n];

        for (int i = 0; i < n; i++) {
            if (vector[i] == numeroBuscado) {
                encontrado = true;
                posicion[repeticiones]=i;
                repeticiones++;
            }
        }

        int[] nuevoPosicion = new int[repeticiones];

        for (int i = 0; i < repeticiones; i++) {
            nuevoPosicion[i] = posicion[i];
        }

        if (encontrado) {
            System.out.println("El número " + numeroBuscado + " si se encuentra en el vector, en la posicion" + Arrays.toString(nuevoPosicion));
            if (repeticiones > 1) {
                System.out.println("El número se repite " + repeticiones + " veces.");
            } else {
                System.out.println("El número se repite una vez.");
            }
        } else {
            System.out.println("El número " + numeroBuscado + " no se encuentra en el vector.");
        }

    }


    public void ejercicio17(){

    }


    public void ejercicio18(){

    }


    public void ejercicio19(){

    }


    public void ejercicio20(){

    }



}
