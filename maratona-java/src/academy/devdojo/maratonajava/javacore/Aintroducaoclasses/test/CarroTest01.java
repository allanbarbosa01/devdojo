package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        carro1.Nome = "Honda";
        carro1.Modelo = "Civic";
        carro1.ano = 2005;

        carro2.Nome = "Mitsubishi";
        carro2.Modelo = "Lancer";
        carro2.ano = 2022;
        
        System.out.println("Nome: " + carro1.Nome + " Modelo: " + carro1.Modelo + " Ano: " + carro1.ano);
        System.out.println("Nome: " + carro2.Nome + " Modelo: " + carro2.Modelo + " Ano: " + carro2.ano);
    }
}
