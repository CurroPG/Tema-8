import matematicas.Digitos;
public class App3 {
    public static void main(String[] args) {
       int numero = Integer.parseInt(System.console().readLine("Introduzca un numero: ")); 

       System.out.println("El siguiente primo mayor a "+numero+" es "+Digitos.siguientePrimo(numero));
    }
}
