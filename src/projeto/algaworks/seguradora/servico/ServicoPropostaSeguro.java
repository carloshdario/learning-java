package projeto.algaworks.seguradora.servico;

import projeto.algaworks.seguradora.modelo.BemSeguravel;

public class ServicoPropostaSeguro {

    public void emitir(BemSeguravel bemSeguravel){
        System.out.println("=== Emitindo Proposta de Seguro ===");
        System.out.println(bemSeguravel.descrever());
        System.out.printf("Valor do prêmio: R$ %.2f%n", bemSeguravel.calcularValorPremio());

    }
}
