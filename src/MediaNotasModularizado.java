package tema2_debug;

import java.util.Scanner;

public class MediaNotasModularizado {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numAlumnos = pedirNumeroAlumnos(sc);
        double media = calcularMedia(numAlumnos, sc);
        mostrarResultado(media);
        sc.close();
    }

    private static int pedirNumeroAlumnos(Scanner sc) {
        System.out.print("Introduce el número de alumnos: ");
        return sc.nextInt();
    }

    private static double calcularMedia(int numAlumnos, Scanner sc) {
        int contador = 0;
        double suma = 0;

        while (contador < numAlumnos) {
            System.out.print("Introduce la nota del alumno " + contador + ": ");
            double nota = sc.nextDouble();

            if (nota >= 0 && nota <= 10) {
                suma += nota;
                contador++;
            } else {
                System.out.println("Error: la nota debe estar entre 0 y 10");
            }
        }
        return suma / numAlumnos;
    }

    private static void mostrarResultado(double media) {
        System.out.println("La media del grupo es: " + media);
    }
}