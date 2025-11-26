import contraseña.Password;
public class Contraseña {
    public static void main(String[] args) {
        System.out.println(Password.clasificarPassword("Hola123!", 10));
        System.out.println(Password.clasificarPassword("holaholahola", 10));
        System.out.println(Password.clasificarPassword("Hola123", 10));
        System.out.println(Password.clasificarPassword("12345678", 10));
        System.out.println(Password.clasificarPassword("!!!!AAAA", 10));
        }
}
