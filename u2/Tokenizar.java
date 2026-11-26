public class Tokenizar {
    public static void main(String[] args) {
        // cadena = "nagua,1, 4, ana, brigit, guallas, 6"
        /*
         * nagua
         * 1
         * 4
         * ana
         * 
         */
        String cadena = "nagua,1, 4, ana, brigit, guallas, 6";
        String aux = "";
        for (int i = 0; i < cadena.length(); i++) {
            
            if(cadena.charAt(i) == ',') {
                System.out.println(aux.trim());
                aux = "";
            } else {
                aux = aux+cadena.charAt(i);
                System.out.println("Es numero--> "+Character.isDigit(cadena.charAt(i)));
                System.out.println("Es letra--> "+Character.isLetter(cadena.charAt(i)));
            }
        }
    }
}
