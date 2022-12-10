
public class Times {
   String nome;
   int animação;
   Times()

   {

   }

   Times(String nome, int animação){
    this.nome = nome;
    this.animação = animação;}

   void ganhar(){
      this.animação =animação + 100;

   }

   void perder(){
      this.animação =animação - 100;

   }
   
}