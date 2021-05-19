package com.guiabolsomockapi.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.guiabolsomockapi.model.TransacoesDTO;
import com.guiabolsomockapi.service.TransacoesService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class TransacoesServiceImpl implements TransacoesService {

    HttpHeaders responseHeaders = new HttpHeaders();

    @Override
    public ResponseEntity<String> getTransacoes(int id, int ano, int mes) {
        responseHeaders.set("Content-Type", "application/json");
        try {
            TransacoesDTO dto = new TransacoesDTO(id, ano, mes);
            ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
            String json = ow.writeValueAsString(dto);

            return ResponseEntity.ok()
                    .headers(this.responseHeaders)
                    .body(json);
        }catch (Exception e){
            return  ResponseEntity.badRequest()
                    .body(e.getMessage());
        }


    }
}
