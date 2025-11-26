import contraseña.Password;
public class Contraseña {
    public static void main(String[] args) {
        Password.clasificarPassword("Hola123!", 10);
        Password.clasificarPassword("holaholahola", 10);
        Password.clasificarPassword("Hola123", 10);
        Password.clasificarPassword("12345678", 10);
        Password.clasificarPassword("!!!!AAAA", 10);
        }
}
