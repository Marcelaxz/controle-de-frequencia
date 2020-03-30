package br.mack.ps2;

import java.sql.*;

public class Consultar {

    public void consulta() throws Exception{

        Connection conn = null;

        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

        String db = "chamada";
        String url = "jdbc:mysql://192.168.99.100:32777/" + db;
        String user = "root";
        String psw = "root";

        conn = DriverManager.getConnection(url, user, psw);

        String sql = "SELECT * FROM registro";

        PreparedStatement pstm = conn.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();

        while(rs.next()){
            String tia = rs.getString("tia");
            String h_entrada = rs.getString("h_entrada");
            String h_saida = rs.getString("h_saida");
            int idregistro = rs.getInt("idregistro");
            System.out.println("\nRegistro #" + idregistro + "\nTIA: " + tia + "\nHorário de Entrada: " + h_entrada + "\nHorário de Saída: " + h_saida);
        }
        rs.close();
        conn.close();

    }

}
