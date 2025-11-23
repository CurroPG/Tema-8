import matematicas.Digitos;
public class App10 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(System.console().readLine("Introduzca un número: "));
        int digito = Integer.parseInt(System.console().readLine("Introduzca un digito: "));
        
        System.out.println("Si al "+numero+" se le quitan por detrás "+digito+" digitos, se queda como "+Digitos.quitaPorDelante(numero, digito));
    }
}
