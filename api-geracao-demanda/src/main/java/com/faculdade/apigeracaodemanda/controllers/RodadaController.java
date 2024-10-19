package com.faculdade.apigeracaodemanda.controllers;

import com.faculdade.apigeracaodemanda.dtos.PartidaRegistroRodadaResponseDto;
import com.faculdade.apigeracaodemanda.dtos.RodadaRegistroResquestDto;
import com.faculdade.apigeracaodemanda.services.RodadaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/rodada")
@Tag(name = "Realizar Rodada")
public class RodadaController {

    @Autowired
    private RodadaService rodadaService;

    @Operation(description = "Realizar uma nova rodada")
    @PostMapping("/registrarRodada")
    public ResponseEntity<PartidaRegistroRodadaResponseDto> registrarRodada(@RequestBody @Valid RodadaRegistroResquestDto rodadaRegistroResquestDto){
        return ResponseEntity.ok(rodadaService.registrarRodada(rodadaRegistroResquestDto));
    }
}
