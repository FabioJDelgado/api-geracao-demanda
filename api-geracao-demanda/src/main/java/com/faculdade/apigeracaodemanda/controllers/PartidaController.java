package com.faculdade.apigeracaodemanda.controllers;

import com.faculdade.apigeracaodemanda.dtos.PartidaCadastroRequestDto;
import com.faculdade.apigeracaodemanda.dtos.PartidaCadastroResponseDto;
import com.faculdade.apigeracaodemanda.services.PartidaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/partida")
@Tag(name = "Cadastrar Partida")
public class PartidaController {

    @Autowired
    PartidaService partidaService;

    @Operation(description = "Cadastrar uma nova partida")
    @PostMapping("/cadastrar")
    public ResponseEntity<PartidaCadastroResponseDto> cadastrarPartida(@RequestBody @Valid PartidaCadastroRequestDto partidaCadastroRequestDto) {
        return ResponseEntity.ok(partidaService.cadastrarPartida(partidaCadastroRequestDto));
    }
}
