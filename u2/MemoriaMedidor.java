public class MemoriaMedidor {
    public static void main(String[] args) {
        ///////////////////////////
        /*String aux = "";
        for (int i = 0; i < 10000; i++) {
            aux = aux + Character.toChars(i).toString() + " ";
            System.out.println("---");
            System.out.println(aux);
        }
            //System.out.println(aux);
          */  
       StringBuilder sb = new StringBuilder();
       for (int i = 0; i < 10000; i++) {
            sb.append(Character.toChars(i).toString());
            sb.append("---");
            System.out.println("---");
            System.out.println(sb.toString());
        }
       // System.out.println(sb.toString());
        
    }
}
