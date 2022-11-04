package com.mycompany.aps;
public class Moto extends Automovel implements Acoes {
    private boolean abastecido = false;
    
    Moto(String nome, String marca, String cor){
        this.rodas = 2;
        this.combustivel = true;
        this.tipo = "MOTO";
        this.nome = nome.toUpperCase();
        this.marca = marca.toUpperCase();
        this.cor = cor.toUpperCase();       
    }
    public void Abastecer(){
        if(this.abastecido) {
            System.out.println("[X] JÁ FOI ABASTECIDO");
            return;
        }
        this.abastecido = true;
        System.out.println("[+] MOTO ABASTECIDA");
    }
    public void FecharPortaMala(){
        System.out.println("[X] NÃO POSSUÍ PORTA MALA");
    }
    public void AbrirPortaMala(){
        System.out.println("[X] NÃO POSSUÍ PORTA MALA");
    }
}
