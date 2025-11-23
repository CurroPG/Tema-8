import matematicas.Digitos;
public class App7 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(System.console().readLine("Introduzca un número: "));
        int posicion = Integer.parseInt(System.console().readLine("Introduzca un digito: "));

        System.out.println("En la posicion "+posicion+" del "+numero+" está el "+Digitos.digitoN(numero,posicion));
    }
}
