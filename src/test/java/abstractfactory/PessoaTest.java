package abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PessoaTest {

    @Test
    void devePossuirCNHA() {
        FabricaAbstrata fabrica = new FabricaCategoriaA();
        Pessoa pessoa = new Pessoa(fabrica);
        assertEquals("Possui CNH A", pessoa.possuirCNH());
    }

    @Test
    void devePossuirCNHB() {
        FabricaAbstrata fabrica = new FabricaCategoriaB();
        Pessoa pessoa = new Pessoa(fabrica);
        assertEquals("Possui CNH B", pessoa.possuirCNH());
    }

    @Test
    void devePossuirVeiculoMoto() {
        FabricaAbstrata fabrica = new FabricaCategoriaA();
        Pessoa pessoa = new Pessoa(fabrica);
        assertEquals("Possui moto", pessoa.possuirVeiculo());
    }

    @Test
    void deveDevePossuirVeiculoCarro() {
        FabricaAbstrata fabrica = new FabricaCategoriaB();
        Pessoa pessoa = new Pessoa(fabrica);
        assertEquals("Possui carro", pessoa.possuirVeiculo());
    }

}