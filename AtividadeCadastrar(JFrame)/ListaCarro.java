package com.mycompany.projetocadastro;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ListaCarro {
    ArrayList<Carro> listaCarros = new ArrayList<Carro>();

    public ArrayList<Carro> getListaCarros() {
        return listaCarros;
    }

    public void setListaCarros(Carro carro) {
        if(listaCarros.add(carro)){
            JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso.");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao Cadastar");
        }
    }
  
}
