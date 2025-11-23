import matematicas.Digitos;
public class App13 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(System.console().readLine("Introduzca un número: "));
        int digito1 = Integer.parseInt(System.console().readLine("Introduzca un digito: "));
        int digito2 = Integer.parseInt(System.console().readLine("Introduzca un digito: "));
        
        System.out.println("Al "+numero+" le cojo el trozo que va de la posición "+digito1+" a la "+digito2+" : "+Digitos.trozoDeNumero(numero, digito1, digito2));
    }
}
