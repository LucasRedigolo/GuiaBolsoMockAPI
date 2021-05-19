package com.guiabolsomockapi.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.guiabolsomockapi.service.TransacoesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransacoesController {

    @Autowired
    TransacoesService transacoesService;

    @GetMapping(path = "{id}/transacoes/{ano}/{mes}")
    public ResponseEntity<String> getTransacoes(@PathVariable(name = "id") int id,
                                        @PathVariable(name = "ano") int ano,
                                        @PathVariable(name = "mes") int mes) throws JsonProcessingException {
        return this.transacoesService.getTransacoes(id, ano, mes);
    }
}
