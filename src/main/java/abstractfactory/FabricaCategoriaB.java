package abstractfactory;

public class FabricaCategoriaB implements FabricaAbstrata {

    @Override
    public Veiculo createVeiculo(){
        return new VeiculoCarro();
    }

    @Override
    public CNH createCNH() {
        return new CNHB();
    }
}
