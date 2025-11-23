import matematicas.Digitos;

public class App1 {

    public static void main(String[] args) throws Exception {
        int numero = Integer.parseInt(System.console().readLine("Introduzca un numero: "));

        System.out.println((Digitos.esCapicua(numero)) ? "El " + numero + " es capicúa" : "El " + numero + " no es capicúa");
        
    }
}
