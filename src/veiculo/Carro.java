package veiculo;

import java.util.Scanner;

public class Carro {

    String marca;
    String modelo;
    boolean ligado; 

  
    public void Ligar() {
        if (ligado) {
            System.out.println("O veículo já está ligado!");
        } else {
            ligado = true;
            System.out.println("Veículo ligado! \nStatus atual do veículo: Ligado");
        }
    }

    public void Desligar() {
        if (!ligado) {
            System.out.println("O veículo já está desligado!");
        } else {
            ligado = false;
            System.out.println("Veículo desligado! \nStatus atual do veículo: Desligado");
        }
    }


    public void Status() {
        System.out.println("\nMarca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ligado: " + (ligado ? "Sim" : "Não"));
    }

    public void Escolha() {
        Scanner sc = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("\nEscolha uma das opções digitando o número referente:");
            System.out.println("1) Ligar");
            System.out.println("2) Desligar");
            System.out.println("0) Sair");
            System.out.print("Digite: ");
            escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    Ligar();
                    break;
                case 2:
                    Desligar();
                    break;
                case 0:
                    System.out.println("Sistema encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

            Status();

        } while (escolha != 0);

        sc.close();
    }
}