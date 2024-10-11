package giocatore;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);

        Giocatore [] g = new Giocatore[11];
        Giocatore g1 = new Giocatore();
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
}