import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
    public class AcerteONumero {
        public static void main(String[] args) {
            int pontos = 0;
            int segundaChance = 0;
            Scanner input = new Scanner(System.in);
            Random random = new Random();
            System.out.println("Bem vindo ao nosso incrível jogo! Aqui, iremos sortear um número e você deve acertar!");
            System.out.println("Mas antes, vou te explicar como funciona o jogo.  Iremos sortear um número e você deve acertar o número que sorteamos. \n " +
                    "Caso acerte, você ganha 10 pontos e continuamos a jogar. \nCaso o número sorteado seja 30 e você escolha o número 29 ou 31, você ganha 5 pontos e ganha mais uma chance de acertar o número. \n Caso erre e não tenha pontos acumulados, game over. \n");
            System.out.print("Nesse jogo temos 3 níveis: Fácil, médio, díficil e impossível. \nFácil vai até o numero 10, médio até o número 30, díficil até o 60 e impossível até o 100. Boa sorte!");
            System.out.print(" \n │--------------------------------------------------------│\n");
            System.out.print("Opção 1 - Nível de dificuldade fácil \n");
            System.out.print("Opção 2 - Nível de dificuldade médio \n");
            System.out.print("Opção 3 - Nível de dificuldade difícil \n");
            System.out.print("Opção 4 - Nível de dificuldade impossível \n");
            System.out.print("\n│-----------------------------------------------------------│");
            System.out.println(" Escolha a opção \n");
            int opcao = (input.nextInt());

            {

                while (true)
                    if (opcao == 1) {
                        System.out.println("Você escolheu a dificuldade fácil!");
                        System.out.println("Escolha um número de 0 até 10");
                        int escolhaNumeroUsuario = (input.nextInt());
                        int numeroAleatorio = random.nextInt(11);
                        int numeroMaximo = numeroAleatorio + 1;
                        int numeroMinimo = numeroAleatorio - 1;
                        if (Objects.equals(escolhaNumeroUsuario, numeroAleatorio)) {
                            pontos = pontos + 10;
                            System.out.println("Parabéns, você acertou!");
                            System.out.println("Seus pontos atuais são: " + pontos);
                        } else if (escolhaNumeroUsuario == numeroMaximo || escolhaNumeroUsuario == numeroMinimo) {
                            pontos = pontos + 5;
                            System.out.println("Passou perto!");
                            System.out.println("Seus pontos atuais são: " + pontos);
                            System.out.println("Deseja tentar novamente? Digite um número de 1 até 20");
                            segundaChance = input.nextInt();
                        }
                        if (segundaChance == numeroAleatorio) {
                            pontos = pontos + 5;
                            System.out.println("Você acertou!");
                            System.out.println("Sua pontuação atual é: " + pontos);
                        } else {
                            System.out.println("Você perdeu. Sua pontuação final é: " + pontos);
                        }
                        if (escolhaNumeroUsuario != numeroMaximo && segundaChance != numeroAleatorio) {
                            break;
                        }
                    }
            }
        }
    }

