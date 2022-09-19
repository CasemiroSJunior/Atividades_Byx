/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bayeuxadventure2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Etec-User
 */
public class BayeuxAdventure2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        System.out.println("SEJA BEM VINDO AO BAYEUX ADVENTURE 2! \n DESEJA COMEÇAR UMA NOVA JOGATINA? 1- SIM  2- NAO");
        Scanner entrada_teclado = new Scanner(System.in);
        int resposta = entrada_teclado.nextInt();
        if (resposta == 2){
            System.out.println("CERTO MERO MORTAL,COMO DESEJA, SUA AVENTURA SERÁ ENCERRADA!");
            System.exit(0);
        }
        if (resposta == 1){
            System.out.println("MUITO BEM MERO MORTAL, AGORA SELECIONE O NOME DO SEU HERÓI!");
        Heroi player1 = new Heroi();
        // INFORMAÇÕES HERÓI
        String nome = entrada_teclado.next();
        player1.setNome(nome);
        System.out.println("SEU HERÓI SE CHAMARÁ : " + player1.getNome()+" ESTÁ CERTO DISSO?   1- SIM    2-NAO  ");
        int resposte = entrada_teclado.nextInt();
        if (resposte == 2){
            System.out.println("AGORA, DIGITE CORRETAMENTE O NOME DO SEU HERÓI! NOTE QUE NÃO HAVERÁ OUTRA CHANCE DE CONTINUAR!"); 
            player1.setNome(entrada_teclado.next());
        }
        else{
            System.out.println("AGORA SELECIONE UMA CLASSE!");
            System.out.println("1- MAGO: \n Vida:75 \n Ataque: 30 \n Defesa: 08 \n ");
            System.out.println("2- GUERREIRO: \n Vida:100 \n Ataque: 15 \n Defesa: 12 \n ");
            System.out.println("3- TANK: \n Vida:125 \n Ataque: 8 \n Defesa: 21 \n ");
            System.out.println("4- LADINO: \n Vida:75 \n Ataque: 20 \n Defesa: 10 \n NOTA: ELE PODERÁ FUGIR DE ALGUMAS BATALHAS ");
            int classe = entrada_teclado.nextInt();
            if (classe == 1){
                player1.setAtaque(30);
                player1.setDefesa(6);
                player1.setVida(75);
                System.out.println("CERTO, SEM VOLTAS AGORA. VOCÊ SE CHAMA:"+ player1.getNome() + " E ESTÁ COM A CLASSE MAGO, AGORA ACORDE!!\n");
                }
            if (classe == 2){
                player1.setAtaque(15);
                player1.setDefesa(12);
                player1.setVida(100);
                System.out.println("CERTO, SEM VOLTAS AGORA. VOCÊ SE CHAMA:"+ player1.getNome() + " E ESTÁ COM A CLASSE GUERREIRO, AGORA ACORDE!!\n");
            }
            if (classe == 3){
                player1.setAtaque(8);
                player1.setDefesa(21);
                player1.setVida(125);
                System.out.println("CERTO, SEM VOLTAS AGORA. VOCÊ SE CHAMA:"+ player1.getNome() + " E ESTÁ COM A CLASSE TANK, AGORA ACORDE!!\n");
            }
            if (classe == 4){
                player1.setAtaque(20);
                player1.setDefesa(10);
                player1.setVida(75);
                System.out.println("CERTO, SEM VOLTAS AGORA. VOCÊ SE CHAMA:"+ player1.getNome() + " E ESTÁ COM A CLASSE LADINO, AGORA ACORDE!!\n");
            }
            System.out.println("Repentinamente você acorda, em um lugar desconhecido com apenas a lembrança do seu nome.\n Você escuta alguém batendo na porta.\n Quando você abre, é o rei lhe convocando para uma missão onde você tem que salvar a filha dele");
                System.out.println("'Você foi convocado para uma missão de resgate à minha filha'- diz o rei.");
                System.out.println("Escolha o que deseja fazer");
                System.out.println("1-'Com todo prazer sua majestade, irei fazer o possível para resgatar sua filha!'");
                System.out.println("2-'Nem ferrando que vou sair do conforto da minha casa para me sacrificar à resgatar sua filha'");
                int resposta_rei = entrada_teclado.nextInt();
                if (resposta_rei == 2){
                System.out.println("'Bem, como você decediu recusar minha convocação, você sera penalizado com a morte!Guardas levem ele'");
                System.out.println("Você é amarrado pelos guardas e levado à guilhotina. Você foi acusado por conspiração contra o Rei e foi morto ali.");
                System.out.println("SÉRIO? VOCÊ MORREU AQUI? HM,MORTAIS INUTEIS");
                System.exit(0);
            }
                if (resposta_rei == 1){
                    System.out.println("'Muito bem, passe no castelo dentro de duas horas, você poderá se equipar com as coisas do reino para sua jornada.'");
                    System.out.println("Você fecha a porta e começa a andar pela casa.");
                    System.out.println("O que deseja fazer?\n 1-Olhar em baixo da cama\n 2-Ir para a cozinha\n 3-Ir para o palácio");
                    int decisao_casa = entrada_teclado.nextInt();
                    if (decisao_casa == 1){
                        System.out.println("Você olha em baixo da cama e encontra um báu, onde contém uma armadura de couro. DEFESA+2");
                        player1.setDefesa(player1.getDefesa()+2);
                        System.out.println("SUA DEFESA ATUAL É: "+ player1.getDefesa());
                        System.out.println("Você dá uma batidinha na roupa e se vira para a porta.");
                    }
                    if (decisao_casa == 2){
                        System.out.println("Você vai à cozinha... Não encontra nada de útil, porém você toma um café da manhã bem reforçado para começar o dia.");
                        System.out.println("VIDA+3");
                        player1.setVida(player1.getVida()+3);
                        System.out.println("SUA VIDA ATUAL É: "+player1.getVida());
                        System.out.println("Você sai da cozinha e vai em direção à porta.");
                    }
                    if (decisao_casa == 3){
                        System.out.println("Você da uma ajeitadinha no cabelo e se vira para a porta.");
                    }
                    System.out.println("Após abrir a porta, você parte em direção ao castelo  ");
                    System.out.println("'Bem, você chegou em tempo, agora pegue esses equipamentos e siga a rota descrita no mapa, você precisa ser rápido, não sabemos o que eles querem com minha filha.'");
                    System.out.println("Você se equipa com os itens do castelo, TODOS OS STATUS +2");
                    player1.setAtaque(player1.getAtaque()+2);
                    player1.setVida(player1.getVida()+2);
                    player1.setDefesa(player1.getDefesa()+2);
                    System.out.println("O Rei te dá instruções de onde o sequestrador está--'Após sair do castelo Siga em frente e você irá encontrar um bosque \n");
                    System.out.println("Após entrar no bosque, no primeiro cruzamento vire á Direita, porque direita é sucesso. Então siga reto, direita novamente, então direita ao contrário \n");
                    System.out.println("Desça duas entradas, vire direita e por fim vá reto. Após sair da floresta você irá encontrar uma masmorra, lá você ira encontrar minha filha. Está preparado?'");
                    System.out.println("1-Sim | 2-Não");
                    int reposta = entrada_teclado.nextInt();
                    if (resposta == 2){
                        System.out.println("'Então vai sem preparo mesmo!'");
                    }
                    System.out.println("'Boa sorte!'");
                    System.out.println("Após todo aquele discurso do rei, você chega à floresta, o caminho que você está seguindo vai para esquerda e para direita, onde deseja ir?");
                    System.out.println("1- Esquerda | 2-Direita ");
                    int resposta = entrada_teclado.nextInt();
                    if (resposta == 1){
                        System.out.println("Você vira a esquerda e adentra um pouco mais naquela área desconhecida, e é surpreendido por um bandido. Você luta para se defender.");
                        System.out.println("");
                    }
                    
                    
                }
                else{
                    System.out.println("'Você está brincando com a minha cara????? GUARDAS SEGUREM ELE!'");
                    System.out.println("O rei cospe na sua cara, logo após isso você é levado ao calabouço do castelo onde é preso pelo resto de sua vida curta e miserável");
        }
        // Reformular o sistema de if if if, criar uma classe história e depois ir chamando as classes.
        
        
        /*
        Inimigo basico = new Inimigo();
        // INFORMAÇÕES INIMIGO
        basico.setAtaque(15);
        basico.setDefesa(3);
        basico.setVida(50);
        basico.setNome("HERALDO");
        
        //  Danos
        int dano_efetivo_inimigo = player1.setVida(player1.getVida() - (basico.getAtaque()-player1.getDefesa()));
        int dano_efetivo_heroi = basico.getVida() - (player1.getAtaque() - basico.getDefesa());
        //int tira_vida_inimigo = basico.setVida(basico.getVida() - dano_efetivo_heroi);
        
        System.out.println("VOCÊ SE ENCONTRA COM O INIMIGO: " + basico.getNome());
        System.out.println("Você ataca o inimigo:");
        System.out.println("Você causou: " + dano_efetivo_heroi);
        basico.setVida(basico.getVida() - (player1.getAtaque() - basico.getDefesa()));
        System.out.println("A atual vida de: " + basico.getNome() + " é de: "+ basico.getVida());
        System.out.println("O inimigo te ataca e tira "+ dan);
        */
        
    }
    
}
    }
}
