package com.mycompany.aps;
public class Carro extends Automovel implements Acoes{
    private boolean abastecido = false;
    private boolean portaMala = false;
    
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
    public void Abastecer(){
        if(this.abastecido) {
            System.out.println("[X] JÁ FOI ABASTECIDO");
            return;
        }
        this.abastecido = true;
        System.out.println("[+] CARRO ABASTECIDA");
    }
    public void FecharPortaMala(){
        if(this.portaMala) {
            this.portaMala = false;
            System.out.println("[+] PORTA MALA FECHADO");
            return;
        }
        System.out.println("[X] PORTA MALA JÁ ESTÁ FECHADO");
    }
    public void AbrirPortaMala(){
        if(!this.portaMala) {
            this.portaMala = true;
            System.out.println("[+] PORTA MALA ABERTO");
            return;
        }
        System.out.println("[X] PORTA MALA JÁ ESTÁ ABERTO");
    }
}
