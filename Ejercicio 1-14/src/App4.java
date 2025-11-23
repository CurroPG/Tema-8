import matematicas.Digitos;
public class App4 {
    public static void main(String[] args) {
        int base = Integer.parseInt(System.console().readLine("Introduzca la base: "));
        int exponente = Integer.parseInt(System.console().readLine("Introduzca el exponente: "));
        
        System.out.println(base+"^"+exponente+" = "+Digitos.potencia(base, exponente));
    }
}
