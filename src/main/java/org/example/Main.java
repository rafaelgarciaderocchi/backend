package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World! Beautiful 👍");
        exercicio01();
        exercicio02();
        exercicio04();
    }

    static void exercicio01() {
        //Cria um scanner na memória
        Scanner test = new Scanner(System.in);

        //Peço para o usuário digitar seu nome
        System.out.println("Name: ");

        //Leio o nome e gravo numa variável
        String name = test.nextLine();

        String message = "Hello World retry! My name is ".concat(name);
        System.out.println(message);
    }

    static void exercicio02() {
        String name = "Mariana Silva";
        String cargo = "Analista de sistemas";
        Double salario = 4500.00;

        System.out.println("Nome: ".concat(name));
        System.out.println("Cargo: ".concat(cargo));
        System.out.println("Salário: " + salario);
    }

    static void exercicio04() {
        Scanner leitor = new Scanner(System.in);
        Double valorCompra;

        System.out.println("Digite o valor da compra: ");
        valorCompra = leitor.nextDouble();

        if(valorCompra > 100) {
            System.out.println("Preço final: " + (valorCompra * 0.9));
        } else {
            System.out.println("Preço final: " + valorCompra);
        }
    }
}