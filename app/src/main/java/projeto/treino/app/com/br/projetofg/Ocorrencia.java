package projeto.treino.app.com.br.projetofg;

import java.sql.Time;
import java.util.Date;

/**
 * Created by Caio on 08/12/2015.
 */
public class Ocorrencia {
    private String TP_OCORRENCIA;
    private String LOCAL;
    private Time HORA;
    private Date DATA;

    public String getTP_OCORRENCIA() {
        return TP_OCORRENCIA;
    }

    public void setTP_OCORRENCIA(String TP_OCORRENCIA) {
        this.TP_OCORRENCIA = TP_OCORRENCIA;
    }

    public String getLOCAL() {
        return LOCAL;
    }

    public void setLOCAL(String LOCAL) {
        this.LOCAL = LOCAL;
    }

    public Time getHORA() {
        return HORA;
    }

    public void setHORA(Time HORA) {
        this.HORA = HORA;
    }

    public Date getDATA() {
        return DATA;
    }

    public void setDATA(Date DATA) {
        this.DATA = DATA;
    }
}
