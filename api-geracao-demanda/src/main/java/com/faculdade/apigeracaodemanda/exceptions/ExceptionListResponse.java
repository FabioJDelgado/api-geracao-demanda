package com.faculdade.apigeracaodemanda.exceptions;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class ExceptionListResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    private Date timestamp;
    private int status;
    private String erro;
    private String mensagem;
    private String detalhes;
    private List<ErroInfo> erros = new ArrayList<>();

    public ExceptionListResponse(Date timestamp, int status, String erro, String mensagem, String detalhes, List<ErroInfo> erros) {
        this.timestamp = timestamp;
        this.status = status;
        this.erro = erro;
        this.mensagem = mensagem;
        this.detalhes = detalhes;
        this.erros = erros;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public int getStatus() {
        return status;
    }

    public String getErro() {
        return erro;
    }

    public String getMensagem() {
        return mensagem;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public List<ErroInfo> getErros() {
        return erros;
    }
}
