package com.mycompany.aps;

import java.util.ArrayList;
import java.util.List;

public class Garagem {
    List<Carro> carros = new ArrayList<>();
    List<Moto> motos = new ArrayList<>();
    
    private String linha = "-".repeat(72);
    private boolean temCarro = false;
    private boolean temMoto = false;
    
    Garagem(List<Carro> carros, List<Moto> motos) {
        if ( !carros.isEmpty() ) {
            this.carros = carros;
            this.temCarro = true;
        }
        else
            System.out.println("[X] VOCÊ NÃO POSSUI CARRO(S) !");
        
        if ( !motos.isEmpty() ) {
            this.motos = motos;
            this.temMoto = true;
        }
        else
            System.out.println("[X] VOCÊ NÃO POSSUI MOTO(S) !");
        
    }
    
    public void VerGaragem(){
        System.out.println("\n"+ linha);
        if( this.temCarro || this.temMoto ) {
            if(this.temCarro){
                
                System.out.println("\n" + linha + "\n[+] TOTAL DE CARRO(S): " + this.carros.size());
                System.out.println(linha);
                System.out.println(String.format("%-20s %-25s %-20s\n%s",
                        "NOME", "MARCA", "COR", linha));
                for( Carro carro : this.carros ){
                    System.out.println(String.format("%-20s %-25s %-20s",
                        carro.nome, carro.marca, carro.cor));
                }
                System.out.println(linha);
            }
            if(this.temMoto){
                System.out.println("\n" + linha + "\n[+] TOTAL DE MOTO(S): " + this.motos.size());
                System.out.println(linha);
                System.out.println(String.format("%-20s %-25s %-20s\n%s",
                        "NOME", "MARCA", "COR", linha));
                for( Moto moto : this.motos ){
                    System.out.println(String.format("%-20s %-25s %-20s",
                        moto.nome, moto.marca, moto.cor));
                }
                System.out.println(linha);
            }
        }      
        else {
            System.out.println("[X] VOCÊ NÃO POSSUÍ AUTOMOVÉIS !\n"+ linha + "\n");
        }
    }
}
