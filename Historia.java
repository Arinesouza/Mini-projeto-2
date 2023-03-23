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
                                              escolha
                                              );

            //----------------------------SEMIFINAL-------------------------------------
            semifinal.mostrar();
                     

               // --------------------------- FINAL ----------------------------


               Capitulo fin = new Capitulo("\n Final", 
               "\n Estamos aqui na partida da final da Copa do Mundo 2014, Brasil x Argentina. Jogo de gigantes. A seleção brasileira sai do jogo com a ",
               Brasil, 
               300,
               escolha);
               fin.mostrar();               
              
               // ---------------------- TERCEIRO LUGAR -----------------------------
               
               Capitulo terceirolugar = new Capitulo("\n Terceiro Lugar", 
                                                    "\n Estamos aqui no jogo de disputa pelo terceiro lugar entre Brasil x Holanda. A seleção brasileira termina o jogo com a ",
                                                     Brasil, 
                                                     100,
                                                     escolha);
               terceirolugar.mostrar();
               Brasil.perder();

               // --------------------- CAMPEÃO --------------------
               Capitulo campeao = new Capitulo("\n É campeão",
                                               "\n Vitória lindíssima em cima dos Aregntinos e o Brasil é hexa"+
                                               "\n Essa foi a Copa Mundo 2014, meus amigos! Muitíssimo obrigado pela a presença"+
                                               " \n Nos vemos em 2018 na Rússia. Até mais!", 
                                               Brasil,
                                              400, 
                                              null);
                  campeao.mostrar();
                  Brasil.ganhar();

                //--------------------- Vice Campeão ----------------------
                Capitulo vicecampeao = new Capitulo("Vice Campeão", 
                                                    "\n Brasil perde pra Argentina e o Hexa escorre pela as mãos"+
                                                    "\n Encerramos aqui no Maracanã a Copa Mundo 2014 em 2º lugar"+
                                                    "\n Argentina campeã da copa de mundo 2014."+
                                                    "\n Nos veremos novamente em 2018 na Rússia. Até mais!", 
                                                    Brasil, 
                                                    200, 
                                                    null);
                  vicecampeao.mostrar();
                  Brasil.perder();

                  //------------------ Ganha terceiro lugar -------------------
                  Capitulo ganharterceirolugar = new Capitulo("Vitória espetacular em cima da Hoalanda", 
                                                              "\n O Brasil bate a Holanda e fica em terceiro lugar na Copa do Mundo 2014"+
                                                              "\n Apesar de perdemos o hexa, conseguimos ficar no pódio"+
                                                              "\n Essa foi a Copa do Mundo 2014 "+
                                                              "\n Ficamos por aqui e nos encontraremos novamente em 4 anos"+
                                                              "\n Um grande abraço até mais",
                                                               Brasil, 
                                                               200, 
                                                                null);
                  ganharterceirolugar.mostrar();
                  Brasil.ganhar();
              //------------------------- Perde terceiro lugar ---------------------------
              Capitulo perderterceirolugar = new Capitulo("O Brasil perde também o terceiro lugar", 
                                                          "\n Após a derrota humilhante de 7x1 destruindo o sonho do hexa"+
                                                          "\n O Barsil perde também o terceiro lugar com placar de 3x0 para a Holanda"+
                                                          "\n A seleção já não é mais a mesma que mostrava garra no começo da Copa"+
                                                          "\n Holanda leva o terceiro lugar e conquista o pódio junto com Alemnha e Argentina"+
                                                          "\n Essa foi a Copa do Mundo 2014. Espero vocês na Rússia 2018. Até mais!",
                                                           Brasil, 
                                                           0, 
                                                           null);
                    Brasil.perder();
                   perderterceirolugar.mostrar();                                        
                  Capitulo raiz = semifinal;
                  semifinal.adEscolha(new Escolha("Vitoria mesmo com os desfalques.",fin));
                  semifinal.adEscolha(new Escolha("Derrota humilhante de 7x1.",terceirolugar));
                  fin.adEscolha(new Escolha("Vitoria com estadio lotado.", campeao));
                  fin.adEscolha(new Escolha("Derrota decepcionate de 1x0.", vicecampeao));
                  terceirolugar.adEscolha(new Escolha("Vitoria com gol lindo de Renato Augusto", ganharterceirolugar));
                  terceirolugar.adEscolha(new Escolha("Derrota com placar de 3x0", perderterceirolugar));
                  raiz.mostrar();
                  escolha.close();     

              }
            }
             
   
      