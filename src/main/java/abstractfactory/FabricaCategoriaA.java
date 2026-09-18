package abstractfactory;

public class FabricaCategoriaA implements FabricaAbstrata{

    @Override
    public Veiculo createVeiculo(){
        return new VeiculoMoto();
    }

    @Override
    public CNH createCNH() {
        return new CNHA();
    }
}
