import matematicas.Digitos;
public class App11 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(System.console().readLine("Introduzca un número: "));
        int digito = Integer.parseInt(System.console().readLine("Introduzca un digito: "));
        
        System.out.println("Si al "+numero+" se le pega por detrás el "+digito+" da el "+Digitos.pegaporDetras(numero, digito));
    }
}
