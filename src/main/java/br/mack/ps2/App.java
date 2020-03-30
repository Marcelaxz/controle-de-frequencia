package br.mack.ps2;

import java.sql.*;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        Connection conn = null;

        try{
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
                int idregistro = rs.getInt("idregistro");
                String tia = rs.getString("tia");
                Time h_entrada = rs.getTime("h_entrada");
                Time h_saida = rs.getTime("h_saida");
                System.out.println("Registro: " + idregistro + "\nTia: " + tia + "\nHorário de Entrada: " + h_entrada + "\nHorário de Saída: " + h_saida);

            }
            rs.close();
            conn.close();

        }catch(IllegalAccessException e){
            System.out.println("IllegalAcessException");
            e.printStackTrace();
        } catch(InstantiationException e){
            System.out.println("InstantiationException");
            e.printStackTrace();
        }catch(ClassNotFoundException e) {
            System.out.println("ClassNotFoundException");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("SQLException");
            e.printStackTrace();
        }
    }
}