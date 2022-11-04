package com.mycompany.aps;
import java.util.ArrayList;
import java.util.List;
public class APS {

    public static void main(String[] args) {
        // Criando os colletctions que iram receber os objetos
        List<Carro> carros = new ArrayList<>();
        List<Moto> motos = new ArrayList<>();
        
        // Crinado os objetos carro
        Carro ModelS = new Carro("Model S", "Tesla", "Vermelho");
        Carro Astra = new Carro("Astra", "Chevrolet", "Prata");
      
        // Crinado os objetos moto
        Moto Fazer = new Moto("Fazer", "Yamaha", "Azul");       
        Moto Titan = new Moto("Titan", "Honda", "Cinza");
        
        // Adicionando os objetos nas coletions
        carros.add(ModelS);
        carros.add(Astra);

        motos.add(Fazer);
        motos.add(Titan);    
        
        Garagem minhaGaragem = new Garagem(carros, motos);
        minhaGaragem.VerGaragem();
        
    }
}
