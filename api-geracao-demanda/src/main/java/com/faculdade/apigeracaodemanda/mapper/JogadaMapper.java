package com.faculdade.apigeracaodemanda.mapper;

import com.faculdade.apigeracaodemanda.dtos.JogadaRegistroRequestDto;
import com.faculdade.apigeracaodemanda.dtos.JogadaRegistroResponseDto;
import com.faculdade.apigeracaodemanda.models.Jogada;

public class JogadaMapper {

    public static Jogada toJogadaRegistro(JogadaRegistroRequestDto jogadaRegistroRequestDto){
        Jogada jogada = new Jogada();
        jogada.setIdentificacaoJogada(jogadaRegistroRequestDto.identificacaoJogada());
//        jogada.setInvestimentoPropagandaRadio(jogadaRegistroRequestDto.investimentoPropagandaRadio());
//        jogada.setInvestimentoPropagandaJornal(jogadaRegistroRequestDto.investimentoPropagandaJornal());
//        jogada.setInvestimentoPropagandaTV(jogadaRegistroRequestDto.investimentoPropagandaTV());
//        jogada.setInvestimentoPropagandaInternet(jogadaRegistroRequestDto.investimentoPropagandaInternet());
//        jogada.setQtdProdutosFornecedor1(jogadaRegistroRequestDto.qtdProdutosFornecedor1());
//        jogada.setQtdProdutosFornecedor2(jogadaRegistroRequestDto.qtdProdutosFornecedor2());
//        jogada.setQtdProdutosFornecedor3(jogadaRegistroRequestDto.qtdProdutosFornecedor3());
        jogada.setPreco(jogadaRegistroRequestDto.preco());
//        jogada.setCapacidadeInstalada(CapacidadeInstalada.toEnum(jogadaRegistroRequestDto.capacidadeInstalada()));
        return jogada;
    }

    public static JogadaRegistroResponseDto toJogadaRegistroResponseDto(Jogada jogada){
        return new JogadaRegistroResponseDto(
                jogada.getIdentificacaoJogada(),
                jogada.getDemandaTotalJogada()
        );
    }
}
