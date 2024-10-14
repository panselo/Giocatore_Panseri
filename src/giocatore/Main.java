package giocatore;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        int scelta;
        Giocatore [] g = new Giocatore[11];
        Giocatore g1 = new Giocatore();
        System.out.println ("Nome del giocatore 1: "); g1.setNome(in.nextLine());
        System.out.println ("Il giocatore 1 è capitano?: "); g1.setCapitano(in.nextLine());
        System.out.println ("Goal giocatore 1: "); g1.setGoal(in.nextInt());
        in.nextLine();

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
                    
            }



        }while (scelta != 0);



















        Giocatore g2 = new Giocatore();
        int conta = 0;

        System.out.println ("Nome del giocatore 1: "); g1.setNome(in.nextLine());
        System.out.println ("Il giocatore 1 è capitano?: "); g1.setCapitano(in.nextLine());
        System.out.println ("Goal giocatore 1: "); g1.setGoal(in.nextInt());
        in.nextLine();

        System.out.println ("Nome del giocatore 2: "); g2.setNome(in.nextLine());
        System.out.println ("Il giocatore 2 è capitano?: "); g2.setCapitano(in.nextLine());
        System.out.println ("Goal giocatore 2: "); g2.setGoal(in.nextInt());
        in.nextLine();

        while (true) {
            System.out.println("0 - Inserisci giocatore");
            System.out.println("1 - Mostra squadra");
            System.out.println("2 - Modifica giocatore");
            System.out.println("3 - Rimuovi giocatore");
            System.out.println("4 - Visualizza giocatori con almeno 5 goal");
            System.out.println("5 - Visualizza capitano");
            System.out.println("6 - Assegna capitano casualmente");
            System.out.println("7 - Esci");
            System.out.print("Scelta: ");
            int scelta = input.nextInt();
            switch (scelta) {
                case 0:

            }

        g[0] = g1;

        System.out.println("Vuoi aggiungere un giocatore?: ");
        String risposta = in.nextLine();

        if (risposta.equals("si") || risposta.equals("Si")){
            if (g1.getCapitano().equals("no")){
                conta++;

                g[conta] = g2;
            }
        }


    }

    private static
}