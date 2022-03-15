package br.com.feltex.lombok;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class Carro {

    private String placa;
    private String modelo;
}
