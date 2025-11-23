import matematicas.Digitos;
public class App6 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(System.console().readLine("Introduzca un número: "));

        System.out.println("El "+numero+" volteado es "+Digitos.voltea(numero));
    }
}
