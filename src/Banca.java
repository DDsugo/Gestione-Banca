package src;

import java.util.HashMap;
import java.util.Map;

public class Banca {
    private Map<Integer, Conto> conti;
    private int prossimoNumeroConto;

    public Banca() {
        conti = new HashMap<>();
        prossimoNumeroConto = 1;
    }

    public void creaConto(String proprietario) {
        Conto conto = new Conto(prossimoNumeroConto, proprietario);
        conti.put(prossimoNumeroConto, conto);
        System.out.println("Conto creato con successo. Il numero del conto è: " + prossimoNumeroConto);
        prossimoNumeroConto++;
    }

    public void effettuaDeposito(int numeroConto, int importo) {
        Conto conto = conti.get(numeroConto);
        if (conto != null) {
            conto.deposita(importo);
            System.out.println("Deposito effettuato con successo.");
        } else {
            System.out.println("Conto non trovato.");
        }
    }

    public void effettuaPrelievo(int numeroConto, int importo) {
        Conto conto = conti.get(numeroConto);
        if (conto != null) {
            if (conto.preleva(importo)) {
                System.out.println("Prelievo effettuato con successo.");
            } else {
                System.out.println("Saldo insufficiente.");
            }
        } else {
            System.out.println("Conto non trovato.");
        }
    }

    public void visualizzaSaldo(int numeroConto) {
        Conto conto = conti.get(numeroConto);
        if (conto != null) {
            System.out.println("Saldo attuale del conto " + numeroConto + ": " + conto.visualizzaSaldo());
        } else {
            System.out.println("Conto non trovato.");
        }
    }
}