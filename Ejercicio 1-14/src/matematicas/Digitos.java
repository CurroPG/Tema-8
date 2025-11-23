package matematicas;

public class Digitos {
    public static boolean esCapicua(int x) {
        boolean esCapicua = false;
        if (x == voltea(x))
            esCapicua = true;
        return esCapicua;
    }

    public static int pegaporDelante(int x, int y) {
        int digito = 0;
        int invertido = 0;
        int aux = voltea(x);
        invertido = invertido * 10 + y;
        do {
            digito = aux % 10;
            invertido = invertido * 10 + digito;
            aux /= 10;
        } while (aux != 0);
        return invertido;
    }

    public static int pegaporDetras(int x, int y) {
        int digito = 0;
        int invertido = 0;
        int aux = voltea(x);
        do {
            digito = aux % 10;
            invertido = invertido * 10 + digito;
            aux /= 10;
        } while (aux != 0);
        invertido = invertido * 10 + y;
        return invertido;
    }

    public static int quitaPorDetras(int x, int y){
        int digito = 0;
        int posicion = 0;
        int aux = voltea(x);
        int invertido = 0;
        int numDigitos = digitos(aux);
        do {
            digito = aux % 10;
            if(posicion <= numDigitos-y)
                invertido = invertido * 10 + digito;
            posicion++;
            aux /= 10;
        } while (aux != 0);
        return invertido;
    }

    public static int quitaPorDelante(int x, int y){
        int digito = 0;
        int posicion = 0;
        int aux = voltea(x);
        int invertido = 0;
        int numDigitos = digitos(aux);
        do {
            digito = aux % 10;
            if(posicion >= numDigitos-y)
                invertido = invertido * 10 + digito;
            posicion++;
            aux /= 10;
        } while (aux != 0);
        return invertido;
    }

    public static int digitoN(int x, int y) {
        int digito = 0;
        int posicion = 0;
        int aux = voltea(x);
        do {
            digito = aux % 10;
            if(posicion == y)
                break;
            posicion++;
            aux /= 10;
        } while (aux != 0);
        return digito;
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

    public static int digitos(int x) {
        int aux = x;
        int digitos = 0;
        do {
            aux /= 10;
            digitos++;
        } while (aux != 0);
        return digitos;
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