import java.util.Scanner;




    public class Historia {
       
      public static Scanner escolha;

      public static void main(String[] args) {
            

            System.out.print("\n Estamos na Copa do Mundo 2014. Após uma copa surpreedente e favoritas eliminadas na fase de grupos"+
            ", um grande exemplo disto é a campeã de 2010: a Espanha."+
            "\n Que fez uma campanha surpreende na África do Sul em 2010 "+
            "\n Ganhando da seleção Holandesa com um placar de 1x0"+
            "\n Joga acirrado com gol marcado nos acréscimos."+
            "\n A seleção brasileira ficou na metade do caminho,"+
            "\n perdendo nas quartas de finais de 2x1 para a seleção holandesa."+
            "\n Mas voltando ao que interessa, agora disputada no Brasil, Brasil 2014, é Copa do Mundo "+
            "\n e estamos nas Semifinais com a seleção brasileira."+
            "\n Os confrotos diretos dessas semifinais são entre: "+
            "\n Brasil x Alemanha"+
            "\n Holanda x Argentina");
            Times Brasil = new Times("Brasil", 200);
            Scanner escolha = new Scanner(System.in);

           
            Capitulo semifinal = new Capitulo("\n semifinal",
                                              "\n Vamos agora acompanhar o jogo de Brasil x Alemanha. O Brasil sai do jogo com a ",
                                              Brasil, 
                                              200,
                                              new String[]{"Vitoria mesmo com os desfalques.", 
                                              "Derrota humilhante de 7x1."},
                                              escolha
                                              );

            //----------------------------SEMIFINAL-------------------------------------
            semifinal.mostrar();
            int partida = semifinal.winlose(); 
                     

            if(partida == 0){
               System.out.println("\n É impressioante o Brasil bate a Alemanha e está na final!" );
         
               System.out.println(" deixa o goleiro na saudade e manda a Alemanha pra casa.");
               Brasil.ganhar();
               System.out.println("\n A animação da torcida aumentou de 200% para " + Brasil.animação+"%");
                
               System.out.println("\n Agora temos informações que Argentina venceu a Holanda nos pênaltis."+
               " Portanto, também está na final. Uma final épica sulamericana entre Brasil e Argentina"+
               "\n Estamos na grande final da copa do mundo 2014, "+
               "onde se enfrenta os dois times da América do Sul: Brasil x Argentina.");

               // --------------------------- FINAL ----------------------------


               Capitulo fin = new Capitulo("\n Final", 
               "\n Estamos aqui na partida da final da Copa do Mundo 2014, Brasil x Argentina. Jogo de gigantes. A seleção brasileira sai do jogo com a ",
               Brasil, 
               300,
               new String[]{"Vitoria com estadio lotado e se torna hexa.", "Derrota! O sonho do hexa escorre pelas as mãos e os argentinhos comemoram."},
               escolha);
               fin.mostrar();
               int parti = fin.winlose();               

               
               if(parti == 1){
                  System.out.println(" \n O Brasil perde na final para Argentina com o placar de 1x0.");
                 
                  Brasil.perder();
                  System.out.println("A animação da torcida cai de 300% para "+Brasil.animação+"%");

                }
                else if(parti == 0){
                  
                  System.out.println(" O Brasil supera a Argentina e é o campeão do mundo 2014");
                  Brasil.ganhar();
                  System.out.println(" A animação da torcida atinge o máximo, passa de 300% para" +Brasil.animação+"%"
                  );
               }

                
                }else if(partida == 1){
               System.out.println(" \n O Brasil perde para Alemanha. ");
               
               Brasil.perder();
               System.out.println("A animação da torcida cai de 200% para "+Brasil.animação+"%");

               // ---------------------- TERCEIRO LUGAR -----------------------------
               
               Capitulo terceirolugar = new Capitulo("\n Terceiro Lugar", 
                                                    "\n Estamos aqui no jogo de disputa pelo terceiro lugar entre Brasil x Holanda. A seleção brasileira termina o jogo com a ",
                                                     Brasil, 
                                                     100,
                                                     new String[]{"Vitoria em um jogo impressionante que terminou nos penaltis.", "Derrota! Robben marca um golaço e é o craque do jogo"},
                                                     escolha);
               terceirolugar.mostrar();
               int part = terceirolugar.winlose();

               if(part == 0 ){
                  System.out.println("\n O Brasil fica em terceiro lugar na Copa do Mundo 2014.");
                 
                  System.out.println(" O Brasil bate a Holanda.");
                  Brasil.ganhar();
                  System.out.print("A animação da torcida sobe de 100% para "+Brasil.animação+"%");
               }
               if(part == 1){
                  System.out.println("\n O Brasil perde para Holanda e Holanda fica com o terceiro lugar.");
                 
                  Brasil.perder();
                  System.out.println(" A animação da torcida esgota, de 100% fomos para "+Brasil.animação+"%. Que fase!");
 

               }

            }

                  System.out.println("\n Essa foi a Copa Mundo 2014, meus amigos! Muitíssimo obrigado pela a presença"+
                  " Nos vemos em 2018 na Rússia. Até mais!");
                  escolha.close();     

              }
      }      
   
      