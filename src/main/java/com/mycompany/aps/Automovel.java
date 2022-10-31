
package com.mycompany.aps;
public abstract class Automovel extends Veiculo {    
    protected int rodas;
    protected boolean combustivel;
    private int velocidade = 0;
    
    protected void Andar(){
        this.velocidade += 5;
        System.out.println("[+] " + this.nome.toUpperCase() + " EM MOVIMENTO ...");
        System.out.println("[+] VELOCIDADE: " + this.velocidade + "KM/H");
    }
    protected void Frear(){
        this.velocidade = 0;
        System.out.println("[+] " + this.nome.toUpperCase() + " PARADO !");
    }
    protected void Estacionar(){
        System.out.println("[-] ESTACIONANDO...");
        this.Frear();
        System.out.println("[+] ESTACIONADO");
        
    }
    protected void Empinar(){
        if( this.velocidade == 0 ) {
            System.out.println("[X] É NECESÁRIO ESTAR EM MOVIMENTO");
            return;
        }        
        System.out.println("[+] EMPINANDO !");
    }
}

