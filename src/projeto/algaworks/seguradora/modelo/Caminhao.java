package projeto.algaworks.seguradora.modelo;

public class Caminhao extends VeiculoAutomotor{
    public static final int VALOR_TAXA_POR_EIXO = 50;
    public static final double VALOR_TAXA_POR_VALOR = 0.02;
    private int quantidadeEixos;


    public Caminhao(String modelo, double valorMercado, int anoFabricacao, int quantidadeEixos) {
        super(modelo, valorMercado, anoFabricacao);
        this.quantidadeEixos = quantidadeEixos;
    }

    @Override
    public double calcularValorPremio() {
        double premio = getValorMercado() * VALOR_TAXA_POR_VALOR + (VALOR_TAXA_POR_EIXO * getQuantidadeEixos());
        return premio;
    }

    @Override
    public String descrever() {
        return "Caminhao modelo: " + getModelo() + " Do ano: " + getAnoFabricacao() + " ,valor de mercado R$" + getValorMercado() + " Com " + getQuantidadeEixos() + " eixos.";
    }

    public int getQuantidadeEixos() {
        return quantidadeEixos;
    }

    public void setQuantidadeEixos(int quantidadeEixos) {
        this.quantidadeEixos = quantidadeEixos;
    }
}
