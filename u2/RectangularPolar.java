public class RectangularPolar {

    public float trasformarTextoNumero(String cadena) {
        //float numero = 0.0f;
        String num = "";

        for (int j = 0; j < cadena.length(); j++) {
            if (Character.isDigit(cadena.charAt(j)) || cadena.charAt(j) == '.')
                num = num + cadena.charAt(j);
        }
        return Float.parseFloat(num);
    }
    public static void main(String[] args) {
        String cadena = "(5;7.8)";
        float x = 0.0f;
        float y = 0.0f;
        String aux = "";
        RectangularPolar rp = new RectangularPolar();
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == ';') {             // TODO
                x = rp.trasformarTextoNumero(aux);
                aux = "";
            } else {
                aux = aux + cadena.charAt(i);
            }            
        }
        
        
        y = rp.trasformarTextoNumero(aux);
        System.out.println("X: " + x + " y: " + y);
    }
}
