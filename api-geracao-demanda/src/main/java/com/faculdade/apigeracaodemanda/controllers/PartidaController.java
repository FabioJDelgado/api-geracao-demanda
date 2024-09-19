package com.faculdade.apigeracaodemanda.controllers;

import com.faculdade.apigeracaodemanda.dtos.PartidaCadastroRequestDto;
import com.faculdade.apigeracaodemanda.dtos.PartidaCadastroResponseDto;
import com.faculdade.apigeracaodemanda.services.PartidaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/partida")
public class PartidaController {

    @Autowired
    PartidaService partidaService;

    @PostMapping("/cadastrar")
    public ResponseEntity<PartidaCadastroResponseDto> cadastrarPartida(@RequestBody @Valid PartidaCadastroRequestDto partidaCadastroRequestDto) {
        return ResponseEntity.ok(partidaService.cadastrarPartida(partidaCadastroRequestDto));
    }
}
