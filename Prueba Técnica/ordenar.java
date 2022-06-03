import java.util.Arrays;

public class ordenar {

    public static void main(String[] args) {

        String[] Cadenas = { "abc", "ujk", "zzy", "ahj", "aaz", "oip" };
        int[] ValorCadenas = new int[Cadenas.length];

        for (int i = 0; i < Cadenas.length; i++) {
            int valor = 0;
            for (int j = 0; j < Cadenas[i].length(); j++) {
                char valore = Cadenas[i].charAt(j);
                valor += valore - (96);
                ValorCadenas[i] = valor;
            }
        }

        int[] ValorCadenasOrdenadas = Arrays.copyOf(ValorCadenas, ValorCadenas.length);
        Arrays.sort(ValorCadenasOrdenadas);

        String[] CadenasOrdenadas = new String[Cadenas.length];
        for (int i = 0; i < ValorCadenasOrdenadas.length; i++) {
            for (int j = 0; j < ValorCadenas.length; j++) {
                if (ValorCadenasOrdenadas[i] == ValorCadenas[j]) {
                    CadenasOrdenadas[i] = Cadenas[j];
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(ValorCadenas));
        System.out.println(Arrays.toString(ValorCadenasOrdenadas));
        System.out.println(Arrays.toString(CadenasOrdenadas));
    }
}
