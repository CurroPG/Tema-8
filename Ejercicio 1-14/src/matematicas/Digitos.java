package matematicas;

public class Digitos {
    public static boolean esCapicua(int x) {
        boolean esCapicua = false;
        if (x == voltea(x))
            esCapicua = true;
        return esCapicua;
    }

    public static int voltea(int x) {
        int digito = 0;
        int invertido = 0;
        int aux = x;
        do {
            digito = aux % 10;
            invertido = invertido * 10 + digito;
            aux /= 10;
        } while (aux != 0);
        return invertido;
    }

    public static int siguientePrimo(int x){
        int siguientePrimo = 0;
        while(true){
            x++;
            if(esPrimo(x)){
                siguientePrimo = x;
                break;
            }
        }
        return siguientePrimo;
    }

    public static boolean esPrimo(int x) {
        boolean esPrimo = true;
        for (int i = 2; i < x; i++) {
            if (x % i == 0)
                esPrimo = false;
        }
        return esPrimo;
    }

    public static double potencia(int x, int y){
        double potencia = 1;
        if(y >= 0)
            for(int i = 1; i <= y; i++){
                potencia*=x;
            }
            else{
                y = y * -1;
                for(int i = 1; i <= y; i++){
                    potencia*=x;
                }
                potencia = 1/potencia;
            }
        return potencia;
    }
}