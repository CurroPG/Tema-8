import matematicas.Digitos;
public class App5 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(System.console().readLine("Introduzca un número: "));

        System.out.println("El número "+numero+" tiene "+Digitos.digitos(numero)+" dígito/s");
    }
}
