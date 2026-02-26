package veiculo;

public class ProjetoVeiculo {

    public static void main(String[] args) {

        Carro objVeiculo = new Carro();

        objVeiculo.marca = "Honda";
        objVeiculo.modelo = "Civic";
        objVeiculo.ligado = false;
        objVeiculo.Status();
        objVeiculo.Escolha();

    }

}
