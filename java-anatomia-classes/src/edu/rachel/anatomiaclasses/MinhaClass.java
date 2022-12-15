public class MinhaClass {
    
   public static void main (String [] args) {
      String primeiroNome = "Rachel";
      String segundoNome = "Sales";
      String nomeInteiro = nomeCompleto(primeiroNome,segundoNome);
      System.out.println(nomeInteiro);
   }

   public static String nomeCompleto (String primeiroNome, String segundoNome) {
      return primeiroNome.concat(" ").concat(segundoNome);
   }

  

}
