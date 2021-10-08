package application;

import entities.Aluguel;
import entities.Carro;
import entities.Moto;
import entities.Pessoa;
import entities.Veiculos;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Veiculos veiculos = new Veiculos();
        Aluguel aluguel = new Aluguel();
        Carro carro;
        Moto moto;

        System.out.println("Para alugar um de nossos veiculos digite: Nome, Idade e seu CPF.");
        ArrayList <Pessoa> clientes = new ArrayList<>();
        Pessoa cliente1 = new Pessoa();
        System.out.print("Nome: ");
        String nome = sc.next();
        System.out.print("Idade: ");
        int idade = sc.nextInt();
        System.out.print("CPF: ");
        String cpf = sc.next();
        System.out.println();



        System.out.println("Qual veiculo você deseja alugar? Digite 1- Para Carro ou 2- Para Moto");
        int escolha = sc.nextInt();
        switch (escolha){
            case 1:
                    carro = new Carro ();
                    carro.setQntPessoas(5);

                    System.out.println("Os carros da empresa são seguros e confortaveis.\n" +
                        "Na versão de luxo tem alguns acessorios a mais como ar condicionado, freio abs," +
                        "e porta malas grande.");
                    System.out.println();
                    System.out.println("Escolha uma versão:");
                    System.out.println("Digite o numero 1 - Para carro de luxo");
                    System.out.println("Digite o numero 2 - Para carro de comum");
                    int luxoOuComum = sc.nextInt();
                    switch (luxoOuComum){
                        case 1:
                                carro.setAibag("Possui");
                                carro.setAbs("Possui");
                                carro.setAr("Possui");
                                carro.setPortamalas("Grande até 4 malas");

                                System.out.println("Na categoria de luxo temos as marcas e modelos a seguir:");
                                System.out.println();
                                System.out.println("Volkswagen - Virtus");
                                System.out.println("Volkswagen - Nivus");
                                System.out.println("Fiat - Cronos");
                                System.out.println("Renaut - Duster");
                                System.out.println("Toyota - Etios");
                                System.out.println("Hyundai - HB20S");
                                System.out.println();
                                System.out.println("Digite a marca e o modelo do veiculo: ");
                                System.out.print("Digite a marca desejada: ");
                                carro.setMarca(sc.next());
                                System.out.print("Digite o modelo desejado: ");
                                carro.setModelo(sc.next());
                                System.out.println();
                                System.out.println("O carro escolhido foi: " + carro.toString());
                                System.out.println();
                                System.out.print("A diaria dos carros de luxo são R$100,00. \nQuantos dias você deseja utilizar o veiculo? ");
                                aluguel.setDia(sc.nextInt());
                                aluguel.setCustoPdia(100.00);
                                System.out.println();
                                System.out.println("O valor do serviço fica em : R$" + aluguel.calc());
                                break;
                        case 2:
                            carro.setAibag("Não Possui");
                            carro.setAbs("Não Possui");
                            carro.setAr("Não Possui");
                            carro.setPortamalas("Pequeno até 2 malas");

                            System.out.println("Na categoria de carros comuns temos as marcas e modelos a seguir:");
                            System.out.println();
                            System.out.println("Volkswagen - Gol");
                            System.out.println("Fiat - Uno");
                            System.out.println("Fiat - Argo");
                            System.out.println("Renaut - Kiwid");
                            System.out.println("Hyundai - HB20");
                            System.out.println();
                            System.out.println("Digite a marca e o modelo do veiculo: ");
                            System.out.print("Digite a marca desejada: ");
                            carro.setMarca(sc.next());
                            System.out.print("Digite o modelo desejado: ");
                            carro.setModelo(sc.next());
                            System.out.println();
                            System.out.println("O carro escolhido foi: " + carro.toString());
                            System.out.println();
                            System.out.print("A diaria dos carros de luxo são R$70,00. \nQuantos dias você deseja utilizar o veiculo? ");
                            aluguel.setDia(sc.nextInt());
                            aluguel.setCustoPdia(70.00);
                            System.out.println();
                            System.out.println("O valor do serviço fica em : R$" + aluguel.calc());
                            break;
                    }
                    break;
            case 2:

                moto = new Moto();

                moto.setQntPessoas(2);
                System.out.println("Na categoria de motos temos as marcas e modelos a seguir:");
                System.out.println();
                System.out.println("Honda - CB 500");
                System.out.println("Honda  - CB 150");
                System.out.println("Yamaha - Lander 250");
                System.out.println("Yamaha  - Factor 150");
                System.out.println();
                System.out.println("Digite a marca e o modelo do veiculo: ");
                System.out.print("Digite a marca desejada: ");
                moto.setMarca(sc.next());
                System.out.print("Digite o modelo desejado: ");
                moto.setModelo(sc.next());
                System.out.println();
                System.out.println("Deseja quantos capacetes? ");
                moto.setCapacete(sc.nextInt());
                System.out.println();
                System.out.println("A moto escolhida foi: " + moto.toString());
                System.out.println();
                System.out.print("A diaria de moto são R$15,00. \nQuantos dias você deseja utilizar o veiculo? ");
                aluguel.setDia(sc.nextInt());
                aluguel.setCustoPdia(15.00);
                System.out.println();
                System.out.println("O valor do serviço fica em : R$" + aluguel.calc());
                break;

        }
    }
}
