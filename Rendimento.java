import java.text.NumberFormat;

public class Rendimento {
    private double investimentoInicial;
    private double taxaRendimento;
    private int numParcela;

    public Rendimento(double investimentoInicial, double taxaRendimento, int numParcela) {
        this.investimentoInicial = investimentoInicial;
        this.taxaRendimento = taxaRendimento;
        this.numParcela = numParcela;
    }

    public double getInvestimentoInicial() {
        return investimentoInicial;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public int getNumParcela() {
        return numParcela;
    }

    public void setInvestimentoInicial(double investimentoInicial) {
        this.investimentoInicial = investimentoInicial;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    public void setNumParcela(int numParcela) {
        this.numParcela = numParcela;
    }

    public void calculaRendimento(){
        double rendimentoMes = getInvestimentoInicial();
        System.out.println("Valor Inicial: " + NumberFormat.getCurrencyInstance().format(getInvestimentoInicial()));
        System.out.println("Taxa de Juros: " + NumberFormat.getCurrencyInstance().format(getTaxaRendimento()));
        for(int i = 0; i < getNumParcela(); i++){
            rendimentoMes = rendimentoMes + (rendimentoMes * getTaxaRendimento() / 100);
            System.out.println("Mês " + (i+1) + ": " + NumberFormat.getCurrencyInstance().format(rendimentoMes));
        }
    }
}
