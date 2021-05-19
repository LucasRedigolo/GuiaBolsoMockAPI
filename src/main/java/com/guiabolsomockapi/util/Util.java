package com.guiabolsomockapi.util;

public class Util {

    private String lorem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque ullamcorper vestibulum risus eget interdum. Maecenas in enim ex. In congue ligula ac enim porttitor commodo. In hac habitasse platea dictumst";

    public int getFirstDigit(int inteiro) {
        return Integer.parseInt(Integer.toString(inteiro).substring(0, 1));
    }

    public String descricaoBuilder(int quantidadeChar){

        if((quantidadeChar % 2) != 0){
            quantidadeChar = quantidadeChar-1;
        }

        return lorem.substring(0, quantidadeChar);
    }
}
