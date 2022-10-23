import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Jogo {
    DadosCorrida dadosCorrida = new DadosCorrida();
    CarroCorridaService carroCorridaService = new CarroCorridaService();
    String ANSI_RESET = "\u001B[0m";
    String ANSI_ROXO = "\u001B[35m";
    String ANSI_VERMELHO = "\u001B[31m";
    String ANSI_VERDE = "\u001B[32m";
    String ANSI_AMARELO = "\u001B[33m";
    String ANSI_AZUL = "\u001B[34m";
    String ANSI_CIANO = "\u001B[36m";

    public void boasVidas(){
        System.out.println("Seja bem vindo(a) ao\n" + ANSI_CIANO +
                "░█▀▀█ ░█▀▀█ ─█▀▀█ ░█▄─░█ ░█▀▀▄ 　 ░█▀▀█ ░█▀▀█ ░█▀▀▀ ░█▀▄▀█ ▀█▀ ░█─░█ ░█▀▄▀█ 　 ─█▀▀█ ░█▀▀▄ ─█▀▀█ 　 ░█▀▀█ █▀▀█ \n" +
                "░█─▄▄ ░█▄▄▀ ░█▄▄█ ░█░█░█ ░█─░█ 　 ░█▄▄█ ░█▄▄▀ ░█▀▀▀ ░█░█░█ ░█─ ░█─░█ ░█░█░█ 　 ░█▄▄█ ░█─░█ ░█▄▄█ 　 ░█▀▀▄ ──▀▄ \n" +
                "░█▄▄█ ░█─░█ ░█─░█ ░█──▀█ ░█▄▄▀ 　 ░█─── ░█─░█ ░█▄▄▄ ░█──░█ ▄█▄ ─▀▄▄▀ ░█──░█ 　 ░█─░█ ░█▄▄▀ ░█─░█ 　 ░█▄▄█ █▄▄█\n\n\n" + ANSI_RESET +
                "Estamos muito felizes que você tenha aceitado participar do GRAND PREMUIM ADA B3! Ouvimos muito a seu respeito\n" +
                "e concerteza será um grande privilégio tê-lo conosco nesta competição!\n" +
                "Mas antes de tudo, precisamos que você finalize a sua inscrição...\n");

    }
    public void inscricao(){

        Scanner sc = new Scanner(System.in);

        System.out.println("|-------------------------------------------------------------------------------------------------------------|\n" +
                "|                                        FORMULÁRIO DE INSCRIÇÃO                                              |\n" +
                "|-------------------------------------------------------------------------------------------------------------|\n");
        System.out.println("1) Nome:");
        dadosCorrida.nomeJogador = sc.next();

        System.out.println("2) Idade:");
        dadosCorrida.idadeJogador = sc.nextInt();

        System.out.println("3) Sexo (f/m):");
        switch (sc.next()){
            case "f":
                dadosCorrida.sexoJogador = Sexo.feminino;
                break;
            case "m":
                dadosCorrida.sexoJogador = Sexo.masculino;
                break;
        }

        System.out.println("4) Nome da equipe:");
        dadosCorrida.equipeJogador = sc.next();

        System.out.println("---------------------------------------------------------------------------------------------------------------");
    }

    public void equipes(){
        System.out.printf("Inscrição finalizada com sucesso! Veja abaixo a lista completa de participantes:\n\n" +
                "- Carro 1: %s, %d anos, sexo %s, equipe %s\n" +
                "- Carro 2: %s, %d anos, sexo %s, equipe %s\n" +
                "- Carro 3: %s, %d anos, sexo %s, equipe %s\n" +
                "- Carro 4: %s, %d anos, sexo %s, equipe %s\n\n",dadosCorrida.pilotoA.getNome(),dadosCorrida.pilotoA.getIdade(),dadosCorrida.pilotoA.getSexo(),dadosCorrida.pilotoA.getEquipe(),
                dadosCorrida.pilotoB.getNome(),dadosCorrida.pilotoB.getIdade(),dadosCorrida.pilotoB.getSexo(),dadosCorrida.pilotoB.getEquipe(),
                dadosCorrida.pilotoC.getNome(),dadosCorrida.pilotoC.getIdade(),dadosCorrida.pilotoC.getSexo(),dadosCorrida.pilotoC.getEquipe(),
                dadosCorrida.nomeJogador,dadosCorrida.idadeJogador,dadosCorrida.sexoJogador,dadosCorrida.equipeJogador);

    }
    public void continuar(){
        Scanner sc = new Scanner(System.in);
        System.out.println(ANSI_CIANO + "Insira qualquer digito para continuar:" + ANSI_RESET);
        sc.next();
    }

    public void regras(){

        System.out.println("Antes de iniciar a competição gostariamos de passar algumas informações importantes:\n\n"+
                "- O circuito completo tem 10km e a corrida será de volta única.\n" +
                "- No km 7 há uma CURVA MUITO PERIGOSA, por isso é importante estar no MÁXIMO a 120km/h quando passar por ela!\n" +
                "- Você gastará 30s a cada comando que você der ao seu veículo.\n" +
                "- O tempo máximo para finalizar o circuito é de 180s, após isso o competidor será automaticamente desclassificado.\n");

        System.out.println("      " + ANSI_AZUL + "____/   ___                  " + ANSI_VERDE + "____/   ___                  " + ANSI_AMARELO + "____/   ___                  " + ANSI_ROXO +"____/   ___\n" +
                "     " + ANSI_AZUL + "|_ 1 \\__'  _\\                " + ANSI_VERDE + "|_ 2 \\__'  _\\                " + ANSI_AMARELO + "|_ 3 \\__'  _\\                " + ANSI_ROXO + "|_ 4 \\__'  _\\      \n" +
                "     " + ANSI_AZUL + "`-(*)----(*)'                " + ANSI_VERDE + "`-(*)----(*)'                " + ANSI_AMARELO + "`-(*)----(*)'                " + ANSI_ROXO + "`-(*)----(*)'\n" + ANSI_RESET +
                "Todos os competidores a postos. A corrida vai começar em 3... 2... 1... E FOI DADA A LARGADA!");
    }

    public void  limpaTela(){
        for(int i = 0;i < 50; i++){
                System.out.print("\n");
        }
    }

    public void rodadas(){
        Scanner sc = new Scanner(System.in);
        int tempo = 180;
        while (tempo > 0){
            painelDeControle();

            int escolha = sc.nextInt();
            switch(escolha){
                case 1:
                    carroCorridaService.ligar(dadosCorrida.carroD);
                    break;
                case 2 :
                    carroCorridaService.acelerar(60.0,dadosCorrida.carroD);
                    break;
                case 3 :
                    carroCorridaService.frear(60.0,dadosCorrida.carroD);
                    break;
                case 4 :
                    carroCorridaService.parar(dadosCorrida.carroD);
                    break;
                case 5 :
                    carroCorridaService.desligar(dadosCorrida.carroD);
                    break;
            }
            tempo = tempo - 30;
        }
    }

    public void painelDeControle(){
        int tempo = 180;
        double distancia = 0.0;
        while (tempo > 0){
            System.out.printf("\nTempo de prova restante: %ds\n"+
                    "Colocação atual: º\n"+
                    "|------------------------------------------------------------------------|\n" +
                    "|                             PAINEL DE CONTROLE                         |\n" +
                    "|------------------------------------------------------------------------|\n" +
                    "|Opção '1' - Ligar o carro           |Status do veículo:                 |\n" +
                    "|Opção '2' - Acelerar (+ 60 km/h)    |Velocidade atual:    km/h          |\n" +
                    "|Opção '3' - Frear (- 60 km/h)       |Km percorridos: %.1f km            |\n" +
                    "|Opção '4' - Parar o carro           |                                   |\n" +
                    "|Opção '5' - Desligar o carro        |                                   |\n" +
                    "|------------------------------------------------------------------------|\n" +
                    ANSI_CIANO + "O que você vai fazer? Insira sua opção aqui:" + ANSI_RESET,tempo,distancia);
            tempo = tempo - 30;
            distancia = carroCorridaService.exibirDistanciaPercorrida(dadosCorrida.carroD);
        }
    }

}