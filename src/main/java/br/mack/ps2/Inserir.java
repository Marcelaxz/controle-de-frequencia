package br.mack.ps2;

import java.sql.*;
import java.util.*;

public class Inserir {

    public void insert() throws Exception{

        Scanner input = new Scanner(System.in);

        Connection conn = null;

        Dados d = new Dados();

        System.out.print("TIA: ");
        String tia = input.next();
        d.setTia(tia);
        System.out.print("\nHorário de Entrada: ");
        String h_entrada = input.next();
        d.setH_entrada(h_entrada);
        System.out.print("\nHorário de Saída: ");
        String h_saida = input.next();
        d.setH_saida(h_saida);

        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

        String db = "chamada";
        String url = "jdbc:mysql://192.168.99.100:32777/" + db;
        String user = "root";
        String psw = "root";

        conn = DriverManager.getConnection(url, user, psw);

        String dd = "INSERT INTO registro(tia,h_entrada,h_saida)" + " VALUES(?,?,?)";
        PreparedStatement ds = conn.prepareStatement(dd);

        try{
            ds.setString(1,d.getTia());
            ds.setString(2,d.getH_entrada());
            ds.setString(3,d.getH_saida());
            ds.execute();
        }catch(Exception e){
            e.printStackTrace();
        }
        ds.close();
    }
    }



