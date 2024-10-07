package giocatore;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);



        Giocatore [] g = new Giocatore[11];
        Giocatore g1 = new Giocatore();
        Giocatore g2 = new Giocatore();
        Giocatore g3 = new Giocatore();
        int conta = 0;


        System.out.println ("Nome del giocatore 1: "); g1.setNome(in.nextLine());
        System.out.println ("Il giocatore 1 è capitano?: "); g1.setCapitano(in.nextLine());
        System.out.println ("Goal giocatore 1: "); g1.setGoal(in.nextInt());
        in.nextLine();

        System.out.println ("Nome del giocatore 2: "); g2.setNome(in.nextLine());
        System.out.println ("Il giocatore 2 è capitano?: "); g2.setCapitano(in.nextLine());
        System.out.println ("Goal giocatore 2: "); g2.setGoal(in.nextInt());
        in.nextLine();

        System.out.println ("Nome del giocatore 3: "); g3.setNome(in.nextLine());
        System.out.println ("Il giocatore 3 è capitano?: "); g3.setCapitano(in.nextLine());
        System.out.println ("Goal giocatore 3: "); g3.setGoal(in.nextInt());
        in.nextLine();

        g[0] = g1;

        if (g1.getCapitano().equals("no")){
            conta++;
            g[conta] = g2;
        }

        System.out.println ("sono stupido! e anche tanto");


    }
}