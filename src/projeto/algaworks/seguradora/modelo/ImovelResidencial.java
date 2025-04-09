package projeto.algaworks.seguradora.modelo;

public class ImovelResidencial implements  BemSeguravel{

    public static final double VALOR_POR_AREA_CONSTRUIDA = 0.30;
    public static final double TAXA_VALOR_MERCADO = 0.001;

    private double valorMercado;
    private int areaConstruida;

    public ImovelResidencial(double valorMercado, int areaConstruida) {
        this.valorMercado = valorMercado;
        this.areaConstruida = areaConstruida;
    }

    public double getValorMercado() {
        return valorMercado;
    }

    public void setValorMercado(double valorMercado) {
        this.valorMercado = valorMercado;
    }

    public int getAreaConstruida() {
        return areaConstruida;
    }

    public void setAreaConstruida(int areaConstruida) {
        this.areaConstruida = areaConstruida;
    }

    @Override
    public double calcularValorPremio() {
        double premio = (getAreaConstruida() * VALOR_POR_AREA_CONSTRUIDA) + (getValorMercado() * TAXA_VALOR_MERCADO);

        return premio;
    }

    @Override
    public String descrever() {
        return "Imovel residencial de "+ areaConstruida + " m2 " + " E valor de mercado de R$"+ getValorMercado();
    }
}
