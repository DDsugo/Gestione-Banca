package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Banca banca = new Banca();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Crea un nuovo conto");
            System.out.println("2. Deposita denaro");
            System.out.println("3. Preleva denaro");
            System.out.println("4. Visualizza saldo");
            System.out.println("5. Esci");

            int scelta = scanner.nextInt();
            scanner.nextLine();

            switch (scelta) {
                case 1:
                    System.out.println("Inserisci il nome del proprietario del conto: ");
                    String proprietario = scanner.nextLine();
                    banca.creaConto(proprietario);
                    break;
                case 2:
                    System.out.println("Inserisci il numero del conto: ");
                    int numeroContoDeposito = scanner.nextInt();
                    System.out.println("Inserisci l'importo da depositare: ");
                    int importoDeposito = scanner.nextInt();
                    banca.effettuaDeposito(numeroContoDeposito, importoDeposito);
                    break;
                case 3:
                    System.out.println("Inserisci il numero del conto: ");
                    int numeroContoPrelievo = scanner.nextInt();
                    System.out.println("Inserisci l'importo da prelevare: ");
                    int importoPrelievo = scanner.nextInt();
                    banca.effettuaPrelievo(numeroContoPrelievo, importoPrelievo);
                    break;
                case 4:
                    System.out.println("Inserisci il numero del conto: ");
                    int numeroContoSaldo = scanner.nextInt();
                    banca.visualizzaSaldo(numeroContoSaldo);
                    break;
                case 5:
                    System.out.println("Grazie per aver utilizzato la banca!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Scelta non valida. Riprova.");
            }
        }
    }
}