import matematicas.Digitos;
public class App14 {
    public static void main(String[] args) {
        int numero1 = Integer.parseInt(System.console().readLine("Introduzca un número: "));
        int numero2 = Integer.parseInt(System.console().readLine("Introduzca un digito: "));
        
        System.out.println("Juntando el "+numero1+" y el "+numero2+" da el "+Digitos.juntaNumeros(numero1, numero2));
    }
}
