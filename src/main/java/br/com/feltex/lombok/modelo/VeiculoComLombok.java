package br.com.feltex.lombok.modelo;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VeiculoComLombok {

    private String placa;
    private String modelo;
    private String fabricante;
    private int ano;
    private String cor;
}
