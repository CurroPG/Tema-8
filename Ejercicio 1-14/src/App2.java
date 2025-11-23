import matematicas.Digitos;

public class App2 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(System.console().readLine("Introduzca un numero: "));
        
        System.out.println((Digitos.esPrimo(numero)) ? "El " + numero + " es primo" : "El " + numero + " no es primo");
    }
}
