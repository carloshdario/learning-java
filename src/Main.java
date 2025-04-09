import projeto.algaworks.seguradora.modelo.BemSeguravel;
import projeto.algaworks.seguradora.modelo.Caminhao;
import projeto.algaworks.seguradora.modelo.CarroParticular;
import projeto.algaworks.seguradora.modelo.ImovelResidencial;
import projeto.algaworks.seguradora.servico.ServicoPropostaSeguro;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ServicoPropostaSeguro servico = new ServicoPropostaSeguro();


        BemSeguravel carro = new CarroParticular("Civic", 200000, 2025);
        BemSeguravel caminhao = new Caminhao("Scania", 120000, 2015, 4);
        BemSeguravel imovel = new ImovelResidencial(2_300_000, 320);


        servico.emitir(carro);
        servico.emitir(caminhao);
        servico.emitir(imovel);
    }
}