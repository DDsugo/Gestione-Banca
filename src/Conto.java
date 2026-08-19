package src;

public class Conto {
    private int numeroConto;
    private String proprietario;
    private double saldo;

    public Conto (int numeroConto, String proprietario) {
        this.numeroConto = numeroConto;
        this.proprietario = proprietario;
        this.saldo = 0.0;
    }

    public void deposita (int importo) {
        if (importo > 0) {
            saldo += importo;
        } else {
            System.out.println("Importo non valido, si prega di inserire un valore positivo.");
        }
    }

    public boolean preleva (int importo) {
        if (importo > 0 && importo <= saldo) {
            saldo -= importo;
            return true;
        } else {
            System.out.println("Importo non valido o saldo insufficiente, si prega di riprovare.");
            return false;
        }
    }

    public double visualizzaSaldo() {
        return saldo;
    }
}