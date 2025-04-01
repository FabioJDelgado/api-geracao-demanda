package com.faculdade.apigeracaodemanda.controllers;

import com.faculdade.apigeracaodemanda.dtos.PartidaRegistroRodadaResponseDto;
import com.faculdade.apigeracaodemanda.dtos.RodadaRegistroResquestDto;
import com.faculdade.apigeracaodemanda.services.RodadaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/rodada")
public class RodadaController {

    @Autowired
    private RodadaService rodadaService;

    @PostMapping("/registrarRodada")
    public ResponseEntity<PartidaRegistroRodadaResponseDto> registrarRodada(@RequestBody @Valid RodadaRegistroResquestDto rodadaRegistroResquestDto){
        return ResponseEntity.ok(rodadaService.registrarRodada(rodadaRegistroResquestDto));
    }
}
