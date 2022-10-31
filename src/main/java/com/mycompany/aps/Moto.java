package com.mycompany.aps;
public class Moto extends Automovel {
    Moto(String nome, String marca, String cor){
        this.rodas = 2;
        this.combustivel = true;
        this.tipo = "MOTO";
        this.nome = nome.toUpperCase();
        this.marca = marca.toUpperCase();
        this.cor = cor.toUpperCase();       
    }
}
