/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menus;

/**
 *
 * @author kako__000
 */
public class MenuPrincipal {
    public static final int OP_Menu_Cliente = 1;
    public static final int OP_Menu_Avioes = 2;
    public static final int OP_Menu_Voo = 3;
    public static final int OP_Menu_Passagens = 4;
    public static final int OP_Menu_Relatorios = 5;
    public static final int OP_SAIR = 0;
    
    public static void mostrarMenu(){
        System.out.println("\n--------------------------------------\n"
                + "1- Menu Cliente\n"
                + "2- Menu Aviões\n"
                + "3- Menu Vôo\n"
                + "4- Menu de Venda de Passagem\n"
                + "5- Relatório de Venda\n"
                + "0- Sair da Aplicação"
                + "\n--------------------------------------");
    }
    
}
