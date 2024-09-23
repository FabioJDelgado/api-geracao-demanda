package com.faculdade.apigeracaodemanda.mapper;

import com.faculdade.apigeracaodemanda.dtos.JogadaRegistroRequestDto;
import com.faculdade.apigeracaodemanda.dtos.JogadaRegistroResponseDto;
import com.faculdade.apigeracaodemanda.models.Jogada;
import com.faculdade.apigeracaodemanda.models.enums.TamanhoEstabelecimento;

public class JogadaMapper {

    public static Jogada toJogadaRegistro(JogadaRegistroRequestDto jogadaRegistroRequestDto){
        Jogada jogada = new Jogada();

        jogada.setIdentificacaoJogada(jogadaRegistroRequestDto.identificacaoJogada());

        jogada.setPreco(jogadaRegistroRequestDto.preco());
        jogada.setInvestimentoPropagandaRadio(jogadaRegistroRequestDto.investimentoPropagandaRadio());
        jogada.setInvestimentoPropagandaJornal(jogadaRegistroRequestDto.investimentoPropagandaJornal());
        jogada.setInvestimentoPropagandaTV(jogadaRegistroRequestDto.investimentoPropagandaTV());
        jogada.setInvestimentoPropagandaInternet(jogadaRegistroRequestDto.investimentoPropagandaInternet());

        jogada.setQtdProdutosEstoqueFornecedor1(jogadaRegistroRequestDto.qtdProdutosEstoqueFornecedor1());
        jogada.setQtdProdutosEstoqueFornecedor2(jogadaRegistroRequestDto.qtdProdutosEstoqueFornecedor2());
        jogada.setQtdProdutosEstoqueFornecedor3(jogadaRegistroRequestDto.qtdProdutosEstoqueFornecedor3());

        jogada.setTamanhoEstabelecimento(TamanhoEstabelecimento.toEnum(jogadaRegistroRequestDto.tamanhoEstabelecimento()));
        jogada.setQtdCaixas(jogadaRegistroRequestDto.qtdCaixas());
        jogada.setQtdFuncionarios(jogadaRegistroRequestDto.qtdFuncionarios());

        return jogada;
    }

    public static JogadaRegistroResponseDto toJogadaRegistroResponseDto(Jogada jogada){
        return new JogadaRegistroResponseDto(
                jogada.getIdentificacaoJogada(),
                jogada.getDemandaTotalJogada()
        );
    }
}
