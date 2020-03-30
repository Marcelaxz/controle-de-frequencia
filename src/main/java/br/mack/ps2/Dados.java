package br.mack.ps2;
import java.sql.*;

public class Dados {
    private String tia;
    private String h_entrada;
    private String h_saida;


    public void setTia(String tia) {
        this.tia = tia;
    }

    public String getTia() {
        return tia;
    }

    public void setH_entrada(String h_entrada) {
        this.h_entrada = h_entrada;
    }

    public String getH_entrada() {
        return h_entrada;
    }

    public void setH_saida(String h_saida) {
        this.h_saida = h_saida;
    }

    public String getH_saida() {
        return h_saida;
    }
}
