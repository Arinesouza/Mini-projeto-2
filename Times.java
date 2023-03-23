

public class Times {
   private String nome;
   private int animação;
   Times()

   {

   }

   public Times(String nome, int animação){
    this.nome = nome;
    this.animação = animação;}

     void ganhar(){
      this.animação =animação + 100;

   }

    void perder(){
      this.animação =animação - 100;

   }

public void animação(int animação2) {
}

public String getnome(){
   return this.nome;
}
   
}