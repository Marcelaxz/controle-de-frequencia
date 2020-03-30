package br.mack.ps2;

import java.util.Scanner;

public class Menu {
    public static int menu(){
        Scanner input = new Scanner(System.in);
        System.out.println("\n1 - Consultar Registros" +
                "\n2 - Inserir Novo Registro" +
                "\n3 - Sair");
        int op = input.nextInt();
        return op;
    }
}
