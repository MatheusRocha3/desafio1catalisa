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
            System.out.println("Nesse jogo temos 1 nível: Fácil. O nível fácil vai até o número 20. Boa sorte!");
            System.out.println("Para começar o jogo digite 1. Qualquer outro número ou tecla o jogo não irá carregar!");
            int nivel = (input.nextInt());
                while (true)
                    if (nivel == 1) {
                        System.out.println("Você está jogando na difuldade fácil!");
                        System.out.println("Escolha um número de 0 até 20");
                        int escolhaNumeroUsuario = (input.nextInt());
                        int numeroAleatorio = random.nextInt(20);
                        int numeroMaximo = numeroAleatorio + 1;
                        int numeroMinimo = numeroAleatorio - 1;
                        if (escolhaNumeroUsuario > numeroAleatorio); {
                            System.out.println("O número digitado não pode ser maior que 20.");
                            System.out.println("Tente novamente. Digite um número de 0 até 20");
                            escolhaNumeroUsuario = input.nextInt();
                        } if (escolhaNumeroUsuario < numeroAleatorio) {
                            System.out.println("O número digitado não pode ser negativo.");
                            System.out.println("Tente novamente. Digite um número de 0 até 20");
                            escolhaNumeroUsuario = input.nextInt();
                        }
                        if (escolhaNumeroUsuario == numeroAleatorio) {
                            pontos = pontos + 10;
                            System.out.println("Parabéns, você acertou!");
                            System.out.println("Seus pontos atuais são: " + pontos);
                        } else if (escolhaNumeroUsuario == numeroMaximo || escolhaNumeroUsuario == numeroMinimo) {
                            pontos = pontos + 5;
                            System.out.println("Passou perto!");
                            System.out.println("Seus pontos atuais são: " + pontos);
                            System.out.println("Deseja tentar novamente? Digite um número de 1 até 20");
                            segundaChance = input.nextInt();
                        } if (segundaChance == numeroAleatorio) {
                            pontos = pontos + 5;
                            System.out.println("Você acertou!");
                            System.out.println("Sua pontuação atual é: " + pontos);
                        }if (escolhaNumeroUsuario != numeroAleatorio && segundaChance != numeroAleatorio) {
                            System.out.println("Sua pontuação final é: " + pontos);
                            break;
                        }
                    }
            }
        }


