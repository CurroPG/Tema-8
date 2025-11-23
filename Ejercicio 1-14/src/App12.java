import matematicas.Digitos;
public class App12 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(System.console().readLine("Introduzca un número: "));
        int digito = Integer.parseInt(System.console().readLine("Introduzca un digito: "));
        
        System.out.println("Si al "+numero+" se le pega por delante el "+digito+" da el "+Digitos.pegaporDelante(numero, digito));
    }
}
