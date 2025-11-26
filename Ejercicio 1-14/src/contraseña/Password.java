package contraseña;

public interface Password {

    /*
     * ===============================
     * Nivel 1 — Funciones de Análisis
     * de Caracteres Individuales
     * ===============================
     */
    public static boolean esEspacio(char c) {
        if (c == ' ')
            return true;
        return false;
    }

    public static boolean estaEntre(char c, char inicio, char fin) {
        if (c >= inicio && c <= fin)
            return true;
        return false;
    }

    public static boolean esDigito(char c) {
        if (estaEntre(c, '0', '9'))
            return true;
        return false;
    }

    public static boolean esMinuscula(char c) {
        if (estaEntre(c, 'a', 'z'))
            return true;
        return false;
    }

    public static boolean esMayuscula(char c) {
        if (estaEntre(c, 'A', 'Z'))
            return true;
        return false;
    }

    public static boolean esLetra(char c) {
        if (esMayuscula(c) || esMinuscula(c))
            return true;
        return false;
    }

    public static boolean esSimbolo(char c) {
        if (!esLetra(c) && !esEspacio(c) && !esDigito(c))
            return true;
        return false;
    }

    /*
     * ===============================
     * Nivel 2 — Funciones de Análisis
     * de Cadenas
     * ===============================
     */

    public static boolean contieneDigito(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (esDigito(s.charAt(i)))
                return true;
        }
        return false;
    }

    public static boolean contieneMinuscula(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (esMinuscula(s.charAt(i)))
                return true;
        }
        return false;
    }

    public static boolean contieneMayuscula(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (esMayuscula(s.charAt(i)))
                return true;
        }
        return false;
    }

    public static boolean contieneSimbolo(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (esSimbolo(s.charAt(i)))
                return true;
        }
        return false;
    }

    public static boolean esSoloLetras(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (esLetra(s.charAt(i)))
                return true;
        }
        return false;
    }

    /*
     * ===============================
     * Nivel 3 — Funciones de Análisis
     * General
     * ===============================
     */

    public static boolean tieneLongitudMinima(String password, int minimo) {
        if (password.length() >= minimo)
            return true;
        return false;
    }

    public static int contarTiposCaracteres(String password) {
        int tipos = 0;
        if (contieneDigito(password))
            tipos++;
        if (contieneMayuscula(password))
            tipos++;
        if (contieneMinuscula(password))
            tipos++;
        if (contieneSimbolo(password))
            tipos++;
        return tipos;
    }

    /*
     * ===============================
     * Nivel 4 — Funciones de
     * Sanitización
     * ===============================
     */

    private static int primerNoEspacio(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!esEspacio(s.charAt(i)))
                return i;
        }
        return 0;
    }

    private static int ultimoNoEspacio(String s) {
        for (int i = s.length(); i > 0; i--) {
            if (!esEspacio(s.charAt(i)))
                return i;
        }
        return 0;
    }

    public static String eliminarEspaciosExtremos(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (!esEspacio(s.charAt(i)) && i < ultimoNoEspacio(s)
                    && i > primerNoEspacio(s))
                res = res + s.charAt(i);
        }
        return res;
    }

    public static String eliminarEspaciosInternos(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (!esEspacio(s.charAt(i)) && i > ultimoNoEspacio(s)
                    && i < primerNoEspacio(s))
                res = res + s.charAt(i);
        }
        return res;
    }

    public static String sanitizarPassword(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (!esEspacio(s.charAt(i)))
                res = res + s.charAt(i);
        }
        return res;
    }

    /*
     * ===============================
     * Nivel 4 — Funciones de
     * Sanitización
     * ===============================
     */

    public static String clasificarPassword(String password, int longitudMinima) {
        String seguridad = "";
        if (password == null)
            seguridad = "INVALIDA";
        if (!tieneLongitudMinima(password, longitudMinima)
                || contarTiposCaracteres(password) == 1)
            seguridad = "DEBIL";
        if (contarTiposCaracteres(password) == 2)
            seguridad = "MEDIA";
        if (contarTiposCaracteres(password) > 2)
            seguridad = "FUERTE";
        return seguridad;
    }
}
