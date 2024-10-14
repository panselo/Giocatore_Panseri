package giocatore;

import java.util.Scanner;

public class TestGiocatore {

    static Giocatore [] g = new Giocatore[11];

    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        int scelta;
        String nome = " ";
        String capitano = " ";
        int goal = 0;
        int conta = 0;


        do {
            System.out.println("\nScegli un'opzione:");
            System.out.println("1. Aggiungi un giocatore");
            System.out.println("2. Visualizza tutti i giocatori");
            System.out.println("3. Modifica un giocatore");
            System.out.println("4. Cancella un giocatore");
            System.out.println("5. Visualizza giocatori con più di 5 gol");
            System.out.println("6. Visualizza il capitano");
            System.out.println("7. Assegna il capitano in modo casuale");
            System.out.println("0. Esci");
            scelta = in.nextInt();
            switch (scelta){

                case 1:
                    System.out.println ("Nome del nuovo giocatore: ");
                    nome = in.nextLine();
                    in.nextLine();
                    System.out.println ("Il nuovo giocatore è capitano?: ");
                    capitano = in.nextLine();
                    in.nextLine();
                    System.out.println ("Goal nuovo giocatore: ");
                    goal = in.nextInt();
                    in.nextLine();
                    Funzioni.aggiuntaGiocatore(g, nome, goal, capitano, conta);
                    conta++;
                    break;

                case 2:
                    Funzioni.visualizzaGiocatori(g, conta);
                    break;

                case 3:

                    break;

            }



        }while (scelta != 0);
    }
}