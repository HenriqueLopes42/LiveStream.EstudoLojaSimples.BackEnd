package com.EstudoDeCasa.Estudo;

import java.util.List;

public class Message {

    private String msg;
    private List<String> erros;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<String> getErros() {
        return erros;
    }

    public void setErros(List<String> erros) {
        this.erros = erros;
    }
}
