
package Repositorio;

import java.util.List;
import modelos.Venda_de_Passagem;
import java.util.ArrayList;

public class RepositorioPassagens {
    private List<Venda_de_Passagem> listaPassagens;
    
    public RepositorioPassagens(){
        listaPassagens = new ArrayList<Venda_de_Passagem>();
    }
    
    public boolean addVendaPassagem(Venda_de_Passagem passagem){
        return (listaPassagens.add(passagem));
    }
    
    public List<Venda_de_Passagem>getListaPassagens(){
        return listaPassagens;
    }
    
    public boolean passagemExiste(int codigo){
        for (Venda_de_Passagem listaPassagem : listaPassagens) {
            if(listaPassagem.getCodigo()==codigo){
                return true;
            }
        }
        return false;
    }
    
    public Venda_de_Passagem buscaPassagem(int codigo){
        for (Venda_de_Passagem listaPassagem : listaPassagens) {
            if(listaPassagem.getCodigo()==codigo){
                return listaPassagem;
            }            
        }
        return null;
    }
    
    public Venda_de_Passagem buscaPassagemPorCliente(String RG){
        for (Venda_de_Passagem listaPassagem : listaPassagens) {
            if(listaPassagem.getCliente().getRG().equalsIgnoreCase(RG)){
                return listaPassagem;
            }            
        }
        return null;
    }
}
