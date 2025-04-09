package projeto.algaworks.seguradora.modelo;

public class CarroParticular extends VeiculoAutomotor{

    public static final double TAXA_VALOR_MERCADO = 0.04;
    public static final double TAXA_CARRO_ANTIGO = 0.05;

    public CarroParticular(String modelo, double valorMercado, int anoFabricacao) {
        super(modelo, valorMercado, anoFabricacao);
    }

    @Override
    public double calcularValorPremio() {
        double premio = getValorMercado() * TAXA_VALOR_MERCADO;

        if(getAnoFabricacao() < 2000){
            premio += (getValorMercado() * TAXA_CARRO_ANTIGO);
        }
        return premio;
    }

    @Override
    public String descrever() {
        return "Carro do modelo: "+ getModelo() + " Ano fabricacao "+ getAnoFabricacao() + " Valor de mercado R$" + getValorMercado();
    }
}
