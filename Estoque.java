public class Estoque {
    private String nome;
    private int qtdAtual;
    private int qtdMinima;


    public Estoque() {
        this.nome = "";
        this.qtdAtual = 0;
        this.qtdMinima = 0;
    }

    public Estoque(String nome, int qtdAtual, int qtdMinima) {
        this.nome = nome;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public int getQtdMinima() {
        return qtdMinima;
    }

    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }


    public void darBaixa(int qtde) {
        if (qtde >= 0) {
            if (this.qtdAtual - qtde >= 0) {
                this.qtdAtual -= qtde;
            } else {
                System.out.println("Erro: Estoque não pode ficar negativo.");
            }
        } else {
            System.out.println("Erro: Quantidade inválida para dar baixa.");
        }
    }

    // Método para mostrar informações do estoque
    public String mostra() {
        return "Nome do Produto: " + nome + "\nQuantidade Mínima: " + qtdMinima + "\nQuantidade Atual: " + qtdAtual;
    }

    // Método para verificar se precisa repor o estoque
    public boolean precisaRepor() {
        return qtdAtual <= qtdMinima;
    }

    public static void main(String[] args) {
        // Exemplo de uso da classe Estoque
        Estoque estoque = new Estoque("Produto A", 50, 10);

        System.out.println("Informações do Estoque:");
        System.out.println(estoque.mostra());

        estoque.darBaixa(20);

        System.out.println("\nApós dar baixa de 20 unidades:");
        System.out.println(estoque.mostra());

        System.out.println("\nPrecisa repor o estoque? " + (estoque.precisaRepor() ? "Sim" : "Não"));
    }
}
