package br.com.feltex.lombok;

import br.com.feltex.lombok.modelo.Veiculo;
import br.com.feltex.lombok.modelo.VeiculoComLombok;

public class CriaObjeto {

    public static void main(String[] args) {

        var veiculo = new Veiculo("BRL-2022", "Fusca","VW",2000, "verde");
        System.out.println(veiculo);

        var veiculoComLombok01 = new VeiculoComLombok();

        var veiculoComLombok = new VeiculoComLombok("BRL-444","Uno","Fiat",2020,"Vermelho");
        System.out.println(veiculoComLombok);

        var carro = Carro.builder()
                .placa("BRL-777")
                .modelo("Ferrari")
                .build();

        System.out.println(carro);
    }
}
