import java.util.Scanner;

public class dividir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arreglo = { 1, 4, 6, 7, 8, 8, 127, 89 };
        System.out.println("Ingrese el valor del divisor: ");
        int divisor = Integer.parseInt(sc.nextLine());
        if (arreglo.length % divisor == 0) {
            int matriz[][] = new int[divisor][arreglo.length / divisor];
            int valor = 0;
            for (int i = 0; i < divisor; i++) {
                for (int j = 0; j < arreglo.length / divisor; j++) {
                    matriz[i][j] = arreglo[valor];
                    valor++;
                }
            }
            int suma[] = new int[divisor];
            int aux = 0;
            for (int i = 0; i < divisor; i++) {
                System.out.print("Vector: " + i + " [");
                for (int j = 0; j < arreglo.length / divisor; j++) {
                    System.out.print(matriz[i][j]);
                    if (j == (arreglo.length / divisor) - 1) {
                    } else {
                        System.out.print(", ");
                    }
                    aux += matriz[i][j];
                }
                suma[i] = aux;
                System.out.print("]\n");
            }
            int mayor = 0;
            int index = 0;
            for (int i = 0; i < suma.length; i++) {
                if (suma[i] > mayor) {
                    mayor = suma[i];
                    index = i;
                }
            }
            System.out.println("El vector mayor es: " + index + " su suma es: " + suma[index]);
        } else {
            System.out.println("No es posible este arreglo");
        }
    }
}
