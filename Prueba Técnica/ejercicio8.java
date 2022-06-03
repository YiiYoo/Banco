import java.util.Arrays;
import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número positivo: ");
        int numero = sc.nextInt();
        int[] arreglo = new int[numero];
        int suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = i + 1;
            if (arreglo[i] % 2 != 0) {
                arreglo[i] = arreglo[i] * (-1);
            }
        }
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }
        System.out.println("La suma es: " + suma);
        System.out.println(Arrays.toString(arreglo));
    }
}
