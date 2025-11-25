package matematicas;

public class Digitos {

    public static boolean esCapicua(int numero) {
        if (numero == voltea(numero))
            return true;
        return false;
    }

    public static int juntaNumeros(int numero1, int numero2) {
        int digitosSegundo = digitos(numero2);
        for (int i = 0; i < digitosSegundo; i++) {
            numero1 = pegaporDetras(numero1, digitoN(numero2, i));
        }
        return numero1;
    }

    public static int trozoDeNumero(int numero, int inicio, int fin) {
        return quitaPorDelante(quitaPorDetras(numero, digitos(numero) - fin), digitos(numero) - inicio - 1);
    }

    public static int pegaporDelante(int numero, int digito) {
        return juntaNumeros(digito, numero);
    }

    public static int pegaporDetras(int numero, int digito) {
        return numero * 10 + digito;
    }

    public static int quitaPorDetras(int numero, int digito) {
        return (int) (numero / potencia(10, digito));
    }

    public static int quitaPorDelante(int numero, int digitos) {
        return numero % (int) potencia(10, digitos(numero) - digitos);
    }

    public static int digitoN(int numero, int posicion) {
        return trozoDeNumero(numero, posicion, posicion);
    }

    public static int voltea(int numero) {
        int digito = 0;
        int invertido = 0;
        do {
            digito = numero % 10;
            invertido = invertido * 10 + digito;
            numero /= 10;
        } while (numero != 0);
        return invertido;
    }

    public static int digitos(int numero) {
        int digitos = 0;
        do {
            numero /= 10;
            digitos++;
        } while (numero != 0);
        return digitos;
    }

    public static int siguientePrimo(int numero) {
        while (true) {
            numero++;
            if (esPrimo(numero)) {
                return numero;
            }
        }
    }

    public static boolean esPrimo(int numero) {
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0)
                return false;
        }
        return true;
    }

    public static double potencia(int base, int exponente) {
        if (exponente >= 0)
            for (int i = 2; i <= exponente; i++) {
                base *= base;
            }
        else {
            exponente = exponente * -1;
            for (int i = 2; i <= exponente; i++) {
                base *= base;
            }
            base = 1 / base;
        }
        return base;
    }
}