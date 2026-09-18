package abstractfactory;

public class Pessoa {

    private CNH cnh;
    private Veiculo veiculo;

    public Pessoa (FabricaAbstrata fabrica) {
        this.veiculo = fabrica.createVeiculo();
        this.cnh = fabrica.createCNH();
    }

    public String possuirCNH() { return this.cnh.possuir();}

    public String possuirVeiculo() { return this.veiculo.possuir();}
}
