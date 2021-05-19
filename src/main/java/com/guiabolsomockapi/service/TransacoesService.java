package com.guiabolsomockapi.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.json.JSONObject;
import org.springframework.http.ResponseEntity;

import javax.servlet.http.HttpServletResponse;

public interface TransacoesService {

    ResponseEntity<String> getTransacoes(int id, int ano, int mes) throws JsonProcessingException;

}
