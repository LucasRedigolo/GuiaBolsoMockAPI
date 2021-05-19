package com.guiabolsomockapi.util;

public class ParamValidator {

    public void validateId(int id) {
        if (id < 1000 || id > 100000) {
            throw new IllegalArgumentException("id fora do range de 1.000 a 100.000");
        }
    }

    public void validateMes(int mes) {
        if (mes > 12 || mes < 1) {
            throw new IllegalArgumentException("mes fora do range de 1 a 12");
        }
    }

    public void validate(int id, int mes){
        validateId(id);
        validateMes(mes);
    }

}
