import java.util.Scanner;


    public class Historia {
        public static void main(String[] args) {
            String v = ("vitoria");
            String d =("derrota");

            System.out.print("\n Estamos na Copa do Mundo 2014. Após uma copa surpreedente e favoritas eliminadas na fase de grupos"+
            ", um grade exemplo disto é a campeã de 2010: a Espanha."+
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
                            
            Scanner time = new Scanner(System.in);

            System.out.print("\n ------ SEMIFINAL ------");

            System.out.print("\n Vamos agora acompanhar o jogo de Brasil x Alemanha.");
            System.out.print("\n O jogo termina com a ");
            String partida = time.nextLine();
            System.out.print("do Brasil.");
            

            if(partida.equals(v)){
               System.out.println("\n Impressioante o Brasil bate a Alemanha e está na final!" );
               System.out.print("\n - Neymar"+
                                "\n - Fred"+
                                "\n - Willian"+
                                "\n - Paulinho");

               System.out.print(" \n Com golaço de ");
               String gol = time.nextLine();
               System.out.print(" deixa o goleiro na saudade e manda a Alemanha pra casa.");
               Brasil.ganhar();
               System.out.print("\n A animação da torcida aumentou de 200% para " + Brasil.animação+"%");
                
               System.out.print("\n Agora temos informações que Argentina venceu a Holanda nos pênaltis."+
               " Portanto, também está na final. Uma final épica sulamericana entre Brasil e Argentina"+
               "\n Estamos na grande final da copa do mundo 2014, "+
               "onde se enfrenta os dois times da América do Sul: Brasil x Argentina.");

               System.out.print("\n ----- FINAL -----");

               System.out.println("\n O Brasil sai do jogo com a ");
               String parti = time.nextLine();
               
               
               if(parti.equals(d)){
                  System.out.print(" \n O Brasil perde na final para Argentina com o placar de 1x0."+
                  " A Argentina é a campeã da copa do mundo 2014.");
                  System.out.print("\n - o primeiro gol da Argentina"+
                                   "\n - a expulsão de Thiago Silva"+
                                   "\n - Marcelo sair do jogo lesionado ");
                  System.out.println("\n A verdade é o que Brasil desandou após  ");
                  String lanc3 = time.nextLine();
                  Brasil.perder();
                  System.out.print("A animação da torcida cai de 300% para "+Brasil.animação+"%");

                }
                else if(parti.equals(v)){
                  System.out.print("\n O Brasil é Hexa. Em uma campanha impecável é o campeão do mundo em 2014."+
                  "única seleção do mundo a cosquistar seis títulos mundiais. O Brasil vence a Argentina com o placar de 1x0"+
                  "\n - lesionado"+
                  "\n - expulso"+
                  "\n - esgotado");
                  System.out.print("\n muito merecido, pois mesmo com jogador ");
                  String acontecimento = time.nextLine();
                  System.out.print(" O Brasil supera a Argentina e é o campeão do mundo 2014");
                  Brasil.ganhar();
                  System.out.print(" A animação da torcida atinge o máximo, passa de 300% para" +Brasil.animação+"%"
                  );
               }

                
                }else if(partida.equals(d)){
               System.out.print(" \n O Brasil perde para Alemanha. ");
               System.out.print("\n - com placar de 7x1"+
                                "\n - com Um gol irregular, mas que o arbitro considerou normal"+
                                "\n - com um gol contra de David Luiz"+
                                "\n - com um Hat-trick de Thomas Muller");
               System.out.print("\n Em um jogo impressionante ");
               String acontecimento2 = time.nextLine();
               Brasil.perder();
               System.out.print("A animação da torcida cai de 200% para "+Brasil.animação+"%");

               System.out.print("\n ------ TERCEIRO LUGAR ------");

               System.out.print("\n Estamos aqui no jogo de disputa pelo terceiro lugar entre Brasil x Holanda." + 
               "A seleção brasileira termina o jogo com a ");
               String part = time.nextLine();
               if(part.equals(v)){
                  System.out.print("\n O Brasil fica em terceiro lugar na Copa do Mundo 2014.");
                  System.out.print(    "\n - um golaço de fora da aréa de Hulk"+
                                       "\n - um golaço de falta de Neymar"+
                                       "\n - uma cabeçada de Oscar para o fundo do gol, após uma cobrança de escanteio");
                  System.out.print("\n Com ");
                  String ac = time.nextLine();
                  System.out.print(" O Brasil bate a Holanda.");
                  Brasil.ganhar();
                  System.out.print("A animação da torcida sobe de 100% para "+Brasil.animação+"%");
               }
               if(part.equals(d)){
                  System.out.print("\n O Brasil perde para Holanda e Holanda fica com o terceiro lugar.");
                  System.out.print("\n - hat-trick de Arjen Robben"+
                                   "\n - uma falha do goleiro Júlio César "+
                                   "\n - um golaço de Robin Van Persie"+
                                   "\n - um placar de 3x0 para Holanda");
                  System.out.print("\n a derrota veio com ");
                  String derr = time.nextLine();
                  Brasil.perder();
                  System.out.print(" A animação da torcida esgota, de 100% fomos para "+Brasil.animação+"%. Que fase!");
                  

               }
            }

                  System.out.print("\n Essa foi a Copa Mundo 2014, meus amigos! Muitíssimo obrigado pela a presença"+
                  " Nos vemos em 2018 na Rússia. Até mais!");

                  time.close();


                


         }
      }