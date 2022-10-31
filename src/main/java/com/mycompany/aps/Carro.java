package com.mycompany.aps;
public class Carro extends Automovel{
    
    Carro(String nome, String marca, String cor){
        this.rodas = 4;
        this.combustivel = true;
        this.tipo = "CARRO";
        this.nome = nome.toUpperCase();
        this.marca = marca.toUpperCase();
        this.cor = cor.toUpperCase();       
    }
    
    @Override
    public void Empinar(){
        System.out.println("[X] NÃO É POSSÍVEL EMPINAR DE CARRO ! ");
    }
}
