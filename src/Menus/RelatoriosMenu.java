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
public class RelatoriosMenu {
    public static final int OP_VisualizarPorCliente = 1;
    public static final int OP_VisualizarPorPassageiro = 2;
    public static final int OP_VisualizarPorOrigem = 3;
    public static final int OP_VisualizarPorDestino = 4;
    public static final int OP_VisualizarPorPeriodoDeVoo = 5;
    public static final int OP_SAIR = 0;
    
    public static void mostrarMenu(){
        System.out.println("\n--------------------------------------\n"
                + "1- Visualizar Relatório por Cliente\n"
                + "2- Visualizar Relatório por Passageiro\n"
                + "3- Visualizar Relatório por Origem\n"
                + "4- Visualizar Relatório por Destino\n"
                + "5- Visualizar Relatório por Periodo de Vôo\n"
                + "0- Sair da Aplicação"
                + "\n--------------------------------------");
    }
    
}
