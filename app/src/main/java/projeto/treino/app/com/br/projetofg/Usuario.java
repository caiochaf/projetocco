package projeto.treino.app.com.br.projetofg;

import java.util.Date;

/**
 * Created by Caio on 17/11/2015.
 */
public class Usuario {
    private String NOME;
    private String SENHA;
    private String CPF;
    private Date DATA;
    private String SEXO;
    private String TELEFONE;
    private String MAIL;
    private String TP_SANGUE;
    private String FATOR_RH;
    private String PLANO;
    private String NUMERO_CARTEIRA;

    public String getNOME() { return NOME; }

    public void setNOME(String NOME) {
        this.NOME = NOME;
    }

    public String getSENHA() {
        return SENHA;
    }

    public void setSENHA(String SENHA) {
        this.SENHA = SENHA;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getSEXO() {
        return SEXO;
    }

    public void setSEXO(String SEXO) {
        this.SEXO = SEXO;
    }

    public String getTELEFONE() {
        return TELEFONE;
    }

    public void setTELEFONE(String TELEFONE) {
        this.TELEFONE = TELEFONE;
    }

    public String getMAIL() {
        return MAIL;
    }

    public void setMAIL(String MAIL) {
        this.MAIL = MAIL;
    }

    public String getTP_SANGUE() {
        return TP_SANGUE;
    }

    public void setTP_SANGUE(String TP_SANGUE) {
        this.TP_SANGUE = TP_SANGUE;
    }

    public String getFATOR_RH() {
        return FATOR_RH;
    }

    public void setFATOR_RH(String FATOR_RH) {
        this.FATOR_RH = FATOR_RH;
    }

    public String getPLANO() {
        return PLANO;
    }

    public void setPLANO(String PLANO) {
        this.PLANO = PLANO;
    }

    public String getNUMERO_CARTEIRA() {
        return NUMERO_CARTEIRA;
    }

    public void setNUMERO_CARTEIRA(String NUMERO_CARTEIRA) {
        this.NUMERO_CARTEIRA = NUMERO_CARTEIRA;
    }

    public Date getDATA() {
        return DATA;
    }

    public void setDATA(Date DATA) {
        this.DATA = DATA;
    }


}
