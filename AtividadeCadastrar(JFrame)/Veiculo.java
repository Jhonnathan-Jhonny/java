package com.mycompany.projetocadastro;

import javax.swing.JOptionPane;

public class Veiculo implements Veiculo_IF{
    private String marca;
    private String modelo;
    private String ano;
    private String cor;

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getAno() {
        return ano;
    }

    public String getCor() {
        return cor;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public void cadastrarVeiculo() {
        JOptionPane.showMessageDialog(null, "Classe Pessoa");
    }
}
