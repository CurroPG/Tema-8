import matematicas.Digitos;
public class App8 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(System.console().readLine("Introduzca un número: "));
        int digito = Integer.parseInt(System.console().readLine("Introduzca un digito: "));

        System.out.println("En el "+numero+", el digito "+digito+" está en la posición "+Digitos.digitoN(numero, digito));
    }
}
