package br.mack.ps2;

import java.sql.*;

public class App
{
    public static void main( String[] args )
    {
        Menu mn = new Menu();
        int op = mn.menu();
        do{
            switch(op){
                case 1:
                    Consultar c = new Consultar();
                    try{
                        c.consulta();
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    Inserir in = new Inserir();
                    try{
                        in.insert();
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    break;
            } op = mn.menu();
        } while(op!=3);

    }
}